/*
 * XML Type:  ct_PrimaryKey
 * Namespace: http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd
 * Java type: com.blackntan.dbmssync.xsd.dbSchemaV1.CtPrimaryKey
 *
 * Automatically generated - do not modify.
 */
package com.blackntan.dbmssync.xsd.dbSchemaV1.impl;
/**
 * An XML ct_PrimaryKey(@http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd).
 *
 * This is a complex type.
 */
public class CtPrimaryKeyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.blackntan.dbmssync.xsd.dbSchemaV1.CtPrimaryKey
{
    
    public CtPrimaryKeyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTNAME$0 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "ObjectName");
    private static final javax.xml.namespace.QName COLUMNNAME$2 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "ColumnName");
    private static final javax.xml.namespace.QName INDEXINFO$4 = 
        new javax.xml.namespace.QName("http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd", "IndexInfo");
    
    
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
     * Gets array of all "ColumnName" elements
     */
    public java.lang.String[] getColumnNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COLUMNNAME$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "ColumnName" element
     */
    public java.lang.String getColumnNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMNNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "ColumnName" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetColumnNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COLUMNNAME$2, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "ColumnName" element
     */
    public org.apache.xmlbeans.XmlString xgetColumnNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLUMNNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "ColumnName" element
     */
    public int sizeOfColumnNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLUMNNAME$2);
        }
    }
    
    /**
     * Sets array of all "ColumnName" element
     */
    public void setColumnNameArray(java.lang.String[] columnNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(columnNameArray, COLUMNNAME$2);
        }
    }
    
    /**
     * Sets ith "ColumnName" element
     */
    public void setColumnNameArray(int i, java.lang.String columnName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMNNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(columnName);
        }
    }
    
    /**
     * Sets (as xml) array of all "ColumnName" element
     */
    public void xsetColumnNameArray(org.apache.xmlbeans.XmlString[]columnNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(columnNameArray, COLUMNNAME$2);
        }
    }
    
    /**
     * Sets (as xml) ith "ColumnName" element
     */
    public void xsetColumnNameArray(int i, org.apache.xmlbeans.XmlString columnName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLUMNNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(columnName);
        }
    }
    
    /**
     * Inserts the value as the ith "ColumnName" element
     */
    public void insertColumnName(int i, java.lang.String columnName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(COLUMNNAME$2, i);
            target.setStringValue(columnName);
        }
    }
    
    /**
     * Appends the value as the last "ColumnName" element
     */
    public void addColumnName(java.lang.String columnName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLUMNNAME$2);
            target.setStringValue(columnName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ColumnName" element
     */
    public org.apache.xmlbeans.XmlString insertNewColumnName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(COLUMNNAME$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ColumnName" element
     */
    public org.apache.xmlbeans.XmlString addNewColumnName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COLUMNNAME$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "ColumnName" element
     */
    public void removeColumnName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLUMNNAME$2, i);
        }
    }
    
    /**
     * Gets the "IndexInfo" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtIndexInfo getIndexInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtIndexInfo target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtIndexInfo)get_store().find_element_user(INDEXINFO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "IndexInfo" element
     */
    public boolean isSetIndexInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INDEXINFO$4) != 0;
        }
    }
    
    /**
     * Sets the "IndexInfo" element
     */
    public void setIndexInfo(com.blackntan.dbmssync.xsd.dbSchemaV1.CtIndexInfo indexInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtIndexInfo target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtIndexInfo)get_store().find_element_user(INDEXINFO$4, 0);
            if (target == null)
            {
                target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtIndexInfo)get_store().add_element_user(INDEXINFO$4);
            }
            target.set(indexInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "IndexInfo" element
     */
    public com.blackntan.dbmssync.xsd.dbSchemaV1.CtIndexInfo addNewIndexInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.blackntan.dbmssync.xsd.dbSchemaV1.CtIndexInfo target = null;
            target = (com.blackntan.dbmssync.xsd.dbSchemaV1.CtIndexInfo)get_store().add_element_user(INDEXINFO$4);
            return target;
        }
    }
    
    /**
     * Unsets the "IndexInfo" element
     */
    public void unsetIndexInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INDEXINFO$4, 0);
        }
    }
}
