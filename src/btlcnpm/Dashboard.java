/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package btlcnpm;
import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.LoginU;
public class Dashboard extends javax.swing.JFrame {
    private Inbound inboundfm;
    private Outbound outboundfm;
    private Connect connectt;
    private report reportfm;
    private LoginU login;
    DefaultTableModel df;
    String sql,sql1,Search,table;
    ResultSet rs,rs1;
    PreparedStatement pst;
    Statement st;
   
    public Dashboard(LoginU login) throws SQLException{
        initComponents();       
        this.login=login;
        connectt=new Connect();
        connectt.Connect();
        //jLabel2.setText(login.getFullName());
        pst=Connect.con.prepareStatement("delete from product where Quantity = 0");
        pst.executeUpdate();
        sql="SELECT * FROM product";
        df = (DefaultTableModel) jTable2.getModel();
        pst =Connect.con.prepareStatement(sql);
        rs = pst.executeQuery();
        connectt.in1(rs, df);
        table ="product";
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        search1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtDashboard = new javax.swing.JButton();
        txtInbound = new javax.swing.JButton();
        txtOutbound = new javax.swing.JButton();
        txtreport = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ProductName", "Quantity"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        search1.setIcon(new javax.swing.ImageIcon("E:\\inventory\\src\\icon\\search.png")); // NOI18N
        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 255, 0));
        jPanel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        txtDashboard.setIcon(new javax.swing.ImageIcon("E:\\inventory\\src\\icon\\dashboard.png")); // NOI18N
        txtDashboard.setText("DashBoard");
        txtDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDashboardActionPerformed(evt);
            }
        });

        txtInbound.setIcon(new javax.swing.ImageIcon("E:\\inventory\\src\\icon\\inbound.png")); // NOI18N
        txtInbound.setText("Inbound");
        txtInbound.setMaximumSize(new java.awt.Dimension(104, 23));
        txtInbound.setMinimumSize(new java.awt.Dimension(104, 23));
        txtInbound.setPreferredSize(new java.awt.Dimension(104, 23));
        txtInbound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInboundActionPerformed(evt);
            }
        });

        txtOutbound.setIcon(new javax.swing.ImageIcon("E:\\inventory\\src\\icon\\outbound.png")); // NOI18N
        txtOutbound.setText("Outbound");
        txtOutbound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOutboundActionPerformed(evt);
            }
        });

        txtreport.setIcon(new javax.swing.ImageIcon("E:\\inventory\\src\\icon\\seo-report.png")); // NOI18N
        txtreport.setText("Report");
        txtreport.setMaximumSize(new java.awt.Dimension(104, 23));
        txtreport.setMinimumSize(new java.awt.Dimension(104, 23));
        txtreport.setPreferredSize(new java.awt.Dimension(104, 23));
        txtreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
            .addComponent(txtOutbound, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtreport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtInbound, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(txtDashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtInbound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtOutbound)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtreport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(369, 369, 369))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(search1)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    
    private void txtInboundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInboundActionPerformed
        txtOutbound.setBackground(null);
        txtDashboard.setBackground(null);
        txtInbound.setBackground(Color.BLUE);
        txtreport.setBackground(null);
        try {
            inboundfm = new Inbound(login);
            jPanel1.removeAll();
            jPanel1.add(inboundfm.getContentPane());
            jPanel1.repaint();
            df = (DefaultTableModel) inboundfm.getJTable1().getModel();
            table ="addproduct";
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtInboundActionPerformed

    private void txtDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDashboardActionPerformed
        txtOutbound.setBackground(null);
        txtDashboard.setBackground(Color.BLUE);
        txtInbound.setBackground(null);
        txtreport.setBackground(null);
        jPanel1.removeAll();
        jPanel1.add(jScrollPane2);
        jPanel1.repaint();
        df = (DefaultTableModel) jTable2.getModel();
        table ="product";
        try {           
            rs = pst.executeQuery();
            connectt.in1(rs,df);
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_txtDashboardActionPerformed

    private void txtOutboundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOutboundActionPerformed
        txtOutbound.setBackground(Color.BLUE);
        txtDashboard.setBackground(null);
        txtInbound.setBackground(null);
        txtreport.setBackground(null);
        try {
            outboundfm = new Outbound(login);   
            jPanel1.removeAll();
            jPanel1.add(outboundfm.getContentPane());
            jPanel1.repaint();
            df=(DefaultTableModel)outboundfm.getJTable2().getModel();
            table ="export";
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtOutboundActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreportActionPerformed
        txtOutbound.setBackground(null);
        txtDashboard.setBackground(null);
        txtInbound.setBackground(null);
        txtreport.setBackground(Color.BLUE);
        try {
            reportfm =new report();
            jPanel1.removeAll();
            jPanel1.add(reportfm.getContentPane());
            jPanel1.repaint();
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_txtreportActionPerformed

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
        if( "product".equals(table)){
            Search= txtSearch.getText(); 
            sql1 ="select * from "+ table +" Where ProductName like '%"+ Search +"%'";
            Statement st;
           try {
              st = Connect.con.createStatement();
              rs1 = st.executeQuery(sql1);
              connectt.in1(rs1,df);
            } catch (SQLException ex) {
              Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        else{  
            Search= txtSearch.getText(); 
            sql1 ="select * from "+ table +" Where ProductName like '%"+ Search +"%' OR Date LIKE '%"+ Search+"%'";
            Statement st;
            try {
              st = Connect.con.createStatement();
              rs1 = st.executeQuery(sql1);
              connectt.in1(rs1,df);
            } catch (SQLException ex) {
              Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            } 
            connectt.in(rs1, df);
        }
    }//GEN-LAST:event_search1ActionPerformed

    private void jPanel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2AncestorAdded
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
    
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton search1;
    private javax.swing.JButton txtDashboard;
    private javax.swing.JButton txtInbound;
    private javax.swing.JButton txtOutbound;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JButton txtreport;
    // End of variables declaration//GEN-END:variables
}
