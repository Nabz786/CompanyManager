package patients;

import java.util.Date;
import employees.Doctor;
import employees.Nurse;
import hmanager.illnessDepartment;


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

    private double getPatientAge(){ return calcPatientAge(); }

    //in this method take the date of birth of the patient and calculate their age
    private double calcPatientAge(){
        double temp = 1.0;
        return temp;
    }

    private Date getDateOfBirth(){
        return this.dateOfBirth;
    }

    public static void main(String[] args) {
        // TODO Must find a way to calculate date so it doesnt return results compared to epoch time.
        Patient p = new Patient("John", "Doe", new Date(11/11/2011), illnessDepartment.Reception,
                001, "Headache, nausea");
        System.out.println(p.getPatientFullName() + "              test");
        System.out.println(p.getDateOfBirth());
    }
}
