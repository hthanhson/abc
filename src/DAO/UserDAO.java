/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import btlcnpm.Connect;
import btlcnpm.Login;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.LoginU;

public class UserDAO {
    
    PreparedStatement pst;
    ResultSet rs;
    public boolean checkLogin(LoginU login) throws SQLException {
                boolean result = false;
		pst=Connect.con.prepareStatement("select * from account where Name like ? and Pass like ?");
                pst.setString(1,login.getNam());
                pst.setString(2,login.getPass());
                
                rs=pst.executeQuery();
                if(rs.next()){
                  login.setFullName(rs.getString("FullName"));   
                  login.setId(rs.getInt("IDacc"));
                  result =true;
               
		
	}
        return result;
}
}