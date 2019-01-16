package com.blackntan.dbmssync.core;

import com.blackntan.dbmssync.xsd.dbSchemaV1.DBSchemaDocument;

import javax.sql.DataSource;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: jcolson
 * Date: Jun 30, 2008
 * Time: 9:54:28 PM
 * This interface is to be implemented by DBMS specific adapters
 */
public interface DBMSXmlSchemaAdapterI {
  DBMSXmlSchemaAdapterI initialize(DataSource dbmsConfig);

  boolean isSupport(String vendor, int majorVersion, int minorVersion);

  boolean isInitialized();

  DBSchemaDocument getRepresentationOfDatabase();

  String getDifferentialDDL(ArrayList<SchemaObjectBeanI> from, ArrayList<SchemaObjectBeanI> to);
}
