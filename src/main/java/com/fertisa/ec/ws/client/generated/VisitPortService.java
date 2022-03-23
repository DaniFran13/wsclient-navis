
package com.fertisa.ec.ws.client.generated;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "VisitPortService", targetNamespace = "http://spring.io/guides/gs-producing-web-service", wsdlLocation = "file:/home/hriera/workspace/wsclient-navis/src/main/resources/demo.wsdl")
public class VisitPortService
    extends Service
{

    private final static URL VISITPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException VISITPORTSERVICE_EXCEPTION;
    private final static QName VISITPORTSERVICE_QNAME = new QName("http://spring.io/guides/gs-producing-web-service", "VisitPortService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/home/hriera/workspace/wsclient-navis/src/main/resources/demo.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VISITPORTSERVICE_WSDL_LOCATION = url;
        VISITPORTSERVICE_EXCEPTION = e;
    }

    public VisitPortService() {
        super(__getWsdlLocation(), VISITPORTSERVICE_QNAME);
    }

    public VisitPortService(WebServiceFeature... features) {
        super(__getWsdlLocation(), VISITPORTSERVICE_QNAME, features);
    }

    public VisitPortService(URL wsdlLocation) {
        super(wsdlLocation, VISITPORTSERVICE_QNAME);
    }

    public VisitPortService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VISITPORTSERVICE_QNAME, features);
    }

    public VisitPortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VisitPortService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns VisitPort
     */
    @WebEndpoint(name = "VisitPortSoap11")
    public VisitPort getVisitPortSoap11() {
        return super.getPort(new QName("http://spring.io/guides/gs-producing-web-service", "VisitPortSoap11"), VisitPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VisitPort
     */
    @WebEndpoint(name = "VisitPortSoap11")
    public VisitPort getVisitPortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://spring.io/guides/gs-producing-web-service", "VisitPortSoap11"), VisitPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VISITPORTSERVICE_EXCEPTION!= null) {
            throw VISITPORTSERVICE_EXCEPTION;
        }
        return VISITPORTSERVICE_WSDL_LOCATION;
    }

}
