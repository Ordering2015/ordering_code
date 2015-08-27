
package com.dao;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CustomerDaoService", targetNamespace = "http://dao.com/", wsdlLocation = "http://192.168.0.121:50/CustomerOrdersService?wsdl")
public class CustomerDaoService
    extends Service
{

    private final static URL CUSTOMERDAOSERVICE_WSDL_LOCATION;
    private final static WebServiceException CUSTOMERDAOSERVICE_EXCEPTION;
    private final static QName CUSTOMERDAOSERVICE_QNAME = new QName("http://dao.com/", "CustomerDaoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.0.121:50/CustomerOrdersService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CUSTOMERDAOSERVICE_WSDL_LOCATION = url;
        CUSTOMERDAOSERVICE_EXCEPTION = e;
    }

    public CustomerDaoService() {
        super(__getWsdlLocation(), CUSTOMERDAOSERVICE_QNAME);
    }

    public CustomerDaoService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CUSTOMERDAOSERVICE_QNAME, features);
    }

    public CustomerDaoService(URL wsdlLocation) {
        super(wsdlLocation, CUSTOMERDAOSERVICE_QNAME);
    }

    public CustomerDaoService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CUSTOMERDAOSERVICE_QNAME, features);
    }

    public CustomerDaoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CustomerDaoService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CustomerDao
     */
    @WebEndpoint(name = "CustomerDaoPort")
    public CustomerDao getCustomerDaoPort() {
        return super.getPort(new QName("http://dao.com/", "CustomerDaoPort"), CustomerDao.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CustomerDao
     */
    @WebEndpoint(name = "CustomerDaoPort")
    public CustomerDao getCustomerDaoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://dao.com/", "CustomerDaoPort"), CustomerDao.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CUSTOMERDAOSERVICE_EXCEPTION!= null) {
            throw CUSTOMERDAOSERVICE_EXCEPTION;
        }
        return CUSTOMERDAOSERVICE_WSDL_LOCATION;
    }

}