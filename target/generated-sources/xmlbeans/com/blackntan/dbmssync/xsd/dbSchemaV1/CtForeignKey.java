/*
 * XML Type:  ct_ForeignKey
 * Namespace: http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd
 * Java type: com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey
 *
 * Automatically generated - do not modify.
 */
package com.blackntan.dbmssync.xsd.dbSchemaV1;


/**
 * An XML ct_ForeignKey(@http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd).
 *
 * This is a complex type.
 */
public interface CtForeignKey extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CtForeignKey.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFD33422165C811F783D9C99D91C0269B").resolveHandle("ctforeignkey7344type");
    
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
     * Gets the "ReferencesSchemaName" element
     */
    java.lang.String getReferencesSchemaName();
    
    /**
     * Gets (as xml) the "ReferencesSchemaName" element
     */
    org.apache.xmlbeans.XmlString xgetReferencesSchemaName();
    
    /**
     * Sets the "ReferencesSchemaName" element
     */
    void setReferencesSchemaName(java.lang.String referencesSchemaName);
    
    /**
     * Sets (as xml) the "ReferencesSchemaName" element
     */
    void xsetReferencesSchemaName(org.apache.xmlbeans.XmlString referencesSchemaName);
    
    /**
     * Gets the "ReferencesTableName" element
     */
    java.lang.String getReferencesTableName();
    
    /**
     * Gets (as xml) the "ReferencesTableName" element
     */
    org.apache.xmlbeans.XmlString xgetReferencesTableName();
    
    /**
     * Sets the "ReferencesTableName" element
     */
    void setReferencesTableName(java.lang.String referencesTableName);
    
    /**
     * Sets (as xml) the "ReferencesTableName" element
     */
    void xsetReferencesTableName(org.apache.xmlbeans.XmlString referencesTableName);
    
    /**
     * Gets array of all "ColumnReference" elements
     */
    com.blackntan.dbmssync.xsd.dbSchemaV1.CtFkColumnRef[] getColumnReferenceArray();
    
    /**
     * Gets ith "ColumnReference" element
     */
    com.blackntan.dbmssync.xsd.dbSchemaV1.CtFkColumnRef getColumnReferenceArray(int i);
    
    /**
     * Returns number of "ColumnReference" element
     */
    int sizeOfColumnReferenceArray();
    
    /**
     * Sets array of all "ColumnReference" element
     */
    void setColumnReferenceArray(com.blackntan.dbmssync.xsd.dbSchemaV1.CtFkColumnRef[] columnReferenceArray);
    
    /**
     * Sets ith "ColumnReference" element
     */
    void setColumnReferenceArray(int i, com.blackntan.dbmssync.xsd.dbSchemaV1.CtFkColumnRef columnReference);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ColumnReference" element
     */
    com.blackntan.dbmssync.xsd.dbSchemaV1.CtFkColumnRef insertNewColumnReference(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ColumnReference" element
     */
    com.blackntan.dbmssync.xsd.dbSchemaV1.CtFkColumnRef addNewColumnReference();
    
    /**
     * Removes the ith "ColumnReference" element
     */
    void removeColumnReference(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey newInstance() {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtForeignKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
