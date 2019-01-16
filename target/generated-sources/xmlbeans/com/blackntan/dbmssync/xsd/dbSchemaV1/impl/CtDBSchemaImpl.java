/*
 * XML Type:  ct_DBSchema
 * Namespace: http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd
 * Java type: com.blackntan.dbmssync.xsd.dbSchemaV1.CtDBSchema
 *
 * Automatically generated - do not modify.
 */
package com.blackntan.dbmssync.xsd.dbSchemaV1.impl;
/**
 * An XML ct_DBSchema(@http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd).
 *
 * This is a complex type.
 */
public class CtDBSchemaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.blackntan.dbmssync.xsd.dbSchemaV1.CtDBSchema
{
    
    public CtDBSchemaImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TABLES$0 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "Tables");
    
    
    /**
     * Gets the "Tables" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtTables getTables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtTables target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtTables)get_store().find_element_user(TABLES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Tables" element
     */
    public void setTables(com.blackntan.dbmssync.xsd.dbSchemaV1.CtTables tables)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtTables target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtTables)get_store().find_element_user(TABLES$0, 0);
            if (target == null)
            {
                target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtTables)get_store().add_element_user(TABLES$0);
            }
            target.set(tables);
        }
    }
    
    /**
     * Appends and returns a new empty "Tables" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtTables addNewTables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtTables target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtTables)get_store().add_element_user(TABLES$0);
            return target;
        }
    }
}
