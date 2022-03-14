package q1LinkedList;


public class Employee {
    private String empCode;
    private String empName;
    private int basic;
    private Department dept;

    public Employee(String empCode, String empName, int basic, Department dept) {
        this.empCode = empCode;
        this.empName = empName;
        this.basic = basic;
        this.dept = dept;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getBasic() {
        return basic;
    }

    public void setBasic(int basic) {
        this.basic = basic;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }
}
