package com.company;
import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);

        String s1,s2;

        System.out.println("Enter the string 1");
        s1 = sin.nextLine();
        System.out.println("Enter the string 1");
        s2 = sin.nextLine();

        if (s1==s2) {
           
        }
         if (s1.equals(s2)) {
            System.out.println("Both strings are equal");
        }
        sin.close();
    }
}
