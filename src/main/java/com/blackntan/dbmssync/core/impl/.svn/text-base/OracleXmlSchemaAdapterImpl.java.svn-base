package com.blackntan.dbmssync.core.impl;

import com.blackntan.dbmssync.core.DBMSXmlSchemaAdapterI;
import com.blackntan.dbmssync.core.SchemaObjectBeanI;
import com.blackntan.dbmssync.antlr.oracle.TableDDLParser;
import com.blackntan.dbmssync.antlr.oracle.TableDDLLexer;
import com.blackntan.dbmssync.xsd.dbSchemaV1.*;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.antlr.runtime.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: jcolson
 * Date: Jun 30, 2008
 * Time: 9:55:23 PM
 * Oracle implementation of DBMSXmlSchemaAdapterI
 */
public class OracleXmlSchemaAdapterImpl implements DBMSXmlSchemaAdapterI {
  private final String SEMIPHORE = "SEMIPHORE";
  private Logger OUT = Logger.getLogger(this.getClass());
  private Boolean initialized = false;
  private DataSource datasource;
  private static final String fkDdlSql = "select dbms_metadata.get_dependent_ddl( 'REF_CONSTRAINT', u.table_name ) ddl from user_tables u";
  private static final String tableDDLsqlInCorrectOrder = "SELECT DBMS_METADATA.GET_DDL ('TABLE', ut.table_name) ddl, MIN (LEVEL) lvl\n" +
      "FROM   user_tables ut, user_constraints uc\n" +
      "WHERE  ut.table_name = uc.table_name (+)\n" +
      "START WITH  ut.table_name NOT IN \n" +
      "       (SELECT table_name \n" +
      "        FROM   user_constraints\n" +
      "        WHERE  r_constraint_name IS NOT NULL)\n" +
      "CONNECT BY PRIOR uc.constraint_name = uc.r_constraint_name\n" +
      "GROUP  BY ut.table_name \n" +
      "ORDER BY lvl";
  private static final String tableDDLsql = "SELECT DBMS_METADATA.GET_DDL('TABLE',u.table_name) ddl FROM USER_TABLES u";
  private static final String constraintDdlSql = "dbms_metadata.set_transform_param (DBMS_METADATA.SESSION_TRANSFORM, 'CONSTRAINTS_AS_ALTER', \n" +
      "true );\n" +
      "     dbms_metadata.set_transform_param( DBMS_METADATA.SESSION_TRANSFORM, 'STORAGE', false );\n" +
      "     dbms_metadata.set_transform_param( DBMS_METADATA.SESSION_TRANSFORM, 'SQLTERMINATOR', TRUE );\n" +
      "     o_constraint_ddl:=DBMS_METADATA.GET_DDL('CONSTRAINT' ,i_constraint_name)";

  public OracleXmlSchemaAdapterImpl initialize(DataSource dataSource) {
    if (!initialized) {
      synchronized (SEMIPHORE) {
        if (!initialized) {
          //do init
          this.datasource = dataSource;
          initialized = true;
        }
      }
    }
    return this;
  }

  public boolean isSupport(String vendor, int majorVersion, int minorVersion) {
    OUT.debug("checking if I support the database");
    return ("Oracle".equals(vendor) && 10 == majorVersion);
  }

  public boolean isInitialized() {
    return initialized;
  }

  public DBSchemaDocument getRepresentationOfDatabase() {
    return getTableDefinitions();
  }

  public String getDifferentialDDL(ArrayList<SchemaObjectBeanI> from, ArrayList<SchemaObjectBeanI> to) {
    return "";
  }

  private DBSchemaDocument getTableDefinitions() {
    DBSchemaDocument schemaDoc = DBSchemaDocument.Factory.newInstance();
    Connection conn = null;
    try {
      conn = datasource.getConnection();
      OUT.debug("got db conn");
      PreparedStatement pstmt = conn.prepareStatement(tableDDLsqlInCorrectOrder);
      ResultSet rs = pstmt.executeQuery();

      CtDBSchema schema = schemaDoc.addNewDBSchema();
      CtTables tables = schema.addNewTables();
      ArrayList<CtTable> tablesAl = new ArrayList<CtTable>();
      while (rs.next()) {
        String oneDdl = rs.getString(1);
        OUT.debug(oneDdl);
        CtTable table = parseTableDDL(oneDdl);
        tablesAl.add(table);
      }
      CtTable[] tablesA = new CtTable[tablesAl.size()];
      tablesA = tablesAl.toArray(tablesA);
      tables.setTableArray(tablesA);
    } catch (SQLException e) {
      OUT.error("got error getting database ddl", e);
    } finally {
      try {
        conn.close();
      } catch (SQLException e) {
        OUT.error("Could not close connection", e);
      }
    }
    return schemaDoc;
  }

  private CtTable parseTableDDL(String oneDdl) {

    ANTLRStringStream stream = new ANTLRStringStream(oneDdl);
    TableDDLLexer lexer = new TableDDLLexer(stream);
    //stream.consume();
    CommonTokenStream ts = new CommonTokenStream(lexer);
    TableDDLParser parser = new TableDDLParser(ts);
    OUT.debug("Grammer: " + parser.getGrammarFileName());
    CtTable table = null;
    try {
      table = parser.createTable();
/**
      OUT.debug("This is my tablebean!!!: " + table.getSchemaName() + "name: " + table.getObjectName());
      if (table.getColumns() != null) {
        for (CtColumn cb : table.getColumns().getColumnArray()) {
          OUT.debug("this is a column: " + cb.getObjectName());
          OUT.debug("datatype name: " + cb.getDataType().getDataTypeName());
          OUT.debug("datatype size: " + cb.getDataType().getLength() + " : " + cb.getDataType().getPrecision());
        }
      }
 */
    } catch (RecognitionException e) {
      OUT.error("didn't recognize table ddl syntax");
    }
//    for (String tokenName : parser.getTokenNames()) {
//      OUT.debug("token: " + tokenName);
//    }

    return table;
  }
}
