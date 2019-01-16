/*
 * XML Type:  ct_UniqueKey
 * Namespace: http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd
 * Java type: com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey
 *
 * Automatically generated - do not modify.
 */
package com.blackntan.dbmssync.xsd.dbSchemaV1;


/**
 * An XML ct_UniqueKey(@http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd).
 *
 * This is a complex type.
 */
public interface CtUniqueKey extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CtUniqueKey.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFD33422165C811F783D9C99D91C0269B").resolveHandle("ctuniquekey307dtype");
    
    /**
     * Gets the "ObjectName" element
     */
    java.lang.String getObjectName();
    
    /**
     * Gets (as xml) the "ObjectName" element
     */
    org.apache.xmlbeans.XmlString xgetObjectName();
    
    /**
     * Sets the "ObjectName" element
     */
    void setObjectName(java.lang.String objectName);
    
    /**
     * Sets (as xml) the "ObjectName" element
     */
    void xsetObjectName(org.apache.xmlbeans.XmlString objectName);
    
    /**
     * Gets array of all "ColumnName" elements
     */
    java.lang.String[] getColumnNameArray();
    
    /**
     * Gets ith "ColumnName" element
     */
    java.lang.String getColumnNameArray(int i);
    
    /**
     * Gets (as xml) array of all "ColumnName" elements
     */
    org.apache.xmlbeans.XmlString[] xgetColumnNameArray();
    
    /**
     * Gets (as xml) ith "ColumnName" element
     */
    org.apache.xmlbeans.XmlString xgetColumnNameArray(int i);
    
    /**
     * Returns number of "ColumnName" element
     */
    int sizeOfColumnNameArray();
    
    /**
     * Sets array of all "ColumnName" element
     */
    void setColumnNameArray(java.lang.String[] columnNameArray);
    
    /**
     * Sets ith "ColumnName" element
     */
    void setColumnNameArray(int i, java.lang.String columnName);
    
    /**
     * Sets (as xml) array of all "ColumnName" element
     */
    void xsetColumnNameArray(org.apache.xmlbeans.XmlString[] columnNameArray);
    
    /**
     * Sets (as xml) ith "ColumnName" element
     */
    void xsetColumnNameArray(int i, org.apache.xmlbeans.XmlString columnName);
    
    /**
     * Inserts the value as the ith "ColumnName" element
     */
    void insertColumnName(int i, java.lang.String columnName);
    
    /**
     * Appends the value as the last "ColumnName" element
     */
    void addColumnName(java.lang.String columnName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ColumnName" element
     */
    org.apache.xmlbeans.XmlString insertNewColumnName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ColumnName" element
     */
    org.apache.xmlbeans.XmlString addNewColumnName();
    
    /**
     * Removes the ith "ColumnName" element
     */
    void removeColumnName(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey newInstance() {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
