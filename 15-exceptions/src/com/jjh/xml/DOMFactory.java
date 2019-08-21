package com.jjh.xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;

/**
 * The DOMFactory provides static factory methods creating Documents.
 * 
 * @author John Hunt
 * @version 1.0
 */

public final class DOMFactory {

    // =====================================================================
    // Static declarations
    // =====================================================================

    // ---------------------------------------------------------------------
    // Class/Static variables
    // ---------------------------------------------------------------------

    /** holds the one and only instance of the DocumentBuilder. */
    private static DocumentBuilder dbuilder = getDocumentBuilder();

    private DOMFactory() {
        
    }
    
    // =====================================================================
    // Class methods
    // =====================================================================

    /**
     * Returns an empty Document (can be used when building Documents).
     * 
     * @return an empty Document
     */
    public static Document getDocument() throws org.xml.sax.SAXException,
            java.io.IOException {

        return dbuilder.newDocument();
    }

    /**
     * Parses specified XML file and returns a Document.
     * 
     * @return the Document representation of the XML file specified
     * @param uri
     *                filename of XML file for which DOM rep is required<br />
     *                This must be full file path - use PropertyManager
     */
    public static Document getDocument(String uri)
            throws org.xml.sax.SAXException, java.io.IOException {
        if (dbuilder == null) {
            try {
                dbuilder = getBuilder(true, true);
            } catch (ParserConfigurationException pce) {
                throw new RuntimeException("ParserConfigurationException", pce);
            }
        }
        return dbuilder.parse(uri);
    }
    
    /**
     * helper to return a DocumentBuilder with required properties.
     */
    private static DocumentBuilder getBuilder(boolean validation,
            boolean namespaceAware) throws ParserConfigurationException {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setValidating(validation);
        dbf.setNamespaceAware(namespaceAware);
        DocumentBuilder db = dbf.newDocumentBuilder();
        return db;
    }

    /**
     * Returns the single copy of DocumentBuilder or creates one if necessary.
     * 
     * @return the single copy of DocumentBuilder
     */
    private static DocumentBuilder getDocumentBuilder() {

        if (dbuilder == null) {
            try {
                dbuilder = getBuilder(true, true);
            } catch (ParserConfigurationException pce) {
                throw new RuntimeException("ParserConfigurationException", pce);
            }
        }
        return dbuilder;
    }
}
