
package com.fertisa.ec.ws.client.generated;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fertisa.ec.ws.client.generated package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fertisa.ec.ws.client.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindAllVisitRequest }
     * 
     */
    public FindAllVisitRequest createFindAllVisitRequest() {
        return new FindAllVisitRequest();
    }

    /**
     * Create an instance of {@link FindVisitTruckRequest }
     * 
     */
    public FindVisitTruckRequest createFindVisitTruckRequest() {
        return new FindVisitTruckRequest();
    }

    /**
     * Create an instance of {@link FindAllVisitResponse }
     * 
     */
    public FindAllVisitResponse createFindAllVisitResponse() {
        return new FindAllVisitResponse();
    }

    /**
     * Create an instance of {@link VisitDetails }
     * 
     */
    public VisitDetails createVisitDetails() {
        return new VisitDetails();
    }

    /**
     * Create an instance of {@link Driver }
     * 
     */
    public Driver createDriver() {
        return new Driver();
    }

    /**
     * Create an instance of {@link Cargo }
     * 
     */
    public Cargo createCargo() {
        return new Cargo();
    }

}
