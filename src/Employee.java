public class Employee{

    private String fName, lName;
    private int empAge, empId;
    private EmployeePosition employeePosition;

    public Employee(String fName, String lName, int empAge, int empId, EmployeePosition employeePosition){
        this.fName = fName;
        this.lName = lName;
        this.empAge = empAge;
        this.empId = empId;
        this.employeePosition = employeePosition;
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

    public EmployeePosition getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(EmployeePosition employeePosition) { this.employeePosition = employeePosition; }
}
