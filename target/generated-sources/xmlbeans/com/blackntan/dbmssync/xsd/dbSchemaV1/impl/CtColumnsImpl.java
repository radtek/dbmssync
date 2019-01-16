/*
 * XML Type:  ct_Columns
 * Namespace: http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd
 * Java type: com.blackntan.dbmssync.xsd.dbSchemaV1.CtColumns
 *
 * Automatically generated - do not modify.
 */
package com.blackntan.dbmssync.xsd.dbSchemaV1.impl;
/**
 * An XML ct_Columns(@http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd).
 *
 * This is a complex type.
 */
public class CtColumnsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.blackntan.dbmssync.xsd.dbSchemaV1.CtColumns
{
    
    public CtColumnsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLUMN$0 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "Column");
    
    
    /**
     * Gets array of all "Column" elements
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtColumn[] getColumnArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COLUMN$0, targetList);
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtColumn[] result = new com.blackntan.dbmssync.xsd.dbSchemaV1.CtColumn[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Column" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtColumn getColumnArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtColumn target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtColumn)get_store().find_element_user(COLUMN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Column" element
     */
    public int sizeOfColumnArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLUMN$0);
        }
    }
    
    /**
     * Sets array of all "Column" element
     */
    public void setColumnArray(com.blackntan.dbmssync.xsd.dbSchemaV1.CtColumn[] columnArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(columnArray, COLUMN$0);
        }
    }
    
    /**
     * Sets ith "Column" element
     */
    public void setColumnArray(int i, com.blackntan.dbmssync.xsd.dbSchemaV1.CtColumn column)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtColumn target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtColumn)get_store().find_element_user(COLUMN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(column);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Column" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtColumn insertNewColumn(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtColumn target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtColumn)get_store().insert_element_user(COLUMN$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Column" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtColumn addNewColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtColumn target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtColumn)get_store().add_element_user(COLUMN$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Column" element
     */
    public void removeColumn(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLUMN$0, i);
        }
    }
}
