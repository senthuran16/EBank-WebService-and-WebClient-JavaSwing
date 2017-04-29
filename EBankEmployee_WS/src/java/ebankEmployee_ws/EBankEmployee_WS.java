/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebankEmployee_ws;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author USER
 */
@WebService(serviceName = "EBankEmployee_WS")
public class EBankEmployee_WS {

    // used to communicate to database
    static Controller control = new Controller();

    /**
     * checks whether a record with the 'value' for 'field', is available in
     * 'table'
     *
     * @param field
     * @param value
     * @param table
     * @return
     */
    @WebMethod(operationName = "checkAvailability")
    public boolean checkAvailability(@WebParam(name = "field") String field, @WebParam(name = "value") String value, @WebParam(name = "table") String table) throws Exception {
        return control.checkAvailability(field, value, table);
    }

    /**
     * displays all available employees
     *
     * @return : arraylist with all records. Each element represents one record
     */
    @WebMethod(operationName = "displayEmployees")
    public ArrayList<String> displayEmployees() throws Exception {
        return control.displayEmployees();
    }

    /**
     * returns the employee details where username is provided, for preparing
     * detailed employee details
     *
     * @param username
     * @return
     * @throws Exception
     */
    @WebMethod(operationName = "selectEmployee")
    public String[] selectEmployee(@WebParam(name = "username") String username) throws Exception {
        return control.selectEmployee(username);
    }

    /**
     * inserts a new employee into the database with the given parameters
     *
     * @param name
     * @param position
     * @param username
     * @param password
     * @throws Exception
     *
     * @return : 1 if success
     */
    @WebMethod(operationName = "createEmployee")
    public int createEmployee(@WebParam(name = "name") String name, @WebParam(name = "position") String position, @WebParam(name = "username") String username, @WebParam(name = "password") String password) throws Exception {
        return control.createEmployee(name, position, username, password);
    }

    /**
     * updates an employee record on the database with the given parameters,
     * username unchanged
     *
     * @param name
     * @param position
     * @param username
     * @param password
     * @throws Exception
     *
     * @return : 1 if success
     */
    @WebMethod(operationName = "editEmployee")
    public int editEmployee(@WebParam(name = "name") String name, @WebParam(name = "position") String position, @WebParam(name = "username") String username, @WebParam(name = "password") String password) throws Exception {
        return control.editEmployee(name, position, username, password);
    }

    /**
     * deletes an employee record from the database with the given username
     *
     * @param username
     * @throws Exception
     */
    @WebMethod(operationName = "deleteEmployee")
    public int deleteEmployee(@WebParam(name = "username") String username) throws Exception {
        return control.deleteEmployee(username);
    }

    /**
     * sets logged in status to true if the credentials are valid
     *
     * @param username : username of employee
     * @param password : password of employee
     *
     * @return : status of login (success / invalid / noUser)
     */
    @WebMethod(operationName = "login")
    public String login(@WebParam(name = "username") String username, @WebParam(name = "password") String password) throws Exception {
        return control.login(username, password);
    }

    /**
     * sets logged in status to false
     */
    @WebMethod(operationName = "logout")
    public void logout() {
        control.logout();
    }

}
