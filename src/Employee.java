public class Employee{

    private String fName, lName;
    private int empAge, empId;
    private static EmployeePosition employeePosition;

    public Employee(){

    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public static EmployeePosition getEmployeePosition() {
        return employeePosition;
    }

    public static void setEmployeePosition(EmployeePosition employeePosition) {
        Employee.employeePosition = employeePosition;
    }
}
