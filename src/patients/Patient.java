package patients;

import java.sql.*;

import employees.Doctor;
import employees.Nurse;
import hmanager.illnessDepartment;

import static hmanager.DatabaseConnectionManager.executeStatement;
import static hmanager.DatabaseConnectionManager.getConnection;

/**
 * Patient class allows user to add, remove, and manage patients within the hospitals database.
 * @author Nabeel Vali.
 * @version 0.1 Summer 2018.
 */
public class Patient {

    /** This is the patients observed type of illness**/
    private illnessDepartment illnessCategory;

    /** The patients location in the hospital**/
    private Nurse assignedNurse;
    private Doctor assignedDoctor;



    private void assignNurse(Nurse nurse){
        this.assignedNurse = nurse;
    }

    private void assignDoctor(Doctor doctor){
        this.assignedDoctor = doctor;
    }

//    private String getPatientFullName() { return this.fName + " " + this.lName; }

    /**
     * Adds a new patient to the local sql database
     * @param patientID  Assigned patient ID.
     * @param firstName  Patient's first name.
     * @param lastName  Patient's last name.
     * @param dateOfBirth Patient's DOB.
     * @param patientSymptoms Patient's experienced symptoms.
     * @throws Exception  Throws exception if a connection to the local database cannot be made.
     */
    private static void addNewPatient(final int patientID, final String firstName, final String lastName,
                                      final String dateOfBirth, final String patientSymptoms) throws Exception {
        String sqlStatement = "INSERT INTO patientdata VALUES ( " + "'"
                + Integer.toString(patientID) + "','" +
                firstName + "','" +
                lastName + "','" +
                java.sql.Date.valueOf(dateOfBirth) + "','" +
                patientSymptoms + "','" +
                illnessDepartment.Reception + "')";

        executeStatement(sqlStatement);
    }

    /**
     * Removes a patient from the patient database using the specified ID.
     * @param patientID The patients ID.
     * @throws Exception Throws exception if a conneciton to the local database cannot be made.
     */
    private static void removePatient(final int patientID) throws Exception {
        String sqlStatement = "DELETE FROM patientdata WHERE PatientID = '"
                + patientID + "'" ;

        executeStatement(sqlStatement);
    }

    /**
     * Per the specified patientID, a patients location in the hospital will be updated with the
     * passed in location param.
     * @param patientID The patients ID
     * @param illnessDepartment Hospital department patient has moved to.
     * @throws Exception Throws exception if a conneciton to the local database cannot be made.
     */
    private static void setPatientLocation(final int patientID, final illnessDepartment illnessDepartment) throws Exception{
        String sqlStatement = "UPDATE patientdata SET hospitalDepartment='"
                + illnessDepartment
                + "'WHERE patientID='"
                + patientID
                + "'";

        executeStatement(sqlStatement);
    }

    private static void getAllPatients() throws Exception {
        String sqlStatement = "SELECT * FROM patientdata";
        Connection con = getConnection();
        Statement st = con.createStatement();
        ResultSet ste = st.executeQuery(sqlStatement);
        while(ste.next()) {
            System.out.print(ste.getString(2));
        }

    }

    public static void main(final String[] args) throws Exception {
       //addNewPatient(224, "John", "Smith", "2011-09-09", "Headcache, Sore Throat, runny nose");
       //setPatientLocation(224, illnessDepartment.Anaesthetics);
       //removePatient(223);
       //removePatient(224);
        getAllPatients();
    }
}
