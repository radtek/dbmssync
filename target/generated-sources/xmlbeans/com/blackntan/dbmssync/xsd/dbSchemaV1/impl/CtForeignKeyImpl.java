/*
 * XML Type:  ct_ForeignKey
 * Namespace: http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd
 * Java type: com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey
 *
 * Automatically generated - do not modify.
 */
package com.blackntan.dbmssync.xsd.dbSchemaV1.impl;
/**
 * An XML ct_ForeignKey(@http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd).
 *
 * This is a complex type.
 */
public class CtForeignKeyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey
{
    
    public CtForeignKeyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTNAME$0 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "ObjectName");
    private static final javax.xml.namespace.QName REFERENCESSCHEMANAME$2 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "ReferencesSchemaName");
    private static final javax.xml.namespace.QName REFERENCESTABLENAME$4 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "ReferencesTableName");
    private static final javax.xml.namespace.QName COLUMNREFERENCE$6 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "ColumnReference");
    
    
    /**
     * Gets the "ObjectName" element
     */
    public java.lang.String getObjectName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ObjectName" element
     */
    public org.apache.xmlbeans.XmlString xgetObjectName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ObjectName" element
     */
    public void setObjectName(java.lang.String objectName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBJECTNAME$0);
            }
            target.setStringValue(objectName);
        }
    }
    
    /**
     * Sets (as xml) the "ObjectName" element
     */
    public void xsetObjectName(org.apache.xmlbeans.XmlString objectName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OBJECTNAME$0);
            }
            target.set(objectName);
        }
    }
    
    /**
     * Gets the "ReferencesSchemaName" element
     */
    public java.lang.String getReferencesSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCESSCHEMANAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReferencesSchemaName" element
     */
    public org.apache.xmlbeans.XmlString xgetReferencesSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCESSCHEMANAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ReferencesSchemaName" element
     */
    public void setReferencesSchemaName(java.lang.String referencesSchemaName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCESSCHEMANAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCESSCHEMANAME$2);
            }
            target.setStringValue(referencesSchemaName);
        }
    }
    
    /**
     * Sets (as xml) the "ReferencesSchemaName" element
     */
    public void xsetReferencesSchemaName(org.apache.xmlbeans.XmlString referencesSchemaName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCESSCHEMANAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFERENCESSCHEMANAME$2);
            }
            target.set(referencesSchemaName);
        }
    }
    
    /**
     * Gets the "ReferencesTableName" element
     */
    public java.lang.String getReferencesTableName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCESTABLENAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReferencesTableName" element
     */
    public org.apache.xmlbeans.XmlString xgetReferencesTableName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCESTABLENAME$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ReferencesTableName" element
     */
    public void setReferencesTableName(java.lang.String referencesTableName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCESTABLENAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCESTABLENAME$4);
            }
            target.setStringValue(referencesTableName);
        }
    }
    
    /**
     * Sets (as xml) the "ReferencesTableName" element
     */
    public void xsetReferencesTableName(org.apache.xmlbeans.XmlString referencesTableName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCESTABLENAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFERENCESTABLENAME$4);
            }
            target.set(referencesTableName);
        }
    }
    
    /**
     * Gets array of all "ColumnReference" elements
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtFkColumnRef[] getColumnReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COLUMNREFERENCE$6, targetList);
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtFkColumnRef[] result = new com.blackntan.dbmssync.xsd.dbSchemaV1.CtFkColumnRef[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ColumnReference" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtFkColumnRef getColumnReferenceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtFkColumnRef target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtFkColumnRef)get_store().find_element_user(COLUMNREFERENCE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ColumnReference" element
     */
    public int sizeOfColumnReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLUMNREFERENCE$6);
        }
    }
    
    /**
     * Sets array of all "ColumnReference" element
     */
    public void setColumnReferenceArray(com.blackntan.dbmssync.xsd.dbSchemaV1.CtFkColumnRef[] columnReferenceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(columnReferenceArray, COLUMNREFERENCE$6);
        }
    }
    
    /**
     * Sets ith "ColumnReference" element
     */
    public void setColumnReferenceArray(int i, com.blackntan.dbmssync.xsd.dbSchemaV1.CtFkColumnRef columnReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtFkColumnRef target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtFkColumnRef)get_store().find_element_user(COLUMNREFERENCE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(columnReference);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ColumnReference" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtFkColumnRef insertNewColumnReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtFkColumnRef target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtFkColumnRef)get_store().insert_element_user(COLUMNREFERENCE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ColumnReference" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtFkColumnRef addNewColumnReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtFkColumnRef target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtFkColumnRef)get_store().add_element_user(COLUMNREFERENCE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "ColumnReference" element
     */
    public void removeColumnReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLUMNREFERENCE$6, i);
        }
    }
}
