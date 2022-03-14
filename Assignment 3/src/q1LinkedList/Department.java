package q1LinkedList;


import java.util.LinkedList;

public class Department {
    private String deptCode;
    private String deptName;
    private String location;
    private LinkedList<Employee> employees = new LinkedList<Employee>();

    public Department(String deptCode, String deptName, String location) {
        this.deptCode = deptCode;
        this.deptName = deptName;
        this.location = location;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void removeEmployee(Employee e) {
        employees.remove(e);
    }

    public LinkedList<Employee> getEmployees() {
        return employees;
    }

}
