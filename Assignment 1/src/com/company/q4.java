package com.company;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        final double pi = 3.14;
        double radius,area;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the radius");
        radius = s.nextDouble();

        area = 2*pi*radius;

        System.out.println("Area = " + area);
        s.close();

    }
}
