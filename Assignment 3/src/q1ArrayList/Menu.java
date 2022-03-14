package q1ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class Menu {

    public static void main(String[] args) {
        int choice = -100;
        Scanner sc = new Scanner(System.in);
        DepartmentList dl = new DepartmentList();
        EmployeeList el = new EmployeeList();
        ArrayList<Department> departments = dl.departments;
        do {
            System.out.println("Employee and Department Management System");
            System.out.println("1. Add Department");
            System.out.println("2. Add Employee");
            System.out.println("3. Display Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Find Total Basic Pay of a Department");
            System.out.println("6. Remove an Employee");
            System.out.println("7. Modify Basic of an Employee");
            System.out.println("8. Sort Employees by Basic Pay in Descending Order");
            System.out.println("9. Sort Employees by Department Code");
            System.out.println("10. Sort Employees by Employee Code");
            System.out.println("11. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    dl.addDepartment();
                    break;
                case 2:
                    el.addEmployee(departments);
                    break;
                case 3:
                    el.displayEmployee(departments);
                    break;
                case 4:
                    el.displayAllEmployees(departments);
                    break;
                case 5:
                    dl.getTotalBasicPay();
                    break;
                case 6:
                    el.removeEmployee(departments);
                    break;
                case 7:
                    el.modifyBasic();
                    break;
                case 8:
                    el.sortByBasic();
                    System.out.println("Sorted by Basic Pay in Descending Order");
                    el.displayAllEmployees(departments);
                    break;
                case 9:
                    el.sortByDeptCode();
                    System.out.println("Sorted by Department Code");
                    el.displayAllEmployees(departments);
                    break;
                case 10:
                    el.sortByEmpCode();
                    System.out.println("Sorted by Employee Code");
                    el.displayAllEmployees(departments);
                    break;
                default:
                    System.out.println("Invalid choice");

            }

        } while (choice != 11);
        sc.close();
    }

}

