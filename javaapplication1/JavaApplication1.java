/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.sql.*;
/**
 *
 * @author Acer
 */
public class JavaApplication1 {
    private static final String USERNAME = "Blanc";
    private static final String PASSWORD = "shiro";
    private static final String url =
            "jdbc:mysql://localhost:3306/TA";
    
    
    public static void main(String[] args) {
        try{
            Connection connection = DriverManager.getConnection(url, USERNAME, PASSWORD);
            System.out.println("Connection Successful!!!");
            Statement st = (Statement) connection.createStatement();
        }catch(SQLException e){
            System.err.println(e);
        }
        
        
        new LoginMenu().setVisible(true);
    }
    
}
