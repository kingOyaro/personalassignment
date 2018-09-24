/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrationdesk;
import javax.swing.*;
/**
 *
 * @author KID_UNTAMED
 */
public class Registrationdesk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame myframe= new JFrame("Login");//creating login frame
        JPanel mypanel=new JPanel();
        JLabel usernamelabel=new JLabel("Username: ");
        JTextField username=new JTextField ();
        username.setColumns(20);
        JLabel passwordlabel=new JLabel("Password: ");
        passwordlabel.setBounds(59, 159, 89, 20);
        JPasswordField password=new JPasswordField ();
        password.setColumns(20);
        JButton login=new JButton("Login ");
        JButton exit=new JButton("Exit ");
        JButton clear=new JButton("Clear ");
        mypanel.add(usernamelabel);
        mypanel.add(username);
        mypanel.add(passwordlabel);
        mypanel.add(password);
        mypanel.add(login);
        mypanel.add(exit);
        mypanel.add(clear);
        myframe.add(mypanel);
        myframe.setBounds(200,300,1000,800);//set frame location and size
        myframe.setResizable(true);//set action for resize button
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setVisible(true);
     
        
        
    }
    
}
