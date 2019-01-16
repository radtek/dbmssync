/*
 * XML Type:  ct_ForeignKeys
 * Namespace: http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd
 * Java type: com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKeys
 *
 * Automatically generated - do not modify.
 */
package com.blackntan.dbmssync.xsd.dbSchemaV1.impl;
/**
 * An XML ct_ForeignKeys(@http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd).
 *
 * This is a complex type.
 */
public class CtForeignKeysImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKeys
{
    
    public CtForeignKeysImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FOREIGNKEY$0 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "ForeignKey");
    
    
    /**
     * Gets array of all "ForeignKey" elements
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey[] getForeignKeyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FOREIGNKEY$0, targetList);
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey[] result = new com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ForeignKey" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey getForeignKeyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey)get_store().find_element_user(FOREIGNKEY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ForeignKey" element
     */
    public int sizeOfForeignKeyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FOREIGNKEY$0);
        }
    }
    
    /**
     * Sets array of all "ForeignKey" element
     */
    public void setForeignKeyArray(com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey[] foreignKeyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(foreignKeyArray, FOREIGNKEY$0);
        }
    }
    
    /**
     * Sets ith "ForeignKey" element
     */
    public void setForeignKeyArray(int i, com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey foreignKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey)get_store().find_element_user(FOREIGNKEY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(foreignKey);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ForeignKey" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey insertNewForeignKey(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey)get_store().insert_element_user(FOREIGNKEY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ForeignKey" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey addNewForeignKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey)get_store().add_element_user(FOREIGNKEY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ForeignKey" element
     */
    public void removeForeignKey(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FOREIGNKEY$0, i);
        }
    }
}
