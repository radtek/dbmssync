/*
 * XML Type:  ct_FkColumnRef
 * Namespace: http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd
 * Java type: com.blackntan.dbmssync.xsd.dbSchemaV1.CtFkColumnRef
 *
 * Automatically generated - do not modify.
 */
package com.blackntan.dbmssync.xsd.dbSchemaV1.impl;
/**
 * An XML ct_FkColumnRef(@http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd).
 *
 * This is a complex type.
 */
public class CtFkColumnRefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.blackntan.dbmssync.xsd.dbSchemaV1.CtFkColumnRef
{
    
    public CtFkColumnRefImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLUMNNAME$0 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "ColumnName");
    private static final javax.xml.namespace.QName REFERENCESCOLUMNNAME$2 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "ReferencesColumnName");
    
    
    /**
     * Gets the "ColumnName" element
     */
    public java.lang.String getColumnName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMNNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ColumnName" element
     */
    public org.apache.xmlbeans.XmlString xgetColumnName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLUMNNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ColumnName" element
     */
    public void setColumnName(java.lang.String columnName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMNNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLUMNNAME$0);
            }
            target.setStringValue(columnName);
        }
    }
    
    /**
     * Sets (as xml) the "ColumnName" element
     */
    public void xsetColumnName(org.apache.xmlbeans.XmlString columnName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLUMNNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COLUMNNAME$0);
            }
            target.set(columnName);
        }
    }
    
    /**
     * Gets the "ReferencesColumnName" element
     */
    public java.lang.String getReferencesColumnName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCESCOLUMNNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReferencesColumnName" element
     */
    public org.apache.xmlbeans.XmlString xgetReferencesColumnName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCESCOLUMNNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ReferencesColumnName" element
     */
    public void setReferencesColumnName(java.lang.String referencesColumnName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCESCOLUMNNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCESCOLUMNNAME$2);
            }
            target.setStringValue(referencesColumnName);
        }
    }
    
    /**
     * Sets (as xml) the "ReferencesColumnName" element
     */
    public void xsetReferencesColumnName(org.apache.xmlbeans.XmlString referencesColumnName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCESCOLUMNNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFERENCESCOLUMNNAME$2);
            }
            target.set(referencesColumnName);
        }
    }
}
