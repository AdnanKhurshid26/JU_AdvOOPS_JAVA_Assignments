package com.company;
import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
	    short a,b;
        Scanner sin = new Scanner(System.in);

        System.out.println("Enter first num");
        a = sin.nextShort();

        System.out.println("Enter second num");
        b = sin.nextShort();

        System.out.println("Sum = " + (a+b));

        sin.close();
    }
}
