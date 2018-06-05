package patients;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Date;
import employees.Doctor;
import employees.Nurse;
import hmanager.DatabaseConnectionManager;
import hmanager.illnessDepartment;

import static hmanager.DatabaseConnectionManager.getConnection;


public class Patient {

    private String fName, lName, patientSymptoms;
    private Date dateOfBirth;

    /** This is the patients observed type of illness**/
    private illnessDepartment illnessCategory;

    /** The patients location in the hospital**/
    private PatientLocation patientLocation;
    private int patientID;
    private Nurse assignedNurse;
    private Doctor assignedDoctor;


    public Patient(String fName, String lName, Date dateOfBirth, illnessDepartment illness,
    int patientID, String symptoms) {
        this.fName = fName;
        this.lName = lName;
        this.dateOfBirth = dateOfBirth;
        this.illnessCategory = illness;
        this.patientID = patientID;
        this.patientSymptoms = symptoms;
        this.patientLocation = new PatientLocation(illnessDepartment.Reception, 000);
    }

    private void setIllnessDepartment(illnessDepartment illnessDepartment){
        this.illnessCategory = illnessDepartment;
    }

    private void assignNurse(Nurse nurse){
        this.assignedNurse = nurse;
    }

    private void assignDoctor(Doctor doctor){
        this.assignedDoctor = doctor;
    }

    private String getPatientFullName() { return this.fName + " " + this.lName; }

    /**
     * Adds a new patient to the local sql database
     * @param patientID  Assigned patient ID.
     * @param firstName  Patients first name.
     * @param lastName  Patients last name.
     * @throws Exception  Throws exception if a connection to the local database cannot be made.
     */
    private static void addNewPatient(int patientID, String firstName, String lastName) throws Exception {
        Connection con = getConnection();
        Statement statement = con.createStatement();
        String sqlStatement = "INSERT INTO patientdata VALUES ( " + "'"
                +Integer.toString(patientID) + "','" + firstName + "','" + lastName+ "')";
        statement.executeUpdate(sqlStatement);
        con.close();
    }

    /**
     * Removes a patient from the patient database using the spcified ID.
     * @param patientID The patients ID.
     * @throws Exception Throws exception if a conneciton to the local database cannot be made.
     */
    private static void removePatient(int patientID) throws Exception {
        Connection con = getConnection();
        Statement statement = con.createStatement();
        String sqlStatement = "DELETE FROM patientdata WHERE PatientID = '" + patientID + "'" ;
        statement.executeUpdate(sqlStatement);
        con.close();
    }

    private Date getDateOfBirth(){
        return this.dateOfBirth;
    }

    public static void main(String[] args) throws Exception {
        addNewPatient(223, "John", "Smith");
        //removePatient(124);
    }
}
