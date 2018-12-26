package Services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DashboardCountService {


    public DashboardCountService() throws Exception{}
    /**
     * Returns the number of patients currently in the hospital
     */
    public int getPersonCounts() throws Exception {
        int patientCount = 0;
        String sqlStatement = "SELECT count(*)  AS NumPatients FROM Patient";
        Connection dbConnection = DatabaseConnectionService.getConnection();
        ResultSet resultSet = dbConnection.createStatement().executeQuery(sqlStatement);
        while(resultSet.next()) {
            patientCount = resultSet.getInt("NumPatients");
        }
        return patientCount;
    }

    public int getNurseCounts() throws Exception {
        int nurseCount = 0;
        String sqlStatement = "SELECT count(*)  AS NumNurse FROM Nurse";
        Connection dbConnection = DatabaseConnectionService.getConnection();
        ResultSet resultSet = dbConnection.createStatement().executeQuery(sqlStatement);
        while(resultSet.next()) {
            nurseCount = resultSet.getInt("NumNurse");
        }
        return nurseCount;
    }

    public int getDoctorCounts() throws Exception {
        int doctorCount = 0;
        String sqlStatement = "SELECT count(*)  AS NumDoctor FROM Doctor";
        Connection dbConnection = DatabaseConnectionService.getConnection();
        ResultSet resultSet = dbConnection.createStatement().executeQuery(sqlStatement);
        while(resultSet.next()) {
            doctorCount = resultSet.getInt("NumDoctor");
        }
        return doctorCount;
    }
}


