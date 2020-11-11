
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iangk
 */
// jdbc:mysql://localhost:3306/ebank?zeroDateTimeBehavior=convertToNull [root on Default schema]
public class DBConnect {
    Connection conn = null;
    
    public Connection openConnection() {
        
        if (conn == null) {
            String url = "jdbc:mysql://localhost/";
            String dbName = "ebank";
            String driver = "com.mysql.jdbc.Driver";
            String userName = "root";
            String password = "";
            
            try{
                Class.forName(driver);
                this.conn = (Connection) DriverManager.getConnection(url+dbName,userName,password);
 
                return conn;           
                
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Connection Faild.");
            }
        }
        
        return null;
    }
}
