package patients;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Patient {

    private SimpleIntegerProperty patientId, nurseId, doctorId;

    private SimpleStringProperty fName;
    private SimpleStringProperty lName;
    private SimpleStringProperty pAddress;
    private SimpleStringProperty pSymptoms;
    private SimpleStringProperty hospitalDep;
    private SimpleStringProperty dateOfBirth;

    //There may be an issue here with specifying dob of type string with SQL of type date
    public Patient(int patientId, String fName, String lName, String pAddress,
                   String pSymptoms, String dateOfBirth, String hospitalDep, int nurseId, int doctorId) {
        this.patientId = new SimpleIntegerProperty(patientId);
        this.fName = new SimpleStringProperty(fName);
        this.lName = new SimpleStringProperty(lName);
        this.pAddress = new SimpleStringProperty(pAddress);
        this.pSymptoms = new SimpleStringProperty(pSymptoms);
        this.dateOfBirth = new SimpleStringProperty(dateOfBirth);
        this.hospitalDep = new SimpleStringProperty(hospitalDep);
        this.nurseId = new SimpleIntegerProperty(nurseId);
        this.doctorId = new SimpleIntegerProperty(doctorId);
    }

    public int getPatientId() {
        return patientId.get();
    }

    public int getNurseId() {
        return nurseId.get();
    }

    public int getDoctorId() {
        return doctorId.get();
    }

    public String getFName() { return fName.get(); }

    public String getLName() {
        return lName.get();
    }

    public String getPAddress() {
        return pAddress.get();
    }

    public String getPSymptoms() {
        return pSymptoms.get();
    }

    public String getHospitalDep() {
        return hospitalDep.get();
    }

    public String getDateOfBirth() {
        return dateOfBirth.get();
    }
}
