/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registerdesk;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.chart.PieChart;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author KID_UNTAMED
 */
class home extends JFrame {
private final JButton logout;
private final JButton adduser;
private final JButton charts;


public home(){
    super("HOME");    
    setLayout(new FlowLayout());
charts = new JButton("CHARTS");
add(charts);
charts.addActionListener(new ct());    
    
adduser = new JButton("ADDUSER");
add(adduser);
adduser.addActionListener(new ac());

logout = new JButton("LOGOUT");
logout.addActionListener(new lo());
add (logout);

}
public class ac implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        forms fm = new forms();
        fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fm.setSize(1000, 800);
        fm.setVisible(true);
    }
}
public class lo implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        login vlog = null;
        try {
            vlog = new login();
        } catch (SQLException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
        vlog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vlog.setSize(1000, 800);
        vlog.setVisible(true);
    }
}
public class ct implements ActionListener
{
   public void actionPerformed(ActionEvent ce) 
   {
       try {
           CreateChart pie = new CreateChart("age distribution","gender chart ");
           pie.pack();
           pie.setVisible(true);
       } catch (SQLException ex) {
           Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
}
}