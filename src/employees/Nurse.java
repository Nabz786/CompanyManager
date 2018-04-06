package employees;

import employees.Employee;
import employees.EmployeePosition;
import patients.Patient;

public class Nurse extends Employee implements Caretaker {

    public Nurse(String fName, String lName, int empAge, int empId, double empSalary, EmployeePosition employeePosition) {
        super(fName, lName, empAge, empId, empSalary, employeePosition);
    }

    @Override
    public void assignPatient(Patient p) {
        myPatients.add(p);
    }

    @Override
    public void removePatient(Patient p) {
        myPatients.add(p);
    }
}
