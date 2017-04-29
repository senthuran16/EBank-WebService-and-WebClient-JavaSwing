/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebankEmployee_ws;

/**
 * EBank Employee Web Service
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

    // REGISTRATION PAGE ////////////////////
    
    /**
     * displays all available employees
     *
     * @return : arraylist with all records. Each element represents one record
     */
    public ArrayList<String> displayEmployees() throws Exception {

        // this arrayList will be used to store got data
        ArrayList<String> data = new ArrayList<String>();

        try {

            // establish connection
            connect();

            // execte sql query
            String sql = "SELECT name,position,username FROM employees";
            ResultSet rs = stmt.executeQuery(sql);

            // table heading
            //"Employee Name    name    position    username";
            //STEP 5: Extract data from result set
            while (rs.next()) {

                // variables are split using 11 spaces
                data.add(rs.getString("name") + "           " + rs.getString("position") + "           " + rs.getString("username"));
                

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
     * returns the employee details where username is provided,
     * for preparing detailed employee details
     *
     * @param username
     * @return
     * @throws Exception
     */
    public String[] selectEmployee(String username) throws Exception {
        /* 
        * get username
        * search & return required details as array
        * print "loading success"
         */

        // employee details are stored in this array
        String[] empArr = null;

        try {

            // establish connection
            connect();

            // execte sql query
            String sql = "SELECT * FROM employees WHERE username='" + username + "'";
            ResultSet rs = stmt.executeQuery(sql);

            //extract data from result set
            while (rs.next()) {
                //Retrieve by column name & assign to the array
                empArr = new String[4];

                empArr[0] = rs.getString("name");;
                empArr[1] = rs.getString("position");
                empArr[2] = username;
                empArr[3] = rs.getString("password");

            }

        } catch (Exception e) {

            //Handle errors for Class.forName
            throw new Exception(e.getLocalizedMessage());

        } finally {

            //close resources
            closeConnection();

        }

        return empArr;
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
    public int createEmployee(String name, String position, String username, String password) throws Exception {
        /*
        * get name, position, username, password
        * add a new record to table with the got details
         */
        

        try {

            // establish connection
            connect();

            // execte sql query
            String sql = "INSERT INTO employees VALUES ('" + name + "','" + position + "','" + username + "','" + password + "')";
            //stmt.executeQuery(sql);
            stmt.execute(sql);
            
            
            return 1;

        } catch (Exception e) {

            throw new Exception(e.getLocalizedMessage());

        } finally {

            //close resources
            closeConnection();

        }

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
    public int editEmployee(String name, String position, String username, String password) throws Exception {
        /*
        * get name, position, username, password
        * update details where username is not changed
         */

        try {

            // establish connection
            connect();

            if (checkAvailability("username", username, "employees")) {

                // one value found
                // editing allowed
                // execte sql query
                String sql = "UPDATE employees SET name='" + name + "', position='" + position + "', password='" + password + "' WHERE username='" + username + "'";
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
     * deletes an employee record from the database with the given username
     *
     * @param username
     * @throws Exception
     */
    public int deleteEmployee(String username) throws Exception {
        /*
        * get name, position, username, password
        * update details where username is not changed
         */

        try {

            // establish connection
            connect();

            if (checkAvailability("username", username, "employees")) {

                // one value found
                // editing allowed
                // execte sql query
                String sql = "DELETE FROM employees WHERE username='" + username + "'";
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

    /////////////////////////////////////////
    // LOGIN PAGE ///////////////////////////
    /**
     * sets logged in status to true if the credentials are valid
     *
     * @param username : username of employee
     * @param password : password of employee
     *
     * @return : status of login (success / invalid / noUser)
     */
    public String login(String username, String password) throws Exception {
        boolean isFound = false;
        String returnStatus = null;

        try {

            // establish connection
            connect();

            // execte sql query
            String sql = "SELECT password FROM employees WHERE username='" + username + "'";
            ResultSet rs = stmt.executeQuery(sql);

            // to check whether rs is null
            int counter = 0;

            // extracted password will be stored here
            String savedPassword = "";

            //extract data from result set
            while (rs.next()) {
                counter++;
                //Retrieve by column name
                //int id  = rs.getInt("id");
                //int age = rs.getInt("age");
                savedPassword = rs.getString("password");

            }

            if (counter == 0) {

                // there is no record in the given username
                returnStatus = "noUser";

            } else if (savedPassword.equals(password)) {

                // there is a user in given username
                // no chance of more than one user having the same username
                // password have been already got in the while(rs.next()) loop
                // entered password is correct
                isLoggedIn = true;
                returnStatus = "success";

            } else {
                // entered password is wrong
                returnStatus = "invalid";
            }

        } catch (Exception e) {

            //Handle errors for Class.forName
            throw new Exception(e.getLocalizedMessage());

        } finally {

            //close resources
            closeConnection();

        }

        return returnStatus;

    }

    /**
     * sets logged in status to false
     */
    public void logout() {
        isLoggedIn = false;

    }

    

}
