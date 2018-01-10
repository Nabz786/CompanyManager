public class SalesRep extends Employee {

    public SalesRep(String fName, String lName, int empAge, int empId, EmployeePosition employeePosition) {
        super(fName, lName, empAge, empId, employeePosition);
    }


    public static void main(String[] args) {
        SalesRep s = new SalesRep("John", "Smith", 18, 353345, EmployeePosition.SalesRep);
        System.out.print(s.getEmployeePosition());
    }
}