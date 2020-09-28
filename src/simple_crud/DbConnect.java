/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple_crud;


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author dilupa
 */
public class DbConnect {
    
    public static Connection connect(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/team_bitcode","root","");
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return connection;
    }
}
