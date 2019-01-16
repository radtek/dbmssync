package com.blackntan.dbmssync.core;

import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: jcolson
 * Date: Jul 1, 2008
 * Time: 1:46:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class SchemaObjectBeanUtil {
  public static SchemaObjectBeanI findObjectByName(String objectName, Collection<SchemaObjectBeanI> schemaObjects) {
    SchemaObjectBeanI returnBean = null;
    for (SchemaObjectBeanI theBean : schemaObjects) {
      if (objectName.equals(theBean.getObjectName())) {
        returnBean = theBean;
        break;
      }
    }
    return returnBean;
  }
}
