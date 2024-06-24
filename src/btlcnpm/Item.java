/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btlcnpm;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Item {
    private int id;
    private String ProductName;
    String sql;
    PreparedStatement pst,pst1;
    ResultSet rs;
    private Connect connect4;
    public Item() {
     connect4=new Connect();
     connect4.Connect();
    }
    public Item(int id, String ProductName){
     this.id=id;
     this.ProductName=ProductName;   
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
    //check ProductName co trong table , lay IDitem
    public boolean checkItem(String ProductName, Item item,String table) throws SQLException{
      boolean result =false;
      sql ="select * from "+ table +" where ProductName like '%"+ProductName+"%'";
      pst=Connect.con.prepareStatement(sql);
      rs=pst.executeQuery();
      if(rs.next()){
        item.setId(rs.getInt("IDitem"));  
        return true;
      }
        return result;
    }
    // dem cot
    public int Row() throws SQLException{
        int row = 0;
        String sql1 = "SELECT count(*) AS count FROM item";
        pst1 = connect4.con.prepareStatement(sql1);
        ResultSet rs1 = pst1.executeQuery();
        if (rs1.next()) {
           row = rs1.getInt("count");
      }
     return row; 
    }
    
    public boolean dateform(String a) {
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        date.setLenient(false);

        try {
            date.parse(a);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
    public  boolean numberform(String a) {
        try {
             int number = Integer.parseInt(a);
             
             return number > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
