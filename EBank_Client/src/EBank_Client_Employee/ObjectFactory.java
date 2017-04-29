
package EBank_Client_Employee;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the EBank_Client_Employee package. 
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

    private final static QName _LoginResponse_QNAME = new QName("http://ebankEmployee_ws/", "loginResponse");
    private final static QName _LogoutResponse_QNAME = new QName("http://ebankEmployee_ws/", "logoutResponse");
    private final static QName _Login_QNAME = new QName("http://ebankEmployee_ws/", "login");
    private final static QName _Exception_QNAME = new QName("http://ebankEmployee_ws/", "Exception");
    private final static QName _SelectEmployee_QNAME = new QName("http://ebankEmployee_ws/", "selectEmployee");
    private final static QName _SelectEmployeeResponse_QNAME = new QName("http://ebankEmployee_ws/", "selectEmployeeResponse");
    private final static QName _CreateEmployee_QNAME = new QName("http://ebankEmployee_ws/", "createEmployee");
    private final static QName _DisplayEmployees_QNAME = new QName("http://ebankEmployee_ws/", "displayEmployees");
    private final static QName _CheckAvailability_QNAME = new QName("http://ebankEmployee_ws/", "checkAvailability");
    private final static QName _EditEmployeeResponse_QNAME = new QName("http://ebankEmployee_ws/", "editEmployeeResponse");
    private final static QName _Logout_QNAME = new QName("http://ebankEmployee_ws/", "logout");
    private final static QName _DeleteEmployeeResponse_QNAME = new QName("http://ebankEmployee_ws/", "deleteEmployeeResponse");
    private final static QName _EditEmployee_QNAME = new QName("http://ebankEmployee_ws/", "editEmployee");
    private final static QName _DeleteEmployee_QNAME = new QName("http://ebankEmployee_ws/", "deleteEmployee");
    private final static QName _DisplayEmployeesResponse_QNAME = new QName("http://ebankEmployee_ws/", "displayEmployeesResponse");
    private final static QName _CheckAvailabilityResponse_QNAME = new QName("http://ebankEmployee_ws/", "checkAvailabilityResponse");
    private final static QName _CreateEmployeeResponse_QNAME = new QName("http://ebankEmployee_ws/", "createEmployeeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: EBank_Client_Employee
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link SelectEmployeeResponse }
     * 
     */
    public SelectEmployeeResponse createSelectEmployeeResponse() {
        return new SelectEmployeeResponse();
    }

    /**
     * Create an instance of {@link CreateEmployee }
     * 
     */
    public CreateEmployee createCreateEmployee() {
        return new CreateEmployee();
    }

    /**
     * Create an instance of {@link DisplayEmployees }
     * 
     */
    public DisplayEmployees createDisplayEmployees() {
        return new DisplayEmployees();
    }

    /**
     * Create an instance of {@link CheckAvailability }
     * 
     */
    public CheckAvailability createCheckAvailability() {
        return new CheckAvailability();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link SelectEmployee }
     * 
     */
    public SelectEmployee createSelectEmployee() {
        return new SelectEmployee();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link DeleteEmployeeResponse }
     * 
     */
    public DeleteEmployeeResponse createDeleteEmployeeResponse() {
        return new DeleteEmployeeResponse();
    }

    /**
     * Create an instance of {@link EditEmployee }
     * 
     */
    public EditEmployee createEditEmployee() {
        return new EditEmployee();
    }

    /**
     * Create an instance of {@link EditEmployeeResponse }
     * 
     */
    public EditEmployeeResponse createEditEmployeeResponse() {
        return new EditEmployeeResponse();
    }

    /**
     * Create an instance of {@link CheckAvailabilityResponse }
     * 
     */
    public CheckAvailabilityResponse createCheckAvailabilityResponse() {
        return new CheckAvailabilityResponse();
    }

    /**
     * Create an instance of {@link CreateEmployeeResponse }
     * 
     */
    public CreateEmployeeResponse createCreateEmployeeResponse() {
        return new CreateEmployeeResponse();
    }

    /**
     * Create an instance of {@link DeleteEmployee }
     * 
     */
    public DeleteEmployee createDeleteEmployee() {
        return new DeleteEmployee();
    }

    /**
     * Create an instance of {@link DisplayEmployeesResponse }
     * 
     */
    public DisplayEmployeesResponse createDisplayEmployeesResponse() {
        return new DisplayEmployeesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankEmployee_ws/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankEmployee_ws/", name = "logoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankEmployee_ws/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankEmployee_ws/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankEmployee_ws/", name = "selectEmployee")
    public JAXBElement<SelectEmployee> createSelectEmployee(SelectEmployee value) {
        return new JAXBElement<SelectEmployee>(_SelectEmployee_QNAME, SelectEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankEmployee_ws/", name = "selectEmployeeResponse")
    public JAXBElement<SelectEmployeeResponse> createSelectEmployeeResponse(SelectEmployeeResponse value) {
        return new JAXBElement<SelectEmployeeResponse>(_SelectEmployeeResponse_QNAME, SelectEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankEmployee_ws/", name = "createEmployee")
    public JAXBElement<CreateEmployee> createCreateEmployee(CreateEmployee value) {
        return new JAXBElement<CreateEmployee>(_CreateEmployee_QNAME, CreateEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayEmployees }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankEmployee_ws/", name = "displayEmployees")
    public JAXBElement<DisplayEmployees> createDisplayEmployees(DisplayEmployees value) {
        return new JAXBElement<DisplayEmployees>(_DisplayEmployees_QNAME, DisplayEmployees.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAvailability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankEmployee_ws/", name = "checkAvailability")
    public JAXBElement<CheckAvailability> createCheckAvailability(CheckAvailability value) {
        return new JAXBElement<CheckAvailability>(_CheckAvailability_QNAME, CheckAvailability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankEmployee_ws/", name = "editEmployeeResponse")
    public JAXBElement<EditEmployeeResponse> createEditEmployeeResponse(EditEmployeeResponse value) {
        return new JAXBElement<EditEmployeeResponse>(_EditEmployeeResponse_QNAME, EditEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankEmployee_ws/", name = "logout")
    public JAXBElement<Logout> createLogout(Logout value) {
        return new JAXBElement<Logout>(_Logout_QNAME, Logout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankEmployee_ws/", name = "deleteEmployeeResponse")
    public JAXBElement<DeleteEmployeeResponse> createDeleteEmployeeResponse(DeleteEmployeeResponse value) {
        return new JAXBElement<DeleteEmployeeResponse>(_DeleteEmployeeResponse_QNAME, DeleteEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankEmployee_ws/", name = "editEmployee")
    public JAXBElement<EditEmployee> createEditEmployee(EditEmployee value) {
        return new JAXBElement<EditEmployee>(_EditEmployee_QNAME, EditEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankEmployee_ws/", name = "deleteEmployee")
    public JAXBElement<DeleteEmployee> createDeleteEmployee(DeleteEmployee value) {
        return new JAXBElement<DeleteEmployee>(_DeleteEmployee_QNAME, DeleteEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayEmployeesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankEmployee_ws/", name = "displayEmployeesResponse")
    public JAXBElement<DisplayEmployeesResponse> createDisplayEmployeesResponse(DisplayEmployeesResponse value) {
        return new JAXBElement<DisplayEmployeesResponse>(_DisplayEmployeesResponse_QNAME, DisplayEmployeesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAvailabilityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankEmployee_ws/", name = "checkAvailabilityResponse")
    public JAXBElement<CheckAvailabilityResponse> createCheckAvailabilityResponse(CheckAvailabilityResponse value) {
        return new JAXBElement<CheckAvailabilityResponse>(_CheckAvailabilityResponse_QNAME, CheckAvailabilityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankEmployee_ws/", name = "createEmployeeResponse")
    public JAXBElement<CreateEmployeeResponse> createCreateEmployeeResponse(CreateEmployeeResponse value) {
        return new JAXBElement<CreateEmployeeResponse>(_CreateEmployeeResponse_QNAME, CreateEmployeeResponse.class, null, value);
    }

}
