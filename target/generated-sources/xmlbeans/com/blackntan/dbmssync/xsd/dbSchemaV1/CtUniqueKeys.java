/*
 * XML Type:  ct_UniqueKeys
 * Namespace: http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd
 * Java type: com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys
 *
 * Automatically generated - do not modify.
 */
package com.blackntan.dbmssync.xsd.dbSchemaV1;


/**
 * An XML ct_UniqueKeys(@http://xsd.dbmssync.blackntan.com/DBSchema_v1.xsd).
 *
 * This is a complex type.
 */
public interface CtUniqueKeys extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CtUniqueKeys.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFD33422165C811F783D9C99D91C0269B").resolveHandle("ctuniquekeys793etype");
    
    /**
     * Gets array of all "UniqueKey" elements
     */
    com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey[] getUniqueKeyArray();
    
    /**
     * Gets ith "UniqueKey" element
     */
    com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey getUniqueKeyArray(int i);
    
    /**
     * Returns number of "UniqueKey" element
     */
    int sizeOfUniqueKeyArray();
    
    /**
     * Sets array of all "UniqueKey" element
     */
    void setUniqueKeyArray(com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey[] uniqueKeyArray);
    
    /**
     * Sets ith "UniqueKey" element
     */
    void setUniqueKeyArray(int i, com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey uniqueKey);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "UniqueKey" element
     */
    com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey insertNewUniqueKey(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "UniqueKey" element
     */
    com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKey addNewUniqueKey();
    
    /**
     * Removes the ith "UniqueKey" element
     */
    void removeUniqueKey(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys newInstance() {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.blackntan.dbmssync.xsd.dbSchemaV1.CtUniqueKeys) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
