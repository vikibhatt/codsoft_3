/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;

public class MyConnection {
    private static final String username = "root";
    private static final String password = "mysql";
    private static final String dataConn = "jdbc:mysql://localhost:3306/students_management";
    private static Connection con = null;
    
   public static Connection getConnection(){
    try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection(dataConn,username,password);
         System.out.println("Connection successful!");
    }catch(Exception ex){
        System.out.println("Connection error" + ex.getMessage());
    }
     return con;
   }
}
