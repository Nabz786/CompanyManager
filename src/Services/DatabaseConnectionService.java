package Services;

import java.sql.*;

public class DatabaseConnectionService {

    public static Connection getConnection() {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            String url = "jdbc:mysql://nvinstance.cli0ucsmllzj.us-east-2.rds.amazonaws.com:3306/HospitalManagementProject";
            String username = "nabz_master";
            String password = "abc12345"; //replace password here
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected");
            return conn;
        } catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public static void executeStatement(final String sqlStatement) throws Exception {
        Connection con = getConnection();
        Statement statement = con.createStatement();
        statement.executeUpdate(sqlStatement);
        con.close();
    }
}


