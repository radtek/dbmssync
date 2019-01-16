/*
 * An XML document type.
 * Localname: DBSchema
 * Namespace: http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd
 * Java type: com.blackntan.dbmssync.xsd.dbSchemaV1.DBSchemaDocument
 *
 * Automatically generated - do not modify.
 */
package com.blackntan.dbmssync.xsd.dbSchemaV1.impl;
/**
 * A document containing one DBSchema(@http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd) element.
 *
 * This is a complex type.
 */
public class DBSchemaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.blackntan.dbmssync.xsd.dbSchemaV1.DBSchemaDocument
{
    
    public DBSchemaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DBSCHEMA$0 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "DBSchema");
    
    
    /**
     * Gets the "DBSchema" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtDBSchema getDBSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtDBSchema target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtDBSchema)get_store().find_element_user(DBSCHEMA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DBSchema" element
     */
    public void setDBSchema(com.blackntan.dbmssync.xsd.dbSchemaV1.CtDBSchema dbSchema)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtDBSchema target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtDBSchema)get_store().find_element_user(DBSCHEMA$0, 0);
            if (target == null)
            {
                target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtDBSchema)get_store().add_element_user(DBSCHEMA$0);
            }
            target.set(dbSchema);
        }
    }
    
    /**
     * Appends and returns a new empty "DBSchema" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtDBSchema addNewDBSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtDBSchema target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtDBSchema)get_store().add_element_user(DBSCHEMA$0);
            return target;
        }
    }
}
