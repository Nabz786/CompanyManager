package employees;

import employees.Employee;
import employees.EmployeePosition;

public class Nurse extends Employee implements Caretaker {

    public Nurse(String fName, String lName, int empAge, int empId, double empSalary, EmployeePosition employeePosition) {
        super(fName, lName, empAge, empId, empSalary, employeePosition);
    }
}
