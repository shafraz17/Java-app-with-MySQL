
package javadbapp;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Shaf
 */
public class DB {
    public static Connection getConnection() throws Exception{
        
        // THIS METHOD MUST RETURN A CONNECTION TO THE SQL DATABASE
        
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection c;
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentData", 
                "root", "");
        return c;
    }
    
}
