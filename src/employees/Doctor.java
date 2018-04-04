package employees;

public class Doctor extends Employee implements Caretaker {

    public Doctor(String fName, String lName, int empAge, int empId, double empSalary, EmployeePosition employeePosition) {
        super(fName, lName, empAge, empId, empSalary, employeePosition);
    }
}
