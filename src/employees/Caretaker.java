package employees;

import patients.Patient;

import java.util.ArrayList;

/**
 * Holds methods to help manage employees who have patients assigned to
 * them
 */
public interface Caretaker {

    /** List of patients a doctor or nurse has assigned to them.**/
    ArrayList<Patient> patientList = new ArrayList<>();

    /**
     * Adds a patient to the list of patients a caretaker is working with
     * @param p Patient to add
     */
    void assignPatient(Patient p);

    /**
     * Removes a patient from the list of patients caretaker is working with
     * @param p Patient to remove
     */
    void removePatient(Patient p);
}
