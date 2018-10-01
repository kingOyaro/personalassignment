/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registerdesk;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author KID_UNTAMED
 */
public class forms extends JFrame {

    private static void addActionListener(ActionListener actionListener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
String gender;
double age;

private JScrollPane scpane;
private JLabel titlelbl;
private JLabel title;
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
private final SimpleDateFormat dob;
com.toedter.calendar.JDateChooser date;
private final JTextField telephone;
private final JButton clear;
private final JButton save;
private Font bf;



public forms(){
    super("ADD NEW USER");    
    setLayout(new FlowLayout());

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
dob=new SimpleDateFormat("d MMM y");
date= new com.toedter.calendar.JDateChooser();
date.setToolTipText("Enter Date of Birth ");
add(date);

genderlbl = new JLabel("Gender");
add (genderlbl);
male =new JRadioButton("Male", true);
female =new JRadioButton("Female",false);
add(female);
add(male);

group = new ButtonGroup();
group.add(female);
group.add(male);


save = new JButton("SAVE");
add(save);
clear = new JButton("CLEAR");
add (clear);
clear.addActionListener(new al());
save.addActionListener((ActionEvent ae) -> {
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_form","root","")) {
            Statement pst = connect.createStatement();
            String valu1=fname.getText();
            String valu2=lname.getText();
            Double valu3=Double.parseDouble(telephone.getText());
            if(male.isSelected()){
                gender="Male";
            }
            if(female.isSelected()){
                gender="Female";
            }
            age=date.getDate().getYear();
            age=2018-age-1900;
            String valu4=dob.format(date.getDate());
            String valu5=(gender);
            Double valu6=(age);
            String rs="INSERT INTO members VALUES("+"\""+ valu1 +"\""+","+"\""+valu2+"\""+","+"\""+valu3+"\""+","+"\""+valu4+"\""+","+"\""+valu5+"\""+","+"\""+valu6+"\""+")";
            pst.executeUpdate(rs);
            JOptionPane.showMessageDialog(null, "INSERTED SUCCESSFULLY");
        }
    }
    catch (HeadlessException | ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(null, e);}
    })
        ;
}
    public class al implements ActionListener
    {
     @Override
     public void actionPerformed(ActionEvent e)
     {
         String s1="";
         String s2="";
         String s3="";
         String s4="";
         
         fname.setText(s1);
         lname.setText(s2);
         telephone.setText(s3);
     }
 }
}

