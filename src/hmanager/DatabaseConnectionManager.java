package hmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnectionManager {

    public static Connection getConnection() throws Exception {
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        String url = "jdbc:mysql://localhost:3306/hospitalschema?autoReconnect=true&useSSL=false\r\n";
        String username = "root";
        String password = ""; //replace password here

        Connection conn = DriverManager.getConnection(url, username,password);
        System.out.println("Connected");
        return conn;
    }
}


