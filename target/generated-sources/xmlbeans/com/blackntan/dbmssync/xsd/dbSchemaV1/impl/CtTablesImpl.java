/*
 * XML Type:  ct_Tables
 * Namespace: http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd
 * Java type: com.blackntan.dbmssync.xsd.dbSchemaV1.CtTables
 *
 * Automatically generated - do not modify.
 */
package com.blackntan.dbmssync.xsd.dbSchemaV1.impl;
/**
 * An XML ct_Tables(@http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd).
 *
 * This is a complex type.
 */
public class CtTablesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.blackntan.dbmssync.xsd.dbSchemaV1.CtTables
{
    
    public CtTablesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TABLE$0 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "Table");
    
    
    /**
     * Gets array of all "Table" elements
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtTable[] getTableArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TABLE$0, targetList);
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtTable[] result = new com.blackntan.dbmssync.xsd.dbSchemaV1.CtTable[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Table" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtTable getTableArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtTable target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtTable)get_store().find_element_user(TABLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Table" element
     */
    public int sizeOfTableArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TABLE$0);
        }
    }
    
    /**
     * Sets array of all "Table" element
     */
    public void setTableArray(com.blackntan.dbmssync.xsd.dbSchemaV1.CtTable[] tableArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tableArray, TABLE$0);
        }
    }
    
    /**
     * Sets ith "Table" element
     */
    public void setTableArray(int i, com.blackntan.dbmssync.xsd.dbSchemaV1.CtTable table)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtTable target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtTable)get_store().find_element_user(TABLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(table);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Table" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtTable insertNewTable(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtTable target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtTable)get_store().insert_element_user(TABLE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Table" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtTable addNewTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtTable target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtTable)get_store().add_element_user(TABLE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Table" element
     */
    public void removeTable(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TABLE$0, i);
        }
    }
}
