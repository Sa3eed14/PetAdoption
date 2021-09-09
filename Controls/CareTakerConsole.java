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
public class CareTakerConsole {
    Connection con;
    
    public void WalkPet(Pet p) throws ClassNotFoundException, SQLException{
        
        con= DBConnection.getConnection();
         PreparedStatement pst= con.prepareStatement("INSERT INTO dailyactivitydetails (Name, Type, Age,AdoptionStatus) VALUES (?,?,?,?)");
         pst.setString(1, p.name);
         pst.setInt(2, p.type);
         pst.setInt(3, p.age);
         pst.setBoolean(4, p.adopted);
         pst.executeUpdate();
         System.out.println("Done");
    }
}
