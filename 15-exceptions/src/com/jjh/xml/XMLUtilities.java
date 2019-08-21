package com.jjh.xml;

import java.io.IOException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class XMLUtilities {
    
    /**
     * Return an empty document for DOMBuilding
     * @return org.w3c.dom.Document
     */
    protected Document getEmptyDocument() {
        Document doc = null;
        try {
            doc = DOMFactory.getDocument();
        } catch (IOException exp) {
            throw new DataAccessManagerException(exp.getMessage(), exp);
        } catch (SAXException exp) {
            throw new DataAccessManagerException(exp.getMessage(), exp);
        }
        return doc;
    }

}
