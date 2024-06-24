/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.io.Serializable;
public class LoginU {
    private String Name,Pass,FullName,ViTri;
    private int IDacc;
    public LoginU(int IDacc,String Name,String Pass,String FullName,String ViTri){
    this.IDacc=IDacc;    
    this.Name=Name;
    this.Pass=Pass;
    this.FullName=FullName;
    this.ViTri=ViTri;
    }

    public LoginU() {
        
    }
    public int getId(){
    return IDacc;
    }
    public void setId(int IDacc){
    this.IDacc=IDacc;
    }
    public String getNam(){
    return Name;
    }
    public void setNam(String Name){
    this.Name=Name;
    }
    public String getPass(){
    return Pass;
    }
    public void setPass(String Pass){
    this.Pass=Pass;
    }
    public String getFullName(){
    return FullName;
    }
    public void setFullName(String FullName){
    this.FullName=FullName;
    }
    public String getViTri(){
    return FullName;
    }
    public void setViTri(String ViTri){
    this.ViTri=ViTri;
    }
}
