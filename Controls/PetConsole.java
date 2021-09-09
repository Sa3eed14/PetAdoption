/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petadoption;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



/**
 *
 * @author Saeed
 */
public class PetConsole {
    public Pet pet;
    Connection con;
    

    public void savePet(Pet p) throws SQLException, ClassNotFoundException{
        
       
         con=DBConnection.getConnection();
         PreparedStatement pst= con.prepareStatement("INSERT INTO pet (Name, Type, Age,AdoptionStatus) VALUES (?,?,?,?)");
         pst.setString(1, p.name);
         pst.setInt(2, p.type);
         pst.setInt(3, p.age);
         pst.setBoolean(4, p.adopted);
         pst.executeUpdate();
         System.out.println("Done");
         con.close();
         
    }
   public Pet showPet(Pet p) throws SQLException, ClassNotFoundException{
        
         con= DBConnection.getConnection();
         PreparedStatement pst= con.prepareStatement("SELECT * FROM pet WHERE id=?");
          pst.setInt(1, p.ID);
          ResultSet rs = pst.executeQuery();
          if(rs.next()){
             p.name= rs.getString(2);
             p.type=rs.getInt(3);
             p.age=rs.getInt(4);
             p.adopted=rs.getBoolean(5);
          }
          con.close();
          return p;
}
   public ArrayList<Pet> GetAllPets() throws SQLException, ClassNotFoundException{
        ArrayList<Pet> plist = new ArrayList<Pet>();
        con=DBConnection.getConnection();
         PreparedStatement pst= con.prepareStatement("SELECT * FROM pet");
         ResultSet rs = pst.executeQuery();
         while(rs.next()){
             pet=new Pet(rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getBoolean(5));
         }
         return plist;
}
}
