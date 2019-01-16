/*
 * XML Type:  ct_Column
 * Namespace: http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd
 * Java type: com.blackntan.dbmssync.xsd.dbSchemaV1.CtColumn
 *
 * Automatically generated - do not modify.
 */
package com.blackntan.dbmssync.xsd.dbSchemaV1.impl;
/**
 * An XML ct_Column(@http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd).
 *
 * This is a complex type.
 */
public class CtColumnImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.blackntan.dbmssync.xsd.dbSchemaV1.CtColumn
{
    
    public CtColumnImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTNAME$0 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "ObjectName");
    private static final javax.xml.namespace.QName DATATYPE$2 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "DataType");
    private static final javax.xml.namespace.QName NOTNULL$4 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "NotNull");
    private static final javax.xml.namespace.QName DEFAULTVALUE$6 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "DefaultValue");
    
    
    /**
     * Gets the "ObjectName" element
     */
    public java.lang.String getObjectName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTNAME$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTNAME$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBJECTNAME$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OBJECTNAME$0);
            }
            target.set(objectName);
        }
    }
    
    /**
     * Gets the "DataType" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtDataType getDataType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtDataType target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtDataType)get_store().find_element_user(DATATYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataType" element
     */
    public void setDataType(com.blackntan.dbmssync.xsd.dbSchemaV1.CtDataType dataType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtDataType target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtDataType)get_store().find_element_user(DATATYPE$2, 0);
            if (target == null)
            {
                target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtDataType)get_store().add_element_user(DATATYPE$2);
            }
            target.set(dataType);
        }
    }
    
    /**
     * Appends and returns a new empty "DataType" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtDataType addNewDataType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtDataType target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtDataType)get_store().add_element_user(DATATYPE$2);
            return target;
        }
    }
    
    /**
     * Gets the "NotNull" element
     */
    public org.apache.xmlbeans.XmlObject getNotNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(NOTNULL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "NotNull" element
     */
    public boolean isSetNotNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTNULL$4) != 0;
        }
    }
    
    /**
     * Sets the "NotNull" element
     */
    public void setNotNull(org.apache.xmlbeans.XmlObject notNull)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(NOTNULL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(NOTNULL$4);
            }
            target.set(notNull);
        }
    }
    
    /**
     * Appends and returns a new empty "NotNull" element
     */
    public org.apache.xmlbeans.XmlObject addNewNotNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(NOTNULL$4);
            return target;
        }
    }
    
    /**
     * Unsets the "NotNull" element
     */
    public void unsetNotNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTNULL$4, 0);
        }
    }
    
    /**
     * Gets the "DefaultValue" element
     */
    public java.lang.String getDefaultValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTVALUE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DefaultValue" element
     */
    public org.apache.xmlbeans.XmlString xgetDefaultValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTVALUE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "DefaultValue" element
     */
    public boolean isSetDefaultValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULTVALUE$6) != 0;
        }
    }
    
    /**
     * Sets the "DefaultValue" element
     */
    public void setDefaultValue(java.lang.String defaultValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTVALUE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFAULTVALUE$6);
            }
            target.setStringValue(defaultValue);
        }
    }
    
    /**
     * Sets (as xml) the "DefaultValue" element
     */
    public void xsetDefaultValue(org.apache.xmlbeans.XmlString defaultValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTVALUE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEFAULTVALUE$6);
            }
            target.set(defaultValue);
        }
    }
    
    /**
     * Unsets the "DefaultValue" element
     */
    public void unsetDefaultValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULTVALUE$6, 0);
        }
    }
}
