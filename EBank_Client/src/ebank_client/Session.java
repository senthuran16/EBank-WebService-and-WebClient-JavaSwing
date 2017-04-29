/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebank_client;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.lang.Exception;

/**
 * represents a session
 * 
 * @author USER
 */
public class Session {
    
    // logged in status
    static boolean isLoggedIn = false;
    // logged in user
    static String username;
    
    public static void main(String[] args){
        // set the look and feel of GUI
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        try {

            // show login ui
            LoginUI loginUI = new LoginUI();
            loginUI.setVisible(true);

        } catch (Exception e) {
            
            // error
            JOptionPane.showMessageDialog(new JFrame(), e.getLocalizedMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
            
        }
    }
    
    
}
