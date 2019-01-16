/*
 * XML Type:  ct_IndexInfo
 * Namespace: http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd
 * Java type: com.blackntan.dbmssync.xsd.dbSchemaV1.CtIndexInfo
 *
 * Automatically generated - do not modify.
 */
package com.blackntan.dbmssync.xsd.dbSchemaV1.impl;
/**
 * An XML ct_IndexInfo(@http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd).
 *
 * This is a complex type.
 */
public class CtIndexInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.blackntan.dbmssync.xsd.dbSchemaV1.CtIndexInfo
{
    
    public CtIndexInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INFO$0 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "Info");
    
    
    /**
     * Gets array of all "Info" elements
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP[] getInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INFO$0, targetList);
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP[] result = new com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Info" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP getInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP)get_store().find_element_user(INFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Info" element
     */
    public int sizeOfInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INFO$0);
        }
    }
    
    /**
     * Sets array of all "Info" element
     */
    public void setInfoArray(com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP[] infoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(infoArray, INFO$0);
        }
    }
    
    /**
     * Sets ith "Info" element
     */
    public void setInfoArray(int i, com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP info)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP)get_store().find_element_user(INFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(info);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Info" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP insertNewInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP)get_store().insert_element_user(INFO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Info" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP addNewInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP)get_store().add_element_user(INFO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Info" element
     */
    public void removeInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INFO$0, i);
        }
    }
}
