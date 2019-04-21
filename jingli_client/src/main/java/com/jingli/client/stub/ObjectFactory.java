
package com.jingli.client.stub;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jingli.client.stub package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jingli.client.stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DacOrderStateUpdateRequest }
     * 
     */
    public DacOrderStateUpdateRequest createDacOrderStateUpdateRequest() {
        return new DacOrderStateUpdateRequest();
    }

    /**
     * Create an instance of {@link OrderStateInfo }
     * 
     */
    public OrderStateInfo createOrderStateInfo() {
        return new OrderStateInfo();
    }

    /**
     * Create an instance of {@link DacOrderStateUpdateResponse }
     * 
     */
    public DacOrderStateUpdateResponse createDacOrderStateUpdateResponse() {
        return new DacOrderStateUpdateResponse();
    }

    /**
     * Create an instance of {@link MapString }
     * 
     */
    public MapString createMapString() {
        return new MapString();
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     */
    public Ticket createTicket() {
        return new Ticket();
    }

}
