/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registerdesk;

import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author KID_UNTAMED
 */
class home extends JFrame {
private final JButton logout;
private final JButton adduser;
private final JButton charts;
private final JButton bchart;

public home(){
    super("HOME");    
    setLayout(new FlowLayout());
charts = new JButton("PIE CHARTS");
add(charts);
charts.addActionListener(new ctp());

bchart = new JButton("BAR CHART");
add(bchart);
bchart.addActionListener(new btp());

adduser = new JButton("ADDUSER");
add(adduser);
adduser.addActionListener(new ac());

logout = new JButton("LOGOUT");
logout.addActionListener(new lo());
add (logout);
}

public void close(){
       WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
       Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
   }

public class ac implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        close();
        forms fm = new forms();
        fm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
            close();
            vlog = new login();
        } catch (SQLException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
        vlog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vlog.setSize(1000, 800);
        vlog.setVisible(true);
    }
}
public class ctp implements ActionListener
{
   @Override
   public void actionPerformed(ActionEvent ce) 
   {
       try {
           CreateChart pie = new CreateChart("age distribution", "gender chart ");
           pie.pack();
           pie.setVisible(true);
       } catch (SQLException ex) {
           Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
}
public class btp implements ActionListener
{
   @Override
   public void actionPerformed(ActionEvent cet) 
   {
       try {
           barchart bc = new barchart("AGES REGISTERED", "age group ");
           bc.pack();
           RefineryUtilities.centerFrameOnScreen(bc);
           bc.setVisible(true);
       } catch (SQLException ex) {
           Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
}

}
