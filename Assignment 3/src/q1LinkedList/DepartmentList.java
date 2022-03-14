package q1LinkedList;



import java.util.Scanner;
import java.util.LinkedList;

public class DepartmentList {
    Scanner sc = new Scanner(System.in);
    public LinkedList<Department> departments = new LinkedList<Department>();

    public DepartmentList() {

    }

    public void addDepartment() {
        System.out.println("Enter unique department code: ");
        String code = sc.nextLine();
        for (Department d : departments) {
            if (d.getDeptCode().equals(code)) {
                System.out.println("Department code already exists.");
                return;
            }
        }
        System.out.println("Enter the name of the department: ");
        String name = sc.nextLine();

        System.out.println("Enter the location of the department: ");
        String location = sc.nextLine();

        Department department = new Department(code, name, location);
        departments.add(department);
    }

    public void displayDept(String deptcode) {
        for (Department d : departments) {
            if (d.getDeptCode().equals(deptcode)) {
                System.out.println("Department code: " + d.getDeptCode());
                System.out.println("Department name: " + d.getDeptName());
                System.out.println("Department location: " + d.getLocation());
                return;
            }
        }
        System.out.println("Department code does not exist.");
    }

    public void getTotalBasicPay() {

        System.out.println("Enter the department code: ");
        String deptcode = sc.nextLine();
        int totalbasic = 0;
        for (Department d : departments) {
            if (d.getDeptCode().equals(deptcode)) {

                for (Employee e : d.getEmployees()) {
                    totalbasic = totalbasic + e.getBasic();
                }
            }
        }

        System.out.println("Total basic pay of the department: " + totalbasic);

    }

    public LinkedList<Department> getDepartmentList(){
        return departments;
    }

}


