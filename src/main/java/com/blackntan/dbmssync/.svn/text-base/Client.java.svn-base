package com.blackntan.dbmssync;

import org.apache.log4j.Logger;

import java.util.ResourceBundle;
import java.util.ArrayList;

import com.blackntan.dbmssync.core.*;
import com.blackntan.dbmssync.xsd.dbSchemaV1.DBSchemaDocument;

/**
 * Created by IntelliJ IDEA.
 * User: jcolson
 * Date: Jun 30, 2008
 * Time: 9:53:52 PM
 * Database schema compare client
 */
public class Client {
  public static final String CLIENT_CONFIG_BUNDLE = Client.class.getName();
  public static final String BUND_DBURL = "dbUrl";
  public static final String BUND_DBUSER = "user";
  public static final String BUND_DBPASS = "password";
  public static final String BUND_DBDRIVER = "driver";

  private static Logger OUT = Logger.getLogger(Client.class);

  public static void main(String[] args) {
    ResourceBundle rb = ResourceBundle.getBundle(CLIENT_CONFIG_BUNDLE);
    String dbUrl = rb.getString(BUND_DBURL);
    String dbUser = rb.getString(BUND_DBUSER);
    String dbPass = rb.getString(BUND_DBPASS);
    String dbDriver = rb.getString(BUND_DBDRIVER);
    OUT.debug("dbUrl: " + dbUrl);
    OUT.debug("dbUser: " + dbUser);
    OUT.debug("dbPass: " + dbPass);
    OUT.debug("dbDriver: " + dbDriver);
    DBMSConfiguration dbConf = new DBMSConfiguration(dbUser, dbPass, dbUrl, dbDriver);
    try {
      DBMSXmlSchemaAdapterI dbAdapter = DBMSXmlSchemaAdapter.getInstance(dbConf);
      DBSchemaDocument schemaBeans = dbAdapter.getRepresentationOfDatabase();
      OUT.debug("Xml doc representing schema:\n" + schemaBeans.xmlText());
//      OUT.debug(xml);
    } catch (DBMSXmlSchemaAdapterException e) {
      OUT.error("Could not create instance of adapter: " + e.getMessage(), e);
    }
  }
}
