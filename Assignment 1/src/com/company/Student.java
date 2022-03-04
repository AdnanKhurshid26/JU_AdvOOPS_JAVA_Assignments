package com.company;



public class Student {
    private int roll;
    private String name;
    private int score;

    public static void main(String[] args) {
        Student s1, s2;

        s1 = new Student(10, "adnan", 85);
        s2 = new Student(s1);

        s1.showData();
        s2.showData();

        s2.setName("rahul");

        s1.showData();
        s2.showData();
    }

    public Student(int roll) {
        this.roll = roll;
    }

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public Student(int roll, String name, int score) {
        this.roll = roll;
        this.name = name;
        this.score = score;
    }

    public Student() {
        this.roll = 0;
        this.name = "";
        this.score = 0;

    };

    public Student(Student s) {

        this.roll = s.roll;
        this.name = s.name;
        this.score = s.score;

    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void showData() {
        System.out.println("Roll : " + roll);
        System.out.println("Name : " + name);
        System.out.println("Score : " + score);
    }

    public void copy(Student st) {

        st.roll = this.roll;
        st.name = this.name;
        st.score = this.score;
    }

}
