//package hmanager;
//
//import employees.Employee;
//import employees.EmployeePosition;
//import employees.Nurse;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class hManager {
//
//    private List<Employee> employeeList;
//
//    public hManager() {
//        employeeList = new ArrayList<>();
//    }
//
//    //In UI, on createButton click, call this method, passing in
//    private void addEmployee(Employee newEmployee) {
//        employeeList.add(newEmployee);
//    }
//
//    private void removeEmployee(int empId) {
//        for(Employee emp: employeeList) {
//            if(emp.getEmpId() == empId) {
//                employeeList.remove(emp);
//                break;
//            }
//        }
//    }
//
//    //for now we will assign patients to any available doctor
//    private void addPatient(Patient newPatient) {
//        for(Employee emp: employeeList) {
//            if(emp.getEmployeePosition() == EmployeePosition.Doctor) {
//                Doctor tempDoc = (Doctor) emp;
//                if(tempDoc.canAcceptPatients()) {
//                    tempDoc.assignPatient(newPatient);
//                    break;
//                }
//            }
//        }
//    }
//
//    private void removePatient(Patient patientToRemove) {
//        for(Employee emp: employeeList) {
//            if(emp.getEmployeePosition() == EmployeePosition.Doctor) {
//                Doctor tempDoc = (Doctor) emp;
//                if(tempDoc.hasPatient(patientToRemove)) {
//                    tempDoc.removePatient(patientToRemove);
//                    break;
//                }
//            }
//        }
//    }
//
//    private void printEmployeeList() {
//        for(int i = 0; i < employeeList.size(); i++) {
//            System.out.println(employeeList.get(i).toString());
//        }
//    }
//
//    public static void main(String[] args) {
//
//            hManager h = new hManager();
//            h.addEmployee(new Doctor("John", "Smith", 37, 123, 89834.7));
//            h.addEmployee(new Nurse("Sally", "Smith", 32, 101, 56923.3));
//            h.printEmployeeList();
//            h.removeEmployee(123);
//            h.printEmployeeList();
//    }
//
//}
