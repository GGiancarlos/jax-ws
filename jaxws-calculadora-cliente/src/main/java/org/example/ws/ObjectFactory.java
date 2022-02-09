
package org.example.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example package. 
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

    private final static QName _OperarResponse_QNAME = new QName("http://example.org/", "operarResponse");
    private final static QName _Operar_QNAME = new QName("http://example.org/", "operar");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OperarResponse }
     * 
     */
    public OperarResponse createOperarResponse() {
        return new OperarResponse();
    }

    /**
     * Create an instance of {@link Operar }
     * 
     */
    public Operar createOperar() {
        return new Operar();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "operarResponse")
    public JAXBElement<OperarResponse> createOperarResponse(OperarResponse value) {
        return new JAXBElement<OperarResponse>(_OperarResponse_QNAME, OperarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "operar")
    public JAXBElement<Operar> createOperar(Operar value) {
        return new JAXBElement<Operar>(_Operar_QNAME, Operar.class, null, value);
    }

}
