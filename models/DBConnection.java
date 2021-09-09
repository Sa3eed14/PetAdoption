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

/**
 *
 * @author Saeed
 */
public class DBConnection {
    

    public static final String DRIVER="com.mysql.jdbc.Driver";
    public static final String URL="jdbc:mysql://localhost:3306/petshelter";
    public static final String USERNAME="root";
    public static final String PASSWORD="";
    public static Connection con= null;
    

            
    public static Connection getConnection() throws ClassNotFoundException, SQLException
    {
       if(con==null){
        
        Class.forName(DRIVER);
        con=DriverManager.getConnection(URL,USERNAME,PASSWORD);

        System.out.println(con);
        return con; }
       else{
           return con;
       }
    }
}
 

    




