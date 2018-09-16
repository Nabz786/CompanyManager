package hmanager;

import java.sql.*;

public class DatabaseConnectionManager {

    public static Connection getConnection() throws Exception {
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        String url = "jdbc:mysql://nvinstance.cli0ucsmllzj.us-east-2.rds.amazonaws.com:3306/HospitalManagementProject";
        String username = "nabz_master";
        String password = "nabza340"; //replace password here
        Connection conn = DriverManager.getConnection(url, username, password);
        System.out.println("Connected");
        return conn;
    }

    public static void executeStatement(final String sqlStatement) throws Exception {
        Connection con = getConnection();
        Statement statement = con.createStatement();
        statement.executeUpdate(sqlStatement);
        con.close();
    }
}


