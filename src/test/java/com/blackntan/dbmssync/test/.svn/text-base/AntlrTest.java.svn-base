package com.blackntan.dbmssync.test;

import junit.framework.TestCase;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.XmlString;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.ANTLRFileStream;
import com.blackntan.dbmssync.antlr.TParser;
import com.blackntan.dbmssync.antlr.TLexer;
import com.blackntan.dbmssync.antlr.FigLexer;
import com.blackntan.dbmssync.antlr.FigParser;
import com.blackntan.dbmssync.core.*;
import com.blackntan.dbmssync.Client;
import com.blackntan.dbmssync.xsd.dbSchemaV1.*;

import java.util.List;
import java.util.ResourceBundle;
import java.util.ArrayList;
import java.math.BigInteger;

/**
 * Created by IntelliJ IDEA.
 * User: jcolson
 * Date: Jul 4, 2008
 * Time: 11:57:45 AM
 */

public class AntlrTest extends TestCase {

  private Logger OUT = Logger.getLogger(this.getClass());

  protected void setUp() throws Exception {
  }

  protected void tearDown() throws Exception {
  }

  public void testT() {
    String testString = "public static int test = 5;";
    ANTLRStringStream stream = new ANTLRStringStream(testString);
    TLexer lexer = new TLexer(stream);
    CommonTokenStream ts = new CommonTokenStream(lexer);
    TParser parser = new TParser(ts);
    try {
      parser.def();

    } catch (RecognitionException e) {
      OUT.error("Didn't recognize input", e);
    }

  }

  public void DISABLEtestFig() {
    String string = "Site jguru {\n" +
        "        port = 80;\n" +
        "        answers = \"www.jguru.com\";\n" +
        "        aliases = [\"jguru.com\", \"www.magelang.com\"];\n" +
        "        menus = [\"FAQ\", \"Forum\", \"Search\"];\n" +
        "}\n" +
        "\n" +
        "Site bea {\n" +
        "        answers = \"bea.jguru.com\";\n" +
        "        menus = [\"FAQ\", \"Forum\"];\n" +
        "}\n" +
        "\n" +
        "Server {\n" +
        "        sites = [$jguru, $bea];\n" +
        "}";
    FigLexer lexer = new FigLexer(new ANTLRStringStream(string));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    FigParser g = new FigParser(tokens);
    // begin parsing and get list of config'd objects
    List config_objects = null;
    try {
      config_objects = g.file();
    } catch (RecognitionException e) {
      OUT.error(e);
    }
    for (Object obj : config_objects) {
      OUT.debug("object: " + obj);
    }
  }

  public void testXmlBeans() {
    DBSchemaDocument schemaDoc = DBSchemaDocument.Factory.newInstance();
    CtDBSchema schema = schemaDoc.addNewDBSchema();
    CtTables tables = schema.addNewTables();
    CtTable table = tables.addNewTable();
    table.setSchemaName("schema1");
    table.setObjectName("table1");


    CtTable tableDetached = CtTable.Factory.newInstance();

    CtColumns columns = table.addNewColumns();

//    columns.setColumnArray();

    CtColumn column = columns.addNewColumn();
    column.setObjectName("columnA");
//    column.setDataType();
    column.addNewNotNull();

    CtDataType dataType = column.addNewDataType();
    dataType.setDataTypeName("VARCHAR");
    dataType.setLength("12");
    dataType.setPrecision("1");

    CtForeignKeys foreignKeys = table.addNewForeignKeys();
    CtForeignKey foreignKey = foreignKeys.addNewForeignKey();
    foreignKey.setObjectName("foreignKeyA");
    foreignKey.setReferencesSchemaName("remoteSchemaA");
    foreignKey.setReferencesTableName("remoteTableA");
    CtFkColumnRef columnRef = foreignKey.addNewColumnReference();
    columnRef.setColumnName("columnA");
    columnRef.setReferencesColumnName("remoteColumnA");

    CtPrimaryKey primaryKey = table.addNewPrimaryKey();
    primaryKey.setObjectName("primaryKeyA");
    primaryKey.addNewColumnName().setStringValue("columnA");
    CtIndexInfo iInfo = primaryKey.addNewIndexInfo();
    CtNVP nvp = iInfo.addNewInfo();
    nvp.setFieldName("xxxx");
    CtNVP nvp2 = nvp.addNewSubInfo();
    nvp2.setFieldName("yyyy");
    nvp2.setFieldValue("vvvv");
    CtNVP nvp3 = nvp.addNewSubInfo();
    nvp3.setFieldName("yyyy");
    nvp3.setFieldValue("vvvv");

    CtUniqueKeys uniqueKeys = table.addNewUniqueKeys();
    CtUniqueKey uniqueKey = uniqueKeys.addNewUniqueKey();
    uniqueKey.setObjectName("uniqueKeyA");
    uniqueKey.addNewColumnName().setStringValue("columnA");
  }

  public void testTableParse() {
    ResourceBundle rb = ResourceBundle.getBundle(Client.CLIENT_CONFIG_BUNDLE);
    String dbUrl = rb.getString(Client.BUND_DBURL);
    String dbUser = rb.getString(Client.BUND_DBUSER);
    String dbPass = rb.getString(Client.BUND_DBPASS);
    String dbDriver = rb.getString(Client.BUND_DBDRIVER);
    OUT.debug("dbUrl: " + dbUrl);
    OUT.debug("dbUser: " + dbUser);
    OUT.debug("dbPass: " + dbPass);
    OUT.debug("dbDriver: " + dbDriver);
    DBMSConfiguration dbConf = new DBMSConfiguration(dbUser, dbPass, dbUrl, dbDriver);
    try {
      DBMSXmlSchemaAdapterI dbAdapter = DBMSXmlSchemaAdapter.getInstance(dbConf);
      DBSchemaDocument schema = dbAdapter.getRepresentationOfDatabase();
      //OUT.debug("default value: " + schema.getDBSchema().getTables().getTableArray(3).getColumns().getColumnArray(12).getDefaultValue());
      OUT.debug("Xml doc representing schema:\n" + schema.xmlText());
//      OUT.debug(xml);
    } catch (DBMSXmlSchemaAdapterException e) {
      OUT.error("Could not create instance of adapter: " + e.getMessage(), e);
    }
  }

}
