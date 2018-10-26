/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registerdesk;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;


/**
 *
 * @author KID_UNTAMED
 */
public class CreateChart extends JFrame {
    connection con = new connection();
    int age,agegrpa,agegrpb,agegrpc,agegrpd,male,female;
    
        public CreateChart(String appTitle, String chartTitle) throws SQLException
        {
            PieDataset dataset = createDataset();
            JFreeChart chart = createChart(dataset, chartTitle);
            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new java.awt.Dimension(800, 500));
            setContentPane(chartPanel);
        }
        private PieDataset createDataset() throws SQLException
        {
            DefaultPieDataset rsl = new DefaultPieDataset();
            try{
                ResultSet rs = con.pieData();
                while(rs.next()){
                    String allages = rs.getString(1);
                    age=Integer.valueOf(allages);
                    if(18 >= age){
                         agegrpa = agegrpa + 1;
                    }
                    if(18<age && 25>=age){
                         agegrpb=agegrpb + 1;
                    }
                    if(25<age && 35>=age){
                         agegrpc=agegrpc +1;
                    }
                    if(35<age){
                        agegrpd=agegrpd + 1;
                    }
                    String gender = rs.getString(2);
                    if("Female".equals(gender)){
                        female=female + 1;
                    }
                    if("Male".equals(gender)){
                        male=male + 1;
                    }
                }
                
            }catch(SQLException e){
             Logger.getLogger(CreateChart.class.getName()).log(Level.SEVERE,null,e);
                
            }
            
            rsl.setValue("Male",male);
            rsl.setValue("Female",female);
            return rsl;
    }
        private JFreeChart createChart(PieDataset dataset,String title)
        {
            JFreeChart chart = ChartFactory.createPieChart3D(title, dataset, rootPaneCheckingEnabled, rootPaneCheckingEnabled, rootPaneCheckingEnabled);
            PiePlot3D plot = (PiePlot3D) chart.getPlot();
            plot.setDirection(Rotation.CLOCKWISE);
            plot.setForegroundAlpha(0.5f);
            return chart;
        }
    
}
