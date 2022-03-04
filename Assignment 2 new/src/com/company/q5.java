package com.company;

import java.util.Scanner;

class Student {
    private int roll;
    private String name;
    private int score;
    private static int lastRoll = 0;

    public Student() {
        roll = ++lastRoll;
        name = "";
        score = 0;
    }

    public Student(String name) {
        this.roll = ++lastRoll;
        this.name = name;
        this.score = 0;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) throws Exception {
        if (score > 100) { 
            throw new Exception("Score cannot be greater than 100");
        } 
        else if (score < 0) {
            throw new Exception("Score cannot be negative");
        }
        this.score = score;
    }

    public void display() {
        System.out.println("Student name : " + name);
        System.out.println("Roll no : " + roll);
        System.out.println("Score : " + score);
    }
}

public class q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.nextLine();
        Student s1 = new Student(name);
        s1.display();

        try {
            System.out.print("Enter score : ");
            int score = sc.nextInt();
            s1.setScore(score);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);

        }

        s1.display();
        sc.close();
    }
}
