/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package btlcnpm;
import java.sql.*;
import javax.swing.JOptionPane;
import model.LoginU;
public class Addproduct extends javax.swing.JFrame {

    private Inbound inbound;
    private Connect connect1;
    private LoginU login;
    private int id;
    private String Quantity;
    private String ProductName;
    private String Date;
    private int IDitem;
    private int IDaccount;
    private Item item;
    PreparedStatement pst;
    String table;
    public Addproduct(LoginU login)  {
        initComponents();
        connect1=new Connect();
        connect1.Connect();
        this.login=login;
        
    }  
    public Addproduct(int id, String ProductName,String Quantity, String Date, int IDaccount, int IDitem){
     this.id=id;
     this.ProductName=ProductName;
     this.Quantity=Quantity;
     this.Date=Date;
     this.IDitem=IDitem;
    }
    public int getId(){
    return id;
    }
    public void setId(int id){
    this.id=id;
    }
    public String getProductName(){
    return ProductName;
    }
    public void setId(String ProductName){
    this.ProductName=ProductName;
    }
    public String getQuantity(){
    return Quantity;
    }
    public void setQuantity(String Quantity){
    this.Quantity=Quantity;
    }
    public String getDate(){
    return Date;
    }
    public void setDate(String Date){
    this.Date=Date;
    }
    public int getItem(){
    return IDitem;
    }
    public void setItem(int IDitem){
    this.IDitem=IDitem;
    }
    public int getAcc(){
    return IDaccount;
    }
    public void setAcc(int IDaccount){
    this.IDaccount=IDaccount;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtProductName = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ProductName");

        jLabel2.setText("Quantity");

        jLabel3.setText("Date");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });

        jButton2.setText("Return");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtProductName)
                        .addComponent(txtQuantity)
                        .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            ProductName =txtProductName.getText();
            Quantity = txtQuantity.getText();
            Date=txtDate.getText();

            item =new Item();
            table ="item";
            if(!item.numberform(Quantity)){
                JOptionPane.showMessageDialog(this,"vui lòng nhập đúng Quantity");
            }
            // them khi co trong bang item
            if(item.checkItem(ProductName,item,table)){
            pst=Connect.con.prepareStatement("insert into addproduct(ProductName,Quantity,Date,IDaccount,IDitem)values(?,?,?,?,?)");
            pst.setString(1,ProductName);
            pst.setString(2,Quantity);
            pst.setString(3,Date);
            pst.setInt(4,login.getId());
            pst.setInt(5,item.getId());
            pst.executeUpdate();
            }else{
            pst=Connect.con.prepareStatement("insert into item(ProductName)values(?)");
            pst.setString(1,ProductName);
            pst.executeUpdate();
            pst=Connect.con.prepareStatement("insert into addproduct(ProductName,Quantity,Date,IDaccount,IDitem)values(?,?,?,?,?)");
            pst.setString(1,ProductName);
            pst.setString(2,Quantity);
            pst.setString(3,Date);
            pst.setInt(4,login.getId());
            pst.setInt(5, item.Row()+1);
            pst.executeUpdate();
            }           
            table="product";
            if(item.checkItem(ProductName,item,table)){
            pst=Connect.con.prepareStatement("UPDATE " + table + " SET Quantity = Quantity + " + Quantity + " WHERE ProductName LIKE ?");
            pst.setString(1,ProductName);  
            pst.executeUpdate();
            }else if(item.checkItem(ProductName, item, table="item")){
            pst=Connect.con.prepareStatement("insert into product(ProductName,Quantity,IDitem)values(?,?,?)");
            pst.setString(1,ProductName);
            pst.setString(2,Quantity);
            pst.setInt(3, item.getId());
            pst.executeUpdate();
            }else {
            pst=Connect.con.prepareStatement("insert into item(ProductName)values(?)");
            pst.setString(1,ProductName);
            pst.executeUpdate();
            pst=Connect.con.prepareStatement("insert into product(ProductName,Quantity,IDitem)values(?,?,?)");
            pst.setString(1,ProductName);
            pst.setString(2,Quantity);
            pst.setInt(3, item.Row()+1);
            pst.executeUpdate();
            
            }
            JOptionPane.showMessageDialog(this,"thêm thành công");
             txtProductName.setText("");
             txtQuantity.setText("");
             txtDate.setText("");
        } catch (SQLException ex) {
            if(!item.dateform(Date)) {
                JOptionPane.showMessageDialog(this,"vui lòng nhập lại Date");
            }
            
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
      
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[])throws SQLException {
       
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
