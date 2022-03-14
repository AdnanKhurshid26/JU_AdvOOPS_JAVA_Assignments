package q2;



import java.util.LinkedList;
import java.util.Scanner;

public class EmployeeList {

    public LinkedList<Employee> employees = new LinkedList<Employee>();
    Scanner sc = new Scanner(System.in);

    public void addEmployee(LinkedList<Department> departments) {
        System.out.println("Enter unique employee code: ");
        String code = sc.nextLine();
        for (Employee e : employees) {
            if (e.getEmpCode().equals(code)) {
                System.out.println("Employee code already exists.");
                return;
            }
        }
        System.out.println("Enter the name of the employee: ");
        String name = sc.nextLine();

        System.out.println("Enter the basic salary of the employee: ");
        int basic = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the department code of the employee: ");
        String deptCode = sc.nextLine();
        Department dept = null;
        for (Department d : departments) {
            if (d.getDeptCode().equals(deptCode)) {
                dept = d;
                d.addEmployee(new Employee(code, name, basic, dept));
                break;
            }
        }
        if (dept == null) {
            System.out.println("Department code does not exist.");
            return;
        }

        Employee employee = new Employee(code, name, basic, dept);
        employees.add(employee);
    }

    public void displayEmployee(LinkedList<Department> departments) {
        System.out.println("Enter the employee code: ");
        String empcode = sc.nextLine();
        for (Employee e : employees) {
            if (e.getEmpCode().equals(empcode)) {
                System.out.println("Employee code: " + e.getEmpCode());
                System.out.println("Employee name: " + e.getEmpName());
                System.out.println("Employee basic: " + e.getBasic());

                for (Department d : departments) {
                    if (d.getDeptCode().equals(e.getDept().getDeptCode())) {
                        System.out.println("Department code: " + d.getDeptCode());
                        System.out.println("Department name: " + d.getDeptName());
                        System.out.println("Department location: " + d.getLocation());
                    }
                }
                return;
            }
        }
        System.out.println("Employee code does not exist.");

    }

    public void displayAllEmployees(LinkedList<Department> departments) {
        for (Employee e : employees) {
            System.out.println("Employee code: " + e.getEmpCode());
            System.out.println("Employee name: " + e.getEmpName());
            System.out.println("Employee basic: " + e.getBasic());

            for (Department d : departments) {
                if (d.getDeptCode().equals(e.getDept().getDeptCode())) {
                    System.out.println("Department code: " + d.getDeptCode());
                    System.out.println("Department name: " + d.getDeptName());
                    System.out.println("Department location: " + d.getLocation());
                }
            }
            System.out.println("\n---------------------------------------------------------------------\n");
        }

    }

    public void removeEmployee(LinkedList<Department> departments) {
        System.out.println("Enter the employee code: ");
        String empcode = sc.nextLine();
        for (Employee e : employees) {
            if (e.getEmpCode().equals(empcode)) {
                employees.remove(e);
                for (Department d : departments) {
                    if (d.getDeptCode().equals(e.getDept().getDeptCode())) {
                        d.removeEmployee(e);
                    }
                }
                return;
            }
        }
        System.out.println("Employee code does not exist.");
    }

    public void modifyBasic() {
        System.out.println("Enter the employee code: ");
        String empcode = sc.nextLine();
        for (Employee e : employees) {
            if (e.getEmpCode().equals(empcode)) {
                System.out.println("Enter the new basic salary: ");
                int basic = sc.nextInt();
                sc.nextLine();
                e.setBasic(basic);
                return;
            }
        }
        System.out.println("Employee code does not exist.");
    }

    public void sortByBasic() {
        for (int i = 0; i < employees.size(); i++) {
            for (int j = i + 1; j < employees.size(); j++) {
                if (employees.get(i).getBasic() < employees.get(j).getBasic()) {
                    Employee temp = employees.get(i);
                    employees.set(i, employees.get(j));
                    employees.set(j, temp);
                }
            }
        }
    }

    public void sortByDeptCode() {
        for (int i = 0; i < employees.size(); i++) {
            for (int j = i + 1; j < employees.size(); j++) {
                if (employees.get(i).getDept().getDeptCode().compareTo(employees.get(j).getDept().getDeptCode()) > 0) {
                    Employee temp = employees.get(i);
                    employees.set(i, employees.get(j));
                    employees.set(j, temp);
                }
            }
        }
    }

    public void sortByEmpCode() {
        for (int i = 0; i < employees.size(); i++) {
            for (int j = i + 1; j < employees.size(); j++) {
                if (employees.get(i).getEmpCode().compareTo(employees.get(j).getEmpCode()) > 0) {
                    Employee temp = employees.get(i);
                    employees.set(i, employees.get(j));
                    employees.set(j, temp);
                }
            }
        }
    }

}
