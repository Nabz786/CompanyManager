public class Manager extends Employee{
    public Manager(String fName, String lName, int empAge, int empId, double empSalary, EmployeePosition empPosition) {
        super(fName, lName, empAge, empId, empSalary + 2.75, empPosition);
    }
}
