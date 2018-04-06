package employees;

import patients.Patient;

/**
 * Doctor class to create a new doctor, contains basic parameters
 * as inherited from the employee class, also has functionality to
 * add a patient and remove patient from their care
 */
public class Doctor extends Employee implements Caretaker{

    /**
     * Default constructor to initialize a new doctor
     * @param fName - First name of doctor
     * @param lName - Last name of doctor
     * @param empAge - Age of employee
     * @param empId - Employee ID
     * @param empSalary - Employee Salary
     * @param employeePosition - Employees position
     */
    public Doctor(String fName, String lName, int empAge, int empId, double
            empSalary, EmployeePosition employeePosition) {
        super(fName, lName, empAge, empId, empSalary, employeePosition);
    }

    /**
     * Assigns a patient to this doctor
     * @param p Patient to add
     */
    @Override
    public void assignPatient(Patient p) {
        myPatients.add(p);
    }

    /**
     * Removes patient from this doctors care
     * @param p Patient to remove
     */
    @Override
    public void removePatient(Patient p) {
        myPatients.remove(p);
    }
}
