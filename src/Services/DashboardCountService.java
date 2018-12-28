package Services;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DashboardCountService {


    public DashboardCountService() {}
    /**
     * Returns the number of patients currently in the hospital
     */
    public int getPersonCounts() {
        int patientCount = 0;
        String sqlStatement = "SELECT count(*)  AS NumPatients FROM Patient";
        Connection dbConnection = DatabaseConnectionService.getConnection();
        try {
            ResultSet resultSet = dbConnection.createStatement().executeQuery(sqlStatement);
            if (resultSet.next()) {
                patientCount = resultSet.getInt("NumPatients");
            }
        } catch (Exception e){
            System.out.println(e);
        }
        return patientCount;
    }

    public int getNurseCounts() {
        int nurseCount = 0;
        String sqlStatement = "SELECT count(*)  AS NumNurse FROM Nurse";
        Connection dbConnection = DatabaseConnectionService.getConnection();
        try {
            ResultSet resultSet = dbConnection.createStatement().executeQuery(sqlStatement);
            if (resultSet.next()) {
                nurseCount = resultSet.getInt("NumNurse");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return nurseCount;
    }

    public int getDoctorCounts() {
        int doctorCount = 0;
        String sqlStatement = "SELECT count(*)  AS NumDoctor FROM Doctor";
        Connection dbConnection = DatabaseConnectionService.getConnection();
        try {
            ResultSet resultSet = dbConnection.createStatement().executeQuery(sqlStatement);
            if (resultSet.next()) {
                doctorCount = resultSet.getInt("NumDoctor");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return doctorCount;
    }
}


