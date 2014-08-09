

import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoder
 */
public class DBConnect {
    public static void main(String[] args)
    {
        
        String host = "jdbc:derby://localhost:1527/Employees";//1527 is port number
        String username = "rahul";
        String pwd = "rahul";
        String query = "select * from RAHUL.WORKERS";
        
        try {
            
            Connection con = DriverManager.getConnection(host, username, pwd);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next())
            {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) +" " + rs.getString(3)+ " " + rs.getString(4));   
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        
        
        
        
        
    }
    
}
