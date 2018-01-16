import java.util.ArrayList;

public class CompanyManager {

    private static ArrayList<Employee> employeeList;

    public CompanyManager(){
        employeeList = new ArrayList<>();
    }

    private void hireEmployee(Employee employee){
        employeeList.add(employee);
    }

    private void fireEmployee(Employee employee){
        employeeList.remove(employee);
    }


    public static void main(String[] args) {
        CompanyManager comp = new CompanyManager();
        comp.hireEmployee(new SalesRep("John", "Smith", 19, 343, 9.34, EmployeePosition.SalesRep));
        System.out.println(comp.employeeList.get(0).getEmpAge());
        comp.fireEmployee(comp.employeeList.get(0));
        System.out.print(comp.employeeList.size());
    }




}
