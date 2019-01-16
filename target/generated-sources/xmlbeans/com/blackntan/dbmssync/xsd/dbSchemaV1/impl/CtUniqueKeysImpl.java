/*
 * XML Type:  ct_UniqueKeys
 * Namespace: http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd
 * Java type: com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys
 *
 * Automatically generated - do not modify.
 */
package com.blackntan.dbmssync.xsd.dbSchemaV1.impl;
/**
 * An XML ct_UniqueKeys(@http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd).
 *
 * This is a complex type.
 */
public class CtUniqueKeysImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys
{
    
    public CtUniqueKeysImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNIQUEKEY$0 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "UniqueKey");
    
    
    /**
     * Gets array of all "UniqueKey" elements
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey[] getUniqueKeyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UNIQUEKEY$0, targetList);
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey[] result = new com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "UniqueKey" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey getUniqueKeyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey)get_store().find_element_user(UNIQUEKEY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "UniqueKey" element
     */
    public int sizeOfUniqueKeyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNIQUEKEY$0);
        }
    }
    
    /**
     * Sets array of all "UniqueKey" element
     */
    public void setUniqueKeyArray(com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey[] uniqueKeyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(uniqueKeyArray, UNIQUEKEY$0);
        }
    }
    
    /**
     * Sets ith "UniqueKey" element
     */
    public void setUniqueKeyArray(int i, com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey uniqueKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey)get_store().find_element_user(UNIQUEKEY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(uniqueKey);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "UniqueKey" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey insertNewUniqueKey(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey)get_store().insert_element_user(UNIQUEKEY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "UniqueKey" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey addNewUniqueKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey)get_store().add_element_user(UNIQUEKEY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "UniqueKey" element
     */
    public void removeUniqueKey(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNIQUEKEY$0, i);
        }
    }
}
