package com.company;

import java.util.Scanner;

public class q11 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Course c =new Course();

        c.setData();

        c.showData();

    

    }

}

    class Instructor {
        Scanner sc = new Scanner(System.in);
        String phno;
        String name;

        public Instructor() {

        }

        public void setData() {

            System.out.println("Enter Phone Number of Instructor");
            phno = sc.nextLine();
            System.out.println("Enter Name of Instructor");
            name = sc.nextLine();
        }

        public void showData() {
            System.out.println(" Phone Number of Instructor : " + phno);

            System.out.println("Name of Instructor : " + name);

        }
    }

    class Textbook {
        Scanner sc = new Scanner(System.in);
        String title;
        String author;
        String publisher;

        public Textbook() {
        }

        public void setData() {

            System.out.println("Enter Title of Textbook");
            title = sc.nextLine();
            System.out.println("Enter Name of Author");
            author = sc.nextLine();
            System.out.println("Enter Name of Publisher");
            publisher = sc.nextLine();

        }

        public void showData() {

            System.out.println("Title of Textbook : " + title);

            System.out.println("Name of Author : " + author);

            System.out.println("Name of Publisher : " + publisher);

        }

    }

    class Course {
        Scanner sc = new Scanner(System.in);
        String name;
        Instructor i;
        Textbook t;

        public Course(){
            i=new Instructor();
            t=new Textbook();
            name="mycourse";
        }
        

        public void setData() {

            System.out.println("Enter name of course ");
            name = sc.nextLine();
            i.setData();
            t.setData();

        }

        public void showData() {

            System.out.println("Name of Couerse : " + name);
            i.showData();
            t.showData();

        }

    }
