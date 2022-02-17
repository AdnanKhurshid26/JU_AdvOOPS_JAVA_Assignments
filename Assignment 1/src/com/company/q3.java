package com.company;
import java.util.Scanner; 

public class q3 {
    public static void main(String[] args) {
        
        Scanner sin = new Scanner(System.in);

        int cm;
        float feet,inch;

        System.out.println("Enter the height in cm : ");
        cm =  sin.nextInt();

        feet = cm/30.5f;
        inch = (cm%30.5f)/2.54f;

        System.out.println("Height in feet and inch : "+feet+" feet "+inch+" inch");



        sin.close();
    }
}
