/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btlcnpm;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author This PC
 */

public class Connect {
    public static Connection con;
    
    
    public void Connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/cnpm","root","");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Inbound.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void in(ResultSet rs,DefaultTableModel df){
        try {
                       
            ResultSetMetaData rd = rs.getMetaData();
            int a = rd.getColumnCount();
            df.setRowCount(0);
            if (rs.last()) {
        
             do {
              Vector v2 = new Vector();
              for (int i = 2; i <= a; i++) {
                v2.add(rs.getString("ProductName"));
                v2.add(rs.getString("Quantity"));
                v2.add(rs.getString("Date"));
              }
              df.addRow(v2);
             } 
             while (rs.previous());
           }
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void in1(ResultSet rs,DefaultTableModel df){
        try {
                       
            ResultSetMetaData rd = rs.getMetaData();
            int a = 3;
            df.setRowCount(0);
            if (rs.last()) {
        
             do {
              Vector v2 = new Vector();
              for (int i = 2; i <= a; i++) {
                v2.add(rs.getString("ProductName"));
                v2.add(rs.getString("Quantity"));
                
              }
              df.addRow(v2);
             } 
             while (rs.previous());
           }
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
