import java.util.Date;

public class Patient {

    private String fName, lName, Symptoms;
    private Date dateOfBirth;
    private illnessDepartment illness;
    private PatientLocation patientLocation;
    private int patientID;
    private Nurse assignedNurse;
    private Doctor assignedDoctor;


    public Patient(String fName, String lName, Date dateOfBirth, illnessDepartment illness,
    int patientID, String symptoms) {
        this.fName = fName;
        this.lName = lName;
        this.dateOfBirth = dateOfBirth;
        this.illness = illness;
        this.patientID = patientID;
        this.Symptoms = symptoms;
        this.patientLocation = new PatientLocation(illnessDepartment.Reception, 000);
    }

    private void setIllnessDepartment(illnessDepartment illnessDepartment){
        this.illness = illnessDepartment;
    }

    private void assignNurse(Nurse nurse){
        this.assignedNurse = nurse;
    }

    private void assignDoctor(Doctor doctor){
        this.assignedDoctor = doctor;
    }

}
