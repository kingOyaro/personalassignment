/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registerdesk;

/**
 *
 * @author KID_UNTAMED
 */
import java.sql.SQLException;
import javax.swing.JFrame;
public class Registerdesk {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */    
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
        
        login vlog = new login();
        vlog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vlog.setSize(1000, 800);
        vlog.setVisible(true);
        
        
        
    }
    
}
