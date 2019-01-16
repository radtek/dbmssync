/*
 * XML Type:  ct_DataType
 * Namespace: http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd
 * Java type: com.blackntan.dbmssync.xsd.dbSchemaV1.CtDataType
 *
 * Automatically generated - do not modify.
 */
package com.blackntan.dbmssync.xsd.dbSchemaV1.impl;
/**
 * An XML ct_DataType(@http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd).
 *
 * This is a complex type.
 */
public class CtDataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.blackntan.dbmssync.xsd.dbSchemaV1.CtDataType
{
    
    public CtDataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATATYPENAME$0 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "DataTypeName");
    private static final javax.xml.namespace.QName LENGTH$2 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "Length");
    private static final javax.xml.namespace.QName PRECISION$4 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "Precision");
    
    
    /**
     * Gets the "DataTypeName" element
     */
    public java.lang.String getDataTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATATYPENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataTypeName" element
     */
    public org.apache.xmlbeans.XmlString xgetDataTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATATYPENAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DataTypeName" element
     */
    public void setDataTypeName(java.lang.String dataTypeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATATYPENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATATYPENAME$0);
            }
            target.setStringValue(dataTypeName);
        }
    }
    
    /**
     * Sets (as xml) the "DataTypeName" element
     */
    public void xsetDataTypeName(org.apache.xmlbeans.XmlString dataTypeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATATYPENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATATYPENAME$0);
            }
            target.set(dataTypeName);
        }
    }
    
    /**
     * Gets the "Length" element
     */
    public java.lang.String getLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LENGTH$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Length" element
     */
    public org.apache.xmlbeans.XmlString xgetLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LENGTH$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Length" element
     */
    public boolean isSetLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LENGTH$2) != 0;
        }
    }
    
    /**
     * Sets the "Length" element
     */
    public void setLength(java.lang.String length)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LENGTH$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LENGTH$2);
            }
            target.setStringValue(length);
        }
    }
    
    /**
     * Sets (as xml) the "Length" element
     */
    public void xsetLength(org.apache.xmlbeans.XmlString length)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LENGTH$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LENGTH$2);
            }
            target.set(length);
        }
    }
    
    /**
     * Unsets the "Length" element
     */
    public void unsetLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LENGTH$2, 0);
        }
    }
    
    /**
     * Gets the "Precision" element
     */
    public java.lang.String getPrecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRECISION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Precision" element
     */
    public org.apache.xmlbeans.XmlString xgetPrecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRECISION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Precision" element
     */
    public boolean isSetPrecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRECISION$4) != 0;
        }
    }
    
    /**
     * Sets the "Precision" element
     */
    public void setPrecision(java.lang.String precision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRECISION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRECISION$4);
            }
            target.setStringValue(precision);
        }
    }
    
    /**
     * Sets (as xml) the "Precision" element
     */
    public void xsetPrecision(org.apache.xmlbeans.XmlString precision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRECISION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRECISION$4);
            }
            target.set(precision);
        }
    }
    
    /**
     * Unsets the "Precision" element
     */
    public void unsetPrecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRECISION$4, 0);
        }
    }
}
