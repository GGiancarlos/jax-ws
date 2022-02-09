
package org.example.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ICalculadora", targetNamespace = "http://example.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ICalculadora {


    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(name = "resultado", targetNamespace = "")
    @RequestWrapper(localName = "operar", targetNamespace = "http://example.org/", className = "org.example.ws.Operar")
    @ResponseWrapper(localName = "operarResponse", targetNamespace = "http://example.org/", className = "org.example.ws.OperarResponse")
    @Action(input = "http://example.org/ICalculadora/operarRequest", output = "http://example.org/ICalculadora/operarResponse")
    public double operar(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        double arg2);

}