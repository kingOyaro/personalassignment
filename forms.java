/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registerdesk;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author KID_UNTAMED
 */
public class forms extends JFrame {

    private static void addActionListener(ActionListener actionListener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
private final JLabel fnamelbl;
private final JLabel lnamelbl; 
private final JLabel telephonelbl;
private final JLabel doblbl;
private final JLabel genderlbl;
private final JRadioButton male;
private final JRadioButton female;
private final ButtonGroup group;
private final JTextField fname;
private final JTextField lname;
private final JSpinner dob;
private final JTextField telephone;
private final JButton clear;
private final JButton saveuser;
private Font bf;


public forms(){
    super("ADD NEW USER");    
    setLayout(new GridLayout());

fnamelbl = new JLabel("First Name");
add (fnamelbl);
fname = new JTextField(21);
fname.setToolTipText("Enter First name");
add(fname);

lnamelbl = new JLabel("Last Name");
add (lnamelbl);
lname = new JTextField(21);
lname.setToolTipText("Enter Last name ");
add(lname);

telephonelbl = new JLabel("Telephone");
add (telephonelbl);
telephone = new JTextField(21);
telephone.setToolTipText("Enter Telephone ");
add(telephone);

doblbl = new JLabel("Date of Birth");
add (doblbl);
dob = new JSpinner();
dob.setToolTipText("Enter Date of Birth ");
add(dob);

genderlbl = new JLabel("Gender");
add (genderlbl);
male =new JRadioButton("Male", true);
female =new JRadioButton("Female",false);
add(female);
add(male);

group = new ButtonGroup();
group.add(female);
group.add(male);


saveuser = new JButton("SAVE USER");
add(saveuser);
clear = new JButton("CLEAR");
add(saveuser);
add (clear);

}
}
