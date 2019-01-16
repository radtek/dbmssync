package com.blackntan.dbmssync.core;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DatabaseMetaData;
import java.util.ResourceBundle;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Constructor;

import org.apache.log4j.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: jcolson
 * Date: Jun 30, 2008
 * Time: 10:04:41 PM
 */
public class DBMSXmlSchemaAdapter {
  private static final Logger OUT = Logger.getLogger(DBMSXmlSchemaAdapter.class);
  private static ResourceBundle rb = ResourceBundle.getBundle(DBMSXmlSchemaAdapter.class.getName());
  private static final String BUND_IMPLEMENTING_CLASSES = "adapterClasses";

  public static DBMSXmlSchemaAdapterI getInstance(DBMSConfiguration dbmsConfig) throws DBMSXmlSchemaAdapterException {
    return determineAndCreateAdapterForConfig(dbmsConfig);
  }

  private static DBMSXmlSchemaAdapterI determineAndCreateAdapterForConfig(DBMSConfiguration dbmsConfig) throws DBMSXmlSchemaAdapterException {
    DataSource dataSource;
    String dbName;
    int dbMajor;
    int dbMinor;
    boolean doesSupport = false;
    DBMSXmlSchemaAdapterI instanceOfAdapter = null;
    Connection conn = null;
    try {
      dataSource = dbmsConfig.createDatasource();
      conn = dataSource.getConnection();
      OUT.debug("Conn catalog: " + conn.getCatalog());
//      Properties props = conn.getClientInfo();
//      for (Object key: props.keySet()) {
//        OUT.debug("key: "+key+" value: "+props.get(key));
//      }
      DatabaseMetaData dbmd = conn.getMetaData();
      dbName = dbmd.getDatabaseProductName();
      dbMajor = dbmd.getDatabaseMajorVersion();
      dbMinor = dbmd.getDatabaseMinorVersion();
      OUT.debug("db product name: " + dbName);
      OUT.debug("db major version: " + dbMajor);
      OUT.debug("db minor version: " + dbMinor);
      for (String className : rb.getString(BUND_IMPLEMENTING_CLASSES).split("\\|")) {
        OUT.debug("Checking if " + className + " supports " + dbName + " version: " + dbMajor + "." + dbMinor);
        try {
          Class implClass = Class.forName(className);
          Constructor adapterCons = implClass.getConstructor();
          instanceOfAdapter = (DBMSXmlSchemaAdapterI) adapterCons.newInstance();
          Method supportsMethod = implClass.getMethod("isSupport", String.class, int.class, int.class);
          doesSupport = (Boolean) supportsMethod.invoke(instanceOfAdapter, dbName, dbMajor, dbMinor);
          if (doesSupport) {
            break;
          }
        } catch (ClassNotFoundException e) {
          OUT.info("Could not load class: " + className, e);
        } catch (NoSuchMethodException e) {
          OUT.info("Could not get isSupport method: " + className, e);
        } catch (IllegalAccessException e) {
          OUT.info("isSupport method is not accessible: " + className, e);
        } catch (InvocationTargetException e) {
          OUT.info("Caught exception during invocation of isSupport method: " + className, e);
        } catch (InstantiationException e) {
          OUT.info("Could not create instance of class: " + className, e);
        }
      }
    } catch (PropertyVetoException e) {
      OUT.error("Could not load the database driver specified: " + e.getMessage(), e);
      throw new DBMSXmlSchemaAdapterException(e);
    } catch (SQLException e) {
      OUT.error("Could not connect to the database: " + e.getMessage(), e);
      throw new DBMSXmlSchemaAdapterException(e);
    } finally {
      try {
        conn.close();
      } catch (SQLException e) {
        OUT.error("Could not close connection", e);
      }
    }
    if (!doesSupport || instanceOfAdapter == null) {
      throw new DBMSXmlSchemaAdapterException("No adapter implementation found that supports the database: " + dbName + " version: " + dbMajor + "." + dbMinor);
    }
    return instanceOfAdapter.initialize(dataSource);
  }
}
