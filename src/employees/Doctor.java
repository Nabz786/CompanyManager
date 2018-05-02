package employees;

import patients.Patient;

/**
 * Doctor class to create a new doctor, contains basic parameters
 * as inherited from the employee class, also has functionality to
 * add a patient and remove patient from their care
 * Important Doctors cannot have more than 10 patients assigned to them at once.
 */
public class Doctor extends Employee implements Caretaker{

    private boolean acceptsPatients;

    /**
     * Default constructor to initialize a new doctor
     * @param fName - First name of doctor
     * @param lName - Last name of doctor
     * @param empAge - Age of employee
     * @param empId - Employee ID
     * @param empSalary - Employee Salary
     */
    public Doctor(String fName, String lName, int empAge, int empId, double
            empSalary) {
        super(fName, lName, empAge, empId, empSalary, EmployeePosition.Doctor);
        acceptsPatients = true;
    }

    /**
     * Assigns a patient to this doctor
     * @param p Patient to add
     */
    @Override
    public void assignPatient(Patient p) {
        if(patientList.size() == 9) {
            patientList.add(p);
            acceptsPatients = false;
        } else {
            patientList.add(p);
        }
    }

    /**
     * Removes patient from this doctors care
     * @param p Patient to remove
     */
    @Override
    public void removePatient(Patient p) { patientList.remove(p); }

    public boolean canAcceptPatients() {
        return patientList.size() < 10;
    }

    public boolean hasPatient(Patient p) {
        if (patientList.contains(p)) {
            return true;
        }
        return false;
    }
}
