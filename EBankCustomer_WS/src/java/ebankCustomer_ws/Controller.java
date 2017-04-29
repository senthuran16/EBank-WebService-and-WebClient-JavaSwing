/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebankCustomer_ws;

/**
 * EBank Customer Web Service
 * 
 * @author USER
 */

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.awt.Color;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Controller {

    // create a controller
    // this will be travelling across all the GUIs when needed
    static Controller controller = new Controller();

    // JDBC driver
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    // database URL
    static final String DB_URL = "jdbc:mysql://localhost/ebank";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "";

    // database connectivity
    Connection conn = null;
    Statement stmt = null;

    // logged in status
    boolean isLoggedIn = false;
    // logged in user
    String username;


    /**
     * establish connection to the database
     */
    public void connect() throws Exception {

        //register JDBC driver
        Class.forName("com.mysql.jdbc.Driver");

        //open a connection
        conn = DriverManager.getConnection(DB_URL, USER, PASS);

        //execute a query
        stmt = this.conn.createStatement();

    }

    /**
     * closes connection to the database
     */
    public void closeConnection() throws SQLException {

        if (stmt != null) {
            stmt.close();
        }
        if (conn != null) {
            conn.close();
        }

    }

    /**
     * checks whether a record with the 'value' for 'field', is available in
     * 'table'
     *
     * @param field
     * @param value
     * @param table
     * @return
     */
    public boolean checkAvailability(String field, String value, String table) throws Exception {

        // method is called after connection establishment
        // execte sql query
        String sql = "SELECT " + field + " FROM " + table + " WHERE " + field + " = '" + value + "'";
        ResultSet rs = stmt.executeQuery(sql);

        // to check whether rs is null
        int counter = 0;

        //extract data from result set
        while (rs.next()) {
            counter++;
        }

        // count returned results set
        if (counter == 0) {

            // multiple records found
            throw new Exception("No records with value '" + value + "' for field '" + field + "' found in table '" + table + "'. Make sure reference value(s) is/are correct");

        } else if (counter == 1) {

            // only one record found
            return true;

        } else {

            // multiple records found
            throw new Exception("Multiple records with value '" + value + "' for field '" + field + "' found in table '" + table + "'. Make sure reference value(s) is/are correct");

        }

    }


    /////////////////////////////////////////
    // CUSTOMERS LIST PAGE //////////////////
    /**
     * displays all available customers & account numbers
     *
     * @return : arraylist with all records. Each element represents one record
     */
    public ArrayList<String> displayCustomer() throws Exception {

        // this arrayList will be used to store got data
        ArrayList<String> data = new ArrayList<String>();

        try {

            // establish connection
            connect();

            // execte sql query
            String sql = "SELECT name,email, accountType, accountNumber FROM customers";
            ResultSet rs = stmt.executeQuery(sql);

            // table heading
            //"Customer Name    E-mail    Acc. Type    Acc. No.";
            //STEP 5: Extract data from result set
            while (rs.next()) {

                // variables are split using 11 spaces
                data.add(rs.getString("name") + "           " + rs.getString("accountNumber"));

            }

        } catch (Exception e) {

            //Handle errors for Class.forName
            throw new Exception(e.getLocalizedMessage());

        } finally {

            //close resources
            closeConnection();

        }

        return data;
    }

    /**
     * returns the customer details where account number is provided,
     * for preparing detailed customer account details
     *
     * @param accountNumber
     * @return
     * @throws Exception
     */
    public String[] selectCustomer(String accountNumber) throws Exception {
        /* 
        * get email & account number
        * search & return required details as array
        * print "loading success"
         */

        // customer details are stored in this array
        String[] custArr = null;

        try {

            // establish connection
            connect();

            // execte sql query
            String sql = "SELECT * FROM customers WHERE accountNumber='" + accountNumber + "'";
            ResultSet rs = stmt.executeQuery(sql);

            //extract data from result set
            while (rs.next()) {
                //Retrieve by column name & assign to the array
                custArr = new String[10];

                custArr[0] = rs.getString("name");;
                custArr[1] = rs.getString("birthDate");
                custArr[2] = rs.getString("address");
                custArr[3] = rs.getString("mobile");
                custArr[4] = rs.getString("email");
                custArr[5] = rs.getString("accountType");
                custArr[6] = accountNumber;
                custArr[7] = rs.getString("sortCode");
                custArr[8] = rs.getString("balance");
                custArr[9] = rs.getString("card");

            }

        } catch (Exception e) {

            //Handle errors for Class.forName
            throw new Exception(e.getLocalizedMessage());

        } finally {

            //close resources
            closeConnection();

        }

        return custArr;
    }

    /////////////////////////////////////////
    // CUSTOMER ACCOUNT PAGE ////////////////
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
    public int createCustomer(String name, String birthDate, String address, String mobile, String email, String accountType, String accountNumber, String sortCode, double balance, String card) throws Exception {
        /*
        * get name, position, username, password
        * add a new record to table with the got details
         */
        // customer details are stored in this array
        String[] custArr = null;

        try {

            // establish connection
            connect();

            // execte sql query
            String sql = "INSERT INTO customers VALUES ('" + name + "','" + birthDate + "','" + address + "','" + mobile + "','" + email + "','" + accountType + "','" + accountNumber + "','" + sortCode + "','" + balance + "','" + card + "')";
            stmt.execute(sql);
            
            return 1;

        } catch (Exception e) {

            //Handle errors for Class.forName
            throw new Exception(e.getLocalizedMessage());

        } finally {

            //close resources
            closeConnection();

        }

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
    public int editCustomer(String name, String birthDate, String address, String mobile, String email, String accountType, String accountNumber, String sortCode, double balance, String card) throws Exception {
        /*
        * get name,birthDate,address,mobile,email,accountType,accountNumber,sortCode,balance,card
        * update details where email & accountNumber is not changed
         */

        try {

            // establish connection
            connect();

            if (checkAvailability("accountNumber", accountNumber, "customers")) {

                // one value found
                // execte sql query
                String sql = "UPDATE customers SET name='" + name + "',birthDate='" + birthDate + "',address='" + address + "',mobile='" + mobile + "',accountType='" + accountType + "',sortCode='" + sortCode + "',balance='" + balance + "',card='" + card + "' ,email='" + email + "' WHERE accountNumber='" + accountNumber + "'";
                stmt.execute(sql);
                
                return 1;

            }
            
            return 0;

        } catch (Exception e) {

            //Handle errors for Class.forName
            throw new Exception(e.getLocalizedMessage());

        } finally {

            //close resources
            closeConnection();

        }
    }

    /**
     * delete the customer, with the given email & account number
     *
     * @param email
     * @param accountNumber
     */
    public int deleteCustomer(String accountNumber) throws Exception {
        /*
        * get name,birthDate,address,mobile,email,accountType,accountNumber,sortCode,balance,card
        * update details where email & accountNumber is not changed
         */

        try {

            // establish connection
            connect();
            
            if (checkAvailability("accountNumber", accountNumber, "customers")) {

                // one value found
                // execte sql query
                String sql = "DELETE FROM customers WHERE accountNumber='" + accountNumber + "'";
                stmt.execute(sql);
                
                return 1;
            
            }
            
            return 0;


        } catch (Exception e) {

            //Handle errors for Class.forName
            throw new Exception(e.getLocalizedMessage());

        } finally {

            //close resources
            closeConnection();

        }

    }

}
