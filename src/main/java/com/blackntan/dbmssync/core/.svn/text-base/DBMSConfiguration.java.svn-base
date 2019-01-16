package com.blackntan.dbmssync.core;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * Created by IntelliJ IDEA.
 * User: jcolson
 * Date: Jun 30, 2008
 * Time: 10:05:45 PM
 * Configuration information for a DBMSXmlSchemaAdapter implementation to use
 */
public class DBMSConfiguration {
  private String dbUser;
  private String dbPass;
  private String dbUrl;
  private String driver;

  public DBMSConfiguration(String dbUser, String dbPass, String dbUrl, String driver) {
    this.dbUser = dbUser;
    this.dbPass = dbPass;
    this.dbUrl = dbUrl;
    this.driver = driver;
  }

  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  public String getDbUser() {
    return dbUser;
  }

  public void setDbUser(String dbUser) {
    this.dbUser = dbUser;
  }

  public String getDbPass() {
    return dbPass;
  }

  public void setDbPass(String dbPass) {
    this.dbPass = dbPass;
  }

  public String getDbUrl() {
    return dbUrl;
  }

  public void setDbUrl(String dbUrl) {
    this.dbUrl = dbUrl;
  }

  public DataSource createDatasource() throws PropertyVetoException {
    ComboPooledDataSource cpds = new ComboPooledDataSource();
    cpds.setDriverClass(this.getDriver()); //loads the jdbc driver
    cpds.setJdbcUrl(this.getDbUrl());
    cpds.setUser(this.getDbUser());
    cpds.setPassword(this.getDbPass());
    cpds.setAutoCommitOnClose(false);
    return cpds;
  }
}
