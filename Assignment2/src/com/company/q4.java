package com.company;


import java.util.Scanner;

public class q4 {
   
	public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the integer");
        num = sc.nextInt();

        // i. Basic data type to object
        System.out.println("i. " + Integer.valueOf(num) + " is of type " + Integer.valueOf(num).getClass().getSimpleName());

        //ii. Object to primitive data type
        int n = Integer.valueOf(num).intValue();
        System.out.println("ii. " + "Object to basic data type : " + n);

        //iii. Basic data type to String
        String s = Integer.toString(num);
        System.out.println("iii. " + "Basic data type to String : " + s + " and its type is " + s.getClass().getSimpleName());

        //iv. String to numeric object
        Integer n1 = Integer.parseInt(s);
        System.out.println("iv. " + "String to numeric object : " + n1+ " and its type is " + n1.getClass().getSimpleName());

        //v. Nunmeric object to String
        String s1 = n1.toString();
        System.out.println("v. " + "Numeric object to String : " + s1 + " and its type is " + s1.getClass().getSimpleName());

        sc.close();
    }
}