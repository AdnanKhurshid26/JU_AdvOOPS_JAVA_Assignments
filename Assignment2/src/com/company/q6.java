package com.company;

import java.util.Scanner;

class Address {
    public String houseNo;
    public String street;
    public String city;
    public String pin;
    public String state;

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }

    public void setState(String st) {
        this.state = st;
    }

    public String getState() {
        return state;
    }

    Address(String houseNo, String street, String city, String pin, String state) {
        this.houseNo = houseNo;
        this.street = street;
        this.city = city;
        this.pin = pin;
        this.state = state;
    }

    Address() {
        this.houseNo = "";
        this.street = "";
        this.city = "";
        this.pin = "";
        this.state = "";
    }

}

class Person {
    Scanner sc = new Scanner(System.in);
    private String name;
    private Address address = new Address();
    private String phone;
    private String email;
    public boolean isFaculty = false;

    public static int stRoll = 0;
    public static int emId = 0;

    public void setIsFaculty() {
        this.isFaculty = true;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAddress() {
        System.out.println("Enter house number");
        this.address.setHouseNo(sc.nextLine());
        System.out.println("Enter street");
        this.address.setStreet(sc.nextLine());

        System.out.println("Enter city");
        this.address.setCity(sc.nextLine());

        System.out.println("Enter pin code");
        this.address.setPin(sc.nextLine());
        System.out.println("Enter state");
        this.address.setState(sc.nextLine());

    }

    public String getAddress() {
        return this.address.getHouseNo() + " " + this.address.getStreet() + ", " + this.address.getCity() + ", " + this.address.getPin() + ", " + this.address.getState();
    }

    public void UpdateAddress(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Enter house number");
                address.setHouseNo(sc.nextLine());
                break;
            case 2:
                System.out.println("Enter street");
                address.setStreet(sc.nextLine());
                break;
            case 3:
                System.out.println("Enter city");
                address.setCity(sc.nextLine());
                break;
            case 4:
                System.out.println("Enter pin code");
                address.setPin(sc.nextLine());
                break;
            case 5:
                System.out.println("Enter state");
                address.setState(sc.nextLine());
                break;
        }
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }



}

class Student extends Person {
    private int rollNo;
    private String course;

    Student() {
        super();
        stRoll++;
        this.rollNo = stRoll;
        this.course = "";
        this.isFaculty = false;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return this.rollNo;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return this.course;
    }

    public void showStudent() {
        System.out.println("Student Id: " + this.rollNo);
        System.out.println("Student Name: " + this.getName());
        System.out.println("Student Phone: " + this.getPhone());
        System.out.println("Student Email: " + this.getEmail());
        System.out.println("Student Address: " + this.getAddress());
        System.out.println("Student Course: " + this.course);
    }
}

class Faculty extends Person {
    private int empId;
    private String dept;
    private String specialization;

    Faculty() {
        super();
        emId++;
        this.empId = emId;
        this.dept = "";
        this.specialization = "";
        this.isFaculty = true;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return this.empId;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDept() {
        return this.dept;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public void showFaculty() {
        System.out.println("Faculty Id: " + this.empId);
        System.out.println("Faculty Name: " + this.getName());
        System.out.println("Faculty Phone: " + this.getPhone());
        System.out.println("Faculty Email: " + this.getEmail());
        System.out.println("Faculty Address: " + this.getAddress());
        System.out.println("Faculty Department: " + this.dept);
        System.out.println("Faculty Specialization: " + this.specialization);
    }
}

public class q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice;

        Student[] st = new Student[50];
        Faculty[] f = new Faculty[50];

        int st_i = 0;
        int f_i = 0;

        do {
            System.out.println("1. Add Student");
            System.out.println("2. Add Faculty");
            System.out.println("3. Display Student List");
            System.out.println("4. Display Faculty List");
            System.out.println("5. Update Student Details");
            System.out.println("6. Update Faculty Details");
            System.out.println("7. Display Student Details");
            System.out.println("8. Display Faculty Details");
            System.out.println("9. Exit");
            System.out.println("Enter your choice");
            choice = s.nextInt();
            s.nextLine();
            switch (choice) {
                case 1:
                    st[st_i] = new Student();
                    System.out.println("Enter name");
                    st[st_i].setName(s.nextLine());
                    System.out.println("Enter phone number");
                    st[st_i].setPhone(s.nextLine());
                    System.out.println("Enter email");
                    st[st_i].setEmail(s.nextLine());
                    System.out.println("Enter course");
                    st[st_i].setCourse(s.nextLine());
                    System.out.println("Enter Address details");
                    st[st_i].setAddress();
                    st_i++;
                    break;
                case 2:
                    f[f_i] = new Faculty();
                    System.out.println("Enter name");
                    f[f_i].setName(s.nextLine());
                    System.out.println("Enter phone number");
                    f[f_i].setPhone(s.nextLine());
                    System.out.println("Enter email");
                    f[f_i].setEmail(s.nextLine());
                    System.out.println("Enter department");
                    f[f_i].setDept(s.nextLine());
                    System.out.println("Enter specialization");
                    f[f_i].setSpecialization(s.nextLine());
                    System.out.println("Enter Address details");
                    f[f_i].setAddress();
                    f_i++;
                    break;
                case 3:
                    for (int i = 0; i < st_i; i++) {
                        System.out.print("Roll " + (i + 1));
                        System.out.println("\t"+st[i].getName());
                    }
                    break;
                case 4:
                for (int i = 0; i < f_i; i++) {
                    System.out.print("Employee ID " + (i + 1));
                    System.out.println("\t"+f[i].getName());
                }
                    break;
                case 5:
                    System.out.println("Enter roll number");
                    int roll = s.nextInt();
                    s.nextLine();
                    if(roll>st_i) {
                        System.out.println("Roll number not found");
                        break;
                    }
                    System.out.println("Enter field to be updated");
                    System.out.println("1. Name");
                    System.out.println("2. Phone");
                    System.out.println("3. Email");
                    System.out.println("4. Address");
                    System.out.println("5. Course");
                    int ch = s.nextInt();
                    s.nextLine();
                    switch (ch) {
                        case 1:
                            System.out.println("Enter new name");
                            st[roll-1].setName(s.nextLine());
                            break;
                        case 2:
                            System.out.println("Enter new phone number");
                            st[roll-1].setPhone(s.nextLine());
                            break;
                        case 3:
                            System.out.println("Enter new email");
                            st[roll-1].setEmail(s.nextLine());
                            break;
                        case 4:
                            System.out.println("Choose what to update");
                            System.out.println("1. House Number");
                            System.out.println("2. Street");
                            System.out.println("3. City");
                            System.out.println("4. Pin Code");
                            System.out.println("5. State");
                            int ch1 = s.nextInt();
                            s.nextLine();
                            st[roll-1].UpdateAddress(ch1);
                            break;
                        case 5:
                            System.out.println("Enter new course");
                            st[roll-1].setCourse(s.nextLine());
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                    break;
                case 6:
                    System.out.println("Enter Employee Id");
                    int eid = s.nextInt();
                    s.nextLine();
                    if(eid>f_i) {
                        System.out.println("Employee not found");
                        break;
                    }
                    System.out.println("Enter field to be updated");
                    System.out.println("1. Name");
                    System.out.println("2. Phone");
                    System.out.println("3. Email");
                    System.out.println("4. Address");
                    System.out.println("5. Department");
                    System.out.println("6. Specialization");
                    int ch1 = s.nextInt();
                    s.nextLine();
                    switch (ch1) {
                        case 1:
                            System.out.println("Enter new name");
                            f[eid-1].setName(s.nextLine());
                            break;
                        case 2:
                            System.out.println("Enter new phone number");
                            f[eid-1].setPhone(s.nextLine());
                            break;
                        case 3:
                            System.out.println("Enter new email");
                            f[eid-1].setEmail(s.nextLine());
                            break;
                        case 4:
                            System.out.println("Choose what to update");
                            System.out.println("1. House Number");
                            System.out.println("2. Street");
                            System.out.println("3. City");
                            System.out.println("4. Pin Code");
                            System.out.println("5. State");
                            int ch2 = s.nextInt();
                            s.nextLine();
                            f[eid-1].UpdateAddress(ch2);
                            break;
                        case 5:
                            System.out.println("Enter new department");
                            f[eid-1].setDept(s.nextLine());
                            break;
                        case 6:
                            System.out.println("Enter new specialization");
                            f[eid-1].setSpecialization(s.nextLine());
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                    break;
                case 7:
                System.out.println("Enter Roll Num");
                roll = s.nextInt();
                s.nextLine();
                if(roll>st_i) {
                    System.out.println("Student not found");
                    break;
                }
                st[roll-1].showStudent();
                break;
                case 8:
                System.out.println("Enter Employee Id");
                eid = s.nextInt();
                s.nextLine();
                if(eid>f_i) {
                    System.out.println("Employee not found");
                    break;
                }
                f[eid-1].showFaculty();
                break;
                case 9:
                break;
                default:
                    break;
                    

            }

        } while (choice != 9);
        s.close();
    }
}
