
package EBank_Client_Employee;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EBankEmployee_WS", targetNamespace = "http://ebankEmployee_ws/", wsdlLocation = "http://localhost:29070/EBankEmployee_WS/EBankEmployee_WS?wsdl")
public class EBankEmployeeWS_Service
    extends Service
{

    private final static URL EBANKEMPLOYEEWS_WSDL_LOCATION;
    private final static WebServiceException EBANKEMPLOYEEWS_EXCEPTION;
    private final static QName EBANKEMPLOYEEWS_QNAME = new QName("http://ebankEmployee_ws/", "EBankEmployee_WS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:29070/EBankEmployee_WS/EBankEmployee_WS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EBANKEMPLOYEEWS_WSDL_LOCATION = url;
        EBANKEMPLOYEEWS_EXCEPTION = e;
    }

    public EBankEmployeeWS_Service() {
        super(__getWsdlLocation(), EBANKEMPLOYEEWS_QNAME);
    }

    public EBankEmployeeWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), EBANKEMPLOYEEWS_QNAME, features);
    }

    public EBankEmployeeWS_Service(URL wsdlLocation) {
        super(wsdlLocation, EBANKEMPLOYEEWS_QNAME);
    }

    public EBankEmployeeWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EBANKEMPLOYEEWS_QNAME, features);
    }

    public EBankEmployeeWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EBankEmployeeWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EBankEmployeeWS
     */
    @WebEndpoint(name = "EBankEmployee_WSPort")
    public EBankEmployeeWS getEBankEmployeeWSPort() {
        return super.getPort(new QName("http://ebankEmployee_ws/", "EBankEmployee_WSPort"), EBankEmployeeWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EBankEmployeeWS
     */
    @WebEndpoint(name = "EBankEmployee_WSPort")
    public EBankEmployeeWS getEBankEmployeeWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ebankEmployee_ws/", "EBankEmployee_WSPort"), EBankEmployeeWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EBANKEMPLOYEEWS_EXCEPTION!= null) {
            throw EBANKEMPLOYEEWS_EXCEPTION;
        }
        return EBANKEMPLOYEEWS_WSDL_LOCATION;
    }

}
