package com.blackntan.dbmssync.antlr;

import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.ANTLRFileStream;
import org.apache.log4j.Logger;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.List;


public class ObjectHelper {
  private static Logger OUT = Logger.getLogger(ObjectHelper.class);
  public String foo;

  public static void main(String args[]) throws Exception {
    FigLexer lex = new FigLexer(new ANTLRFileStream(args[0]));
    CommonTokenStream tokens = new CommonTokenStream(lex);

    FigParser g = new FigParser(tokens);
    try {
      // begin parsing and get list of config'd objects
      List config_objects = g.file();
      for (Object o : config_objects) {
        System.out.println(o);
      }
    } catch (RecognitionException e) {
      e.printStackTrace();
    }
  }

  public static void setObjectProperty(Object o, String propertyName, Object value) {
    OUT.debug("Setting property: " + propertyName + "("+value+") on object " + o);
    Class c = o.getClass();

    // First see if name is a property ala javabeans
    String methodSuffix = Character.toUpperCase(propertyName.charAt(0)) +
        propertyName.substring(1, propertyName.length());
    Method m = getMethod(c, "set" + methodSuffix, new Class[]{value.getClass()});
    if (m != null) {
      try {
        invokeMethod(m, o, value);
      }
      catch (Exception e) {
        OUT.error("Can't set property " + propertyName + " using method set" + methodSuffix +
            " from " + c.getName() + " instance: " + e);
      }
    } else {
      // try for a visible field
      try {
        Field f = c.getField(propertyName);
        try {
          f.set(o, value);
        }
        catch (IllegalAccessException iae) {
          OUT.error("Can't access property " + propertyName + " using direct field access from " +
              c.getName() + " instance: " + iae);
        }
      }
      catch (NoSuchFieldException nsfe) {
        OUT.error("Class " + c.getName() + " has no such property/field: " + propertyName +
            ": " + nsfe);
      }
    }
  }

  protected static Object newInstance(String name) {
    Object o = null;
    try {
      o = Class.forName(name).newInstance();
    }
    catch (Exception e) {
      OUT.error("can't make instance of " + name);
    }
    return o;
  }

  protected static Method getMethod(Class c, String methodName, Class[] args) {
    Method m;
    try {
      m = c.getMethod(methodName, args);
    }
    catch (NoSuchMethodException nsme) {
      m = null;
    }
    return m;
  }

  protected static Object invokeMethod(Method m, Object o)
      throws IllegalAccessException, InvocationTargetException {
    return invokeMethod(m, o, null);
  }

  protected static Object invokeMethod(Method m, Object o, Object value)
      throws IllegalAccessException, InvocationTargetException {
    Object[] args = null;
    if (value != null) {
      args = new Object[]{value};
    }
    value = m.invoke(o, args);
    return value;
  }
}