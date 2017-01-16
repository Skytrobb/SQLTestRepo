/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqltest;
import java.sql.*;
/**
 *
 * @author tharo_000
 */
public class SQLTestConn {
    Connection conn = null;
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://mysql.bassenstein.site:3306/bassensteintinker_database";

   //  Database credentials
   static final String USER = "";
   static final String PASS = "";

    public static Connection ConnecrDb() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            System.out.println("connecting to database");
           Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connection success!");
            return conn;
        } catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}

