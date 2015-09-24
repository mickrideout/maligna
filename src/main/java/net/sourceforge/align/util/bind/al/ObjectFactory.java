//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.04.17 at 02:14:49 PM CEST 
//


package net.sourceforge.align.util.bind.al;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the align.util.bind.al package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Sourcelist_QNAME = new QName("", "sourcelist");
    private final static QName _Segment_QNAME = new QName("", "segment");
    private final static QName _Targetlist_QNAME = new QName("", "targetlist");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: align.util.bind.al
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Alignmentlist }
     * 
     */
    public Alignmentlist createAlignmentlist() {
        return new Alignmentlist();
    }

    /**
     * Create an instance of {@link Segmentlist }
     * 
     */
    public Segmentlist createSegmentlist() {
        return new Segmentlist();
    }

    /**
     * Create an instance of {@link Alignment }
     * 
     */
    public Alignment createAlignment() {
        return new Alignment();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Segmentlist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sourcelist")
    public JAXBElement<Segmentlist> createSourcelist(Segmentlist value) {
        return new JAXBElement<Segmentlist>(_Sourcelist_QNAME, Segmentlist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "segment")
    public JAXBElement<String> createSegment(String value) {
        return new JAXBElement<String>(_Segment_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Segmentlist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "targetlist")
    public JAXBElement<Segmentlist> createTargetlist(Segmentlist value) {
        return new JAXBElement<Segmentlist>(_Targetlist_QNAME, Segmentlist.class, null, value);
    }

}