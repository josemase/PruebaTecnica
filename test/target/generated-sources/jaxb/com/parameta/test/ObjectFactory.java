//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.11.12 a las 09:33:44 PM COT 
//


package com.parameta.test;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.parameta.test package. 
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

    private final static QName _AddEmpleadoRequest_QNAME = new QName("http://parameta.com/test", "addEmpleadoRequest");
    private final static QName _AddEmpleadoResponse_QNAME = new QName("http://parameta.com/test", "addEmpleadoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.parameta.test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddEmpleadoRequest }
     * 
     */
    public AddEmpleadoRequest createAddEmpleadoRequest() {
        return new AddEmpleadoRequest();
    }

    /**
     * Create an instance of {@link AddEmpleadoResponse }
     * 
     */
    public AddEmpleadoResponse createAddEmpleadoResponse() {
        return new AddEmpleadoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmpleadoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddEmpleadoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://parameta.com/test", name = "addEmpleadoRequest")
    public JAXBElement<AddEmpleadoRequest> createAddEmpleadoRequest(AddEmpleadoRequest value) {
        return new JAXBElement<AddEmpleadoRequest>(_AddEmpleadoRequest_QNAME, AddEmpleadoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmpleadoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddEmpleadoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://parameta.com/test", name = "addEmpleadoResponse")
    public JAXBElement<AddEmpleadoResponse> createAddEmpleadoResponse(AddEmpleadoResponse value) {
        return new JAXBElement<AddEmpleadoResponse>(_AddEmpleadoResponse_QNAME, AddEmpleadoResponse.class, null, value);
    }

}
