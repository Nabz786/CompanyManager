import java.util.Date;

public class Patient {

    private String fName, lName;
    private Date dateOfBirth;
    private illnessDepartment illness;
    private PatientLocation patientLocation;
    private int patientID;

    public Patient(String fName, String lName, Date dateOfBirth, illnessDepartment illness,
    int patientID) {
        this.fName = fName;
        this.lName = lName;
        this.dateOfBirth = dateOfBirth;
        this.illness = illness;
        this.patientID = patientID;
        this.patientLocation = new PatientLocation(illnessDepartment.Receiving, 000);
    }

    private void setIllnessDepartment(illnessDepartment illnessDepartment){
        this.illness = illnessDepartment;
    }
}
