/*
 * XML Type:  ct_Table
 * Namespace: http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd
 * Java type: com.blackntan.dbmssync.xsd.dbSchemaV1.CtTable
 *
 * Automatically generated - do not modify.
 */
package com.blackntan.dbmssync.xsd.dbSchemaV1.impl;
/**
 * An XML ct_Table(@http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd).
 *
 * This is a complex type.
 */
public class CtTableImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.blackntan.dbmssync.xsd.dbSchemaV1.CtTable
{
    
    public CtTableImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCHEMANAME$0 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "SchemaName");
    private static final javax.xml.namespace.QName OBJECTNAME$2 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "ObjectName");
    private static final javax.xml.namespace.QName COLUMNS$4 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "Columns");
    private static final javax.xml.namespace.QName UNIQUEKEYS$6 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "UniqueKeys");
    private static final javax.xml.namespace.QName FOREIGNKEYS$8 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "ForeignKeys");
    private static final javax.xml.namespace.QName PRIMARYKEY$10 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "PrimaryKey");
    
    
    /**
     * Gets the "SchemaName" element
     */
    public java.lang.String getSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEMANAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SchemaName" element
     */
    public org.apache.xmlbeans.XmlString xgetSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHEMANAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "SchemaName" element
     */
    public boolean isSetSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEMANAME$0) != 0;
        }
    }
    
    /**
     * Sets the "SchemaName" element
     */
    public void setSchemaName(java.lang.String schemaName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEMANAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCHEMANAME$0);
            }
            target.setStringValue(schemaName);
        }
    }
    
    /**
     * Sets (as xml) the "SchemaName" element
     */
    public void xsetSchemaName(org.apache.xmlbeans.XmlString schemaName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHEMANAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCHEMANAME$0);
            }
            target.set(schemaName);
        }
    }
    
    /**
     * Unsets the "SchemaName" element
     */
    public void unsetSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEMANAME$0, 0);
        }
    }
    
    /**
     * Gets the "ObjectName" element
     */
    public java.lang.String getObjectName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ObjectName" element
     */
    public org.apache.xmlbeans.XmlString xgetObjectName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ObjectName" element
     */
    public void setObjectName(java.lang.String objectName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBJECTNAME$2);
            }
            target.setStringValue(objectName);
        }
    }
    
    /**
     * Sets (as xml) the "ObjectName" element
     */
    public void xsetObjectName(org.apache.xmlbeans.XmlString objectName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OBJECTNAME$2);
            }
            target.set(objectName);
        }
    }
    
    /**
     * Gets the "Columns" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtColumns getColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtColumns target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtColumns)get_store().find_element_user(COLUMNS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Columns" element
     */
    public void setColumns(com.blackntan.dbmssync.xsd.dbSchemaV1.CtColumns columns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtColumns target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtColumns)get_store().find_element_user(COLUMNS$4, 0);
            if (target == null)
            {
                target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtColumns)get_store().add_element_user(COLUMNS$4);
            }
            target.set(columns);
        }
    }
    
    /**
     * Appends and returns a new empty "Columns" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtColumns addNewColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtColumns target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtColumns)get_store().add_element_user(COLUMNS$4);
            return target;
        }
    }
    
    /**
     * Gets the "UniqueKeys" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys getUniqueKeys()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys)get_store().find_element_user(UNIQUEKEYS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "UniqueKeys" element
     */
    public boolean isSetUniqueKeys()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNIQUEKEYS$6) != 0;
        }
    }
    
    /**
     * Sets the "UniqueKeys" element
     */
    public void setUniqueKeys(com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys uniqueKeys)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys)get_store().find_element_user(UNIQUEKEYS$6, 0);
            if (target == null)
            {
                target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys)get_store().add_element_user(UNIQUEKEYS$6);
            }
            target.set(uniqueKeys);
        }
    }
    
    /**
     * Appends and returns a new empty "UniqueKeys" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys addNewUniqueKeys()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys)get_store().add_element_user(UNIQUEKEYS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "UniqueKeys" element
     */
    public void unsetUniqueKeys()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNIQUEKEYS$6, 0);
        }
    }
    
    /**
     * Gets the "ForeignKeys" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKeys getForeignKeys()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKeys target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKeys)get_store().find_element_user(FOREIGNKEYS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ForeignKeys" element
     */
    public boolean isSetForeignKeys()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FOREIGNKEYS$8) != 0;
        }
    }
    
    /**
     * Sets the "ForeignKeys" element
     */
    public void setForeignKeys(com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKeys foreignKeys)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKeys target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKeys)get_store().find_element_user(FOREIGNKEYS$8, 0);
            if (target == null)
            {
                target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKeys)get_store().add_element_user(FOREIGNKEYS$8);
            }
            target.set(foreignKeys);
        }
    }
    
    /**
     * Appends and returns a new empty "ForeignKeys" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKeys addNewForeignKeys()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKeys target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKeys)get_store().add_element_user(FOREIGNKEYS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "ForeignKeys" element
     */
    public void unsetForeignKeys()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FOREIGNKEYS$8, 0);
        }
    }
    
    /**
     * Gets the "PrimaryKey" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtPrimaryKey getPrimaryKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtPrimaryKey target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtPrimaryKey)get_store().find_element_user(PRIMARYKEY$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PrimaryKey" element
     */
    public boolean isSetPrimaryKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIMARYKEY$10) != 0;
        }
    }
    
    /**
     * Sets the "PrimaryKey" element
     */
    public void setPrimaryKey(com.blackntan.dbmssync.xsd.dbSchemaV1.CtPrimaryKey primaryKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtPrimaryKey target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtPrimaryKey)get_store().find_element_user(PRIMARYKEY$10, 0);
            if (target == null)
            {
                target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtPrimaryKey)get_store().add_element_user(PRIMARYKEY$10);
            }
            target.set(primaryKey);
        }
    }
    
    /**
     * Appends and returns a new empty "PrimaryKey" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtPrimaryKey addNewPrimaryKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtPrimaryKey target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtPrimaryKey)get_store().add_element_user(PRIMARYKEY$10);
            return target;
        }
    }
    
    /**
     * Unsets the "PrimaryKey" element
     */
    public void unsetPrimaryKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIMARYKEY$10, 0);
        }
    }
}
