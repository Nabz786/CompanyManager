import javafx.scene.shape.PathElement;

import java.util.Date;

public class Patient {

    private String fName, lName;
    private Date dateOfBirth;
    private illnessDepartment illnessDepartment;

    public Patient(String fName, String lName, Date dateOfBirth, illnessDepartment illnessDepartment) {
        this.fName = fName;
        this.lName = lName;
        this.dateOfBirth = dateOfBirth;
        this.illnessDepartment = illnessDepartment;
    }


}
