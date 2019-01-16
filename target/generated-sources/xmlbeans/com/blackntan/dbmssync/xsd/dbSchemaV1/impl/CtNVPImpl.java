/*
 * XML Type:  ct_NVP
 * Namespace: http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd
 * Java type: com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP
 *
 * Automatically generated - do not modify.
 */
package com.blackntan.dbmssync.xsd.dbSchemaV1.impl;
/**
 * An XML ct_NVP(@http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd).
 *
 * This is a complex type.
 */
public class CtNVPImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP
{
    
    public CtNVPImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIELDNAME$0 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "FieldName");
    private static final javax.xml.namespace.QName FIELDVALUE$2 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "FieldValue");
    private static final javax.xml.namespace.QName SUBINFO$4 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "SubInfo");
    
    
    /**
     * Gets the "FieldName" element
     */
    public java.lang.String getFieldName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FieldName" element
     */
    public org.apache.xmlbeans.XmlString xgetFieldName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIELDNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FieldName" element
     */
    public void setFieldName(java.lang.String fieldName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIELDNAME$0);
            }
            target.setStringValue(fieldName);
        }
    }
    
    /**
     * Sets (as xml) the "FieldName" element
     */
    public void xsetFieldName(org.apache.xmlbeans.XmlString fieldName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIELDNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIELDNAME$0);
            }
            target.set(fieldName);
        }
    }
    
    /**
     * Gets the "FieldValue" element
     */
    public java.lang.String getFieldValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDVALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FieldValue" element
     */
    public org.apache.xmlbeans.XmlString xgetFieldValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIELDVALUE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "FieldValue" element
     */
    public boolean isSetFieldValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIELDVALUE$2) != 0;
        }
    }
    
    /**
     * Sets the "FieldValue" element
     */
    public void setFieldValue(java.lang.String fieldValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIELDVALUE$2);
            }
            target.setStringValue(fieldValue);
        }
    }
    
    /**
     * Sets (as xml) the "FieldValue" element
     */
    public void xsetFieldValue(org.apache.xmlbeans.XmlString fieldValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIELDVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIELDVALUE$2);
            }
            target.set(fieldValue);
        }
    }
    
    /**
     * Unsets the "FieldValue" element
     */
    public void unsetFieldValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIELDVALUE$2, 0);
        }
    }
    
    /**
     * Gets array of all "SubInfo" elements
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP[] getSubInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBINFO$4, targetList);
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP[] result = new com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SubInfo" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP getSubInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP)get_store().find_element_user(SUBINFO$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SubInfo" element
     */
    public int sizeOfSubInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBINFO$4);
        }
    }
    
    /**
     * Sets array of all "SubInfo" element
     */
    public void setSubInfoArray(com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP[] subInfoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(subInfoArray, SUBINFO$4);
        }
    }
    
    /**
     * Sets ith "SubInfo" element
     */
    public void setSubInfoArray(int i, com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP subInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP)get_store().find_element_user(SUBINFO$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(subInfo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SubInfo" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP insertNewSubInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP)get_store().insert_element_user(SUBINFO$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SubInfo" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP addNewSubInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtNVP)get_store().add_element_user(SUBINFO$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "SubInfo" element
     */
    public void removeSubInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBINFO$4, i);
        }
    }
}
