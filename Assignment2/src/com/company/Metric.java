package com.company;

import java.util.Scanner;

public class Metric {
   
    static double kmToMiles(double km){
        double miles = km/1.5;
        return miles;
    }
    static double milesToKm(double miles){
        double km = miles*1.5;
        return km;
    }   

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the distance in km");

        double km = sc.nextDouble();

        System.out.println("Distance in Miles = "+ kmToMiles(km));

        System.out.println("Enter the distance in miles");

        double miles = sc.nextDouble();

        System.out.println("Distance in Km = "+ milesToKm(miles));

        sc.close();
    }
   
  

}