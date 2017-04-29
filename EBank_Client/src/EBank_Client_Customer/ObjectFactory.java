
package EBank_Client_Customer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the EBank_Client_Customer package. 
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

    private final static QName _DisplayCustomer_QNAME = new QName("http://ebankCustomer_ws/", "displayCustomer");
    private final static QName _CreateCustomer_QNAME = new QName("http://ebankCustomer_ws/", "createCustomer");
    private final static QName _CreateCustomerResponse_QNAME = new QName("http://ebankCustomer_ws/", "createCustomerResponse");
    private final static QName _EditCustomer_QNAME = new QName("http://ebankCustomer_ws/", "editCustomer");
    private final static QName _Exception_QNAME = new QName("http://ebankCustomer_ws/", "Exception");
    private final static QName _DisplayCustomerResponse_QNAME = new QName("http://ebankCustomer_ws/", "displayCustomerResponse");
    private final static QName _CheckAvailability_QNAME = new QName("http://ebankCustomer_ws/", "checkAvailability");
    private final static QName _DeleteCustomer_QNAME = new QName("http://ebankCustomer_ws/", "deleteCustomer");
    private final static QName _SelectCustomerResponse_QNAME = new QName("http://ebankCustomer_ws/", "selectCustomerResponse");
    private final static QName _EditCustomerResponse_QNAME = new QName("http://ebankCustomer_ws/", "editCustomerResponse");
    private final static QName _DeleteCustomerResponse_QNAME = new QName("http://ebankCustomer_ws/", "deleteCustomerResponse");
    private final static QName _SelectCustomer_QNAME = new QName("http://ebankCustomer_ws/", "selectCustomer");
    private final static QName _CheckAvailabilityResponse_QNAME = new QName("http://ebankCustomer_ws/", "checkAvailabilityResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: EBank_Client_Customer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EditCustomer }
     * 
     */
    public EditCustomer createEditCustomer() {
        return new EditCustomer();
    }

    /**
     * Create an instance of {@link CreateCustomer }
     * 
     */
    public CreateCustomer createCreateCustomer() {
        return new CreateCustomer();
    }

    /**
     * Create an instance of {@link DisplayCustomer }
     * 
     */
    public DisplayCustomer createDisplayCustomer() {
        return new DisplayCustomer();
    }

    /**
     * Create an instance of {@link CreateCustomerResponse }
     * 
     */
    public CreateCustomerResponse createCreateCustomerResponse() {
        return new CreateCustomerResponse();
    }

    /**
     * Create an instance of {@link DeleteCustomer }
     * 
     */
    public DeleteCustomer createDeleteCustomer() {
        return new DeleteCustomer();
    }

    /**
     * Create an instance of {@link CheckAvailability }
     * 
     */
    public CheckAvailability createCheckAvailability() {
        return new CheckAvailability();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link DisplayCustomerResponse }
     * 
     */
    public DisplayCustomerResponse createDisplayCustomerResponse() {
        return new DisplayCustomerResponse();
    }

    /**
     * Create an instance of {@link SelectCustomerResponse }
     * 
     */
    public SelectCustomerResponse createSelectCustomerResponse() {
        return new SelectCustomerResponse();
    }

    /**
     * Create an instance of {@link CheckAvailabilityResponse }
     * 
     */
    public CheckAvailabilityResponse createCheckAvailabilityResponse() {
        return new CheckAvailabilityResponse();
    }

    /**
     * Create an instance of {@link DeleteCustomerResponse }
     * 
     */
    public DeleteCustomerResponse createDeleteCustomerResponse() {
        return new DeleteCustomerResponse();
    }

    /**
     * Create an instance of {@link SelectCustomer }
     * 
     */
    public SelectCustomer createSelectCustomer() {
        return new SelectCustomer();
    }

    /**
     * Create an instance of {@link EditCustomerResponse }
     * 
     */
    public EditCustomerResponse createEditCustomerResponse() {
        return new EditCustomerResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankCustomer_ws/", name = "displayCustomer")
    public JAXBElement<DisplayCustomer> createDisplayCustomer(DisplayCustomer value) {
        return new JAXBElement<DisplayCustomer>(_DisplayCustomer_QNAME, DisplayCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankCustomer_ws/", name = "createCustomer")
    public JAXBElement<CreateCustomer> createCreateCustomer(CreateCustomer value) {
        return new JAXBElement<CreateCustomer>(_CreateCustomer_QNAME, CreateCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankCustomer_ws/", name = "createCustomerResponse")
    public JAXBElement<CreateCustomerResponse> createCreateCustomerResponse(CreateCustomerResponse value) {
        return new JAXBElement<CreateCustomerResponse>(_CreateCustomerResponse_QNAME, CreateCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankCustomer_ws/", name = "editCustomer")
    public JAXBElement<EditCustomer> createEditCustomer(EditCustomer value) {
        return new JAXBElement<EditCustomer>(_EditCustomer_QNAME, EditCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankCustomer_ws/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankCustomer_ws/", name = "displayCustomerResponse")
    public JAXBElement<DisplayCustomerResponse> createDisplayCustomerResponse(DisplayCustomerResponse value) {
        return new JAXBElement<DisplayCustomerResponse>(_DisplayCustomerResponse_QNAME, DisplayCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAvailability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankCustomer_ws/", name = "checkAvailability")
    public JAXBElement<CheckAvailability> createCheckAvailability(CheckAvailability value) {
        return new JAXBElement<CheckAvailability>(_CheckAvailability_QNAME, CheckAvailability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankCustomer_ws/", name = "deleteCustomer")
    public JAXBElement<DeleteCustomer> createDeleteCustomer(DeleteCustomer value) {
        return new JAXBElement<DeleteCustomer>(_DeleteCustomer_QNAME, DeleteCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankCustomer_ws/", name = "selectCustomerResponse")
    public JAXBElement<SelectCustomerResponse> createSelectCustomerResponse(SelectCustomerResponse value) {
        return new JAXBElement<SelectCustomerResponse>(_SelectCustomerResponse_QNAME, SelectCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankCustomer_ws/", name = "editCustomerResponse")
    public JAXBElement<EditCustomerResponse> createEditCustomerResponse(EditCustomerResponse value) {
        return new JAXBElement<EditCustomerResponse>(_EditCustomerResponse_QNAME, EditCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankCustomer_ws/", name = "deleteCustomerResponse")
    public JAXBElement<DeleteCustomerResponse> createDeleteCustomerResponse(DeleteCustomerResponse value) {
        return new JAXBElement<DeleteCustomerResponse>(_DeleteCustomerResponse_QNAME, DeleteCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankCustomer_ws/", name = "selectCustomer")
    public JAXBElement<SelectCustomer> createSelectCustomer(SelectCustomer value) {
        return new JAXBElement<SelectCustomer>(_SelectCustomer_QNAME, SelectCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAvailabilityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankCustomer_ws/", name = "checkAvailabilityResponse")
    public JAXBElement<CheckAvailabilityResponse> createCheckAvailabilityResponse(CheckAvailabilityResponse value) {
        return new JAXBElement<CheckAvailabilityResponse>(_CheckAvailabilityResponse_QNAME, CheckAvailabilityResponse.class, null, value);
    }

}
