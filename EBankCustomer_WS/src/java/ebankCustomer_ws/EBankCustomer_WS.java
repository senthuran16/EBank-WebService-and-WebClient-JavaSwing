/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebankCustomer_ws;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author USER
 */
@WebService(serviceName = "EBankCustomer_WS")
public class EBankCustomer_WS {

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
     * displays all available customers & account numbers
     *
     * @return : arraylist with all records. Each element represents one record
     */
    @WebMethod(operationName = "displayCustomer")
    public ArrayList<String> displayCustomer() throws Exception {
        return control.displayCustomer();
    }

    /**
     * returns the customer details where account number is provided, for
     * preparing detailed customer account details
     *
     * @param accountNumber
     * @return
     * @throws Exception
     */
    @WebMethod(operationName = "selectCustomer")
    public String[] selectCustomer(@WebParam(name = "accountNumber") String accountNumber) throws Exception {
        return control.selectCustomer(accountNumber);
    }

    /**
     * creates a new customer record in the database with the passed parameter
     * content
     *
     * @param name
     * @param birthDate
     * @param address
     * @param mobile
     * @param email
     * @param accountType
     * @param accountNumber
     * @param sortCode
     * @param balance
     * @param card
     */
    @WebMethod(operationName = "createCustomer")
    public int createCustomer(@WebParam(name = "name") String name, @WebParam(name = "birthDate") String birthDate, @WebParam(name = "address") String address, @WebParam(name = "mobile") String mobile, @WebParam(name = "email") String email, @WebParam(name = "accountType") String accountType, @WebParam(name = "accountNumber") String accountNumber, @WebParam(name = "sortCode") String sortCode, @WebParam(name = "balance") double balance, @WebParam(name = "card") String card) throws Exception {
        return control.createCustomer(name, birthDate, address, mobile, email, accountType, accountNumber, sortCode, balance, card);
    }

    /**
     * edits a customer record with the given parameter, email & account number
     * un changed
     *
     * @param name
     * @param birthDate
     * @param address
     * @param mobile
     * @param email
     * @param accountType
     * @param accountNumber
     * @param sortCode
     * @param balance
     * @param card
     */
    @WebMethod(operationName = "editCustomer")
    public int editCustomer(@WebParam(name = "name") String name, @WebParam(name = "birthDate") String birthDate, @WebParam(name = "address") String address, @WebParam(name = "mobile") String mobile, @WebParam(name = "email") String email, @WebParam(name = "accountType") String accountType, @WebParam(name = "accountNumber") String accountNumber, @WebParam(name = "sortCode") String sortCode, @WebParam(name = "balance") double balance, @WebParam(name = "card") String card) throws Exception {
        return control.editCustomer(name, birthDate, address, mobile, email, accountType, accountNumber, sortCode, balance, card);
    }

    /**
     * delete the customer, with the given email & account number
     *
     * @param email
     * @param accountNumber
     */
    @WebMethod(operationName = "deleteCustomer")
    public int deleteCustomer(@WebParam(name = "accountNumber") String accountNumber) throws Exception {
        return control.deleteCustomer(accountNumber);
    }

}
