import javafx.scene.shape.PathElement;

import java.util.Date;

public class Patient {

    private String fName, lName;
    private Date dateOfBirth;
    private illnessDepartment illnessDepartment;
    private int patientID;

    public Patient(String fName, String lName, Date dateOfBirth, illnessDepartment illnessDepartment,
    int patientID) {
        this.fName = fName;
        this.lName = lName;
        this.dateOfBirth = dateOfBirth;
        this.illnessDepartment = illnessDepartment;
        this.patientID = patientID;
    }

    private void setIllnessDepartment(illnessDepartment illnessDepartment){
        this.illnessDepartment = illnessDepartment;
    }
}
