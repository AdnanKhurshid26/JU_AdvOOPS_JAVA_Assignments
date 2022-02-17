package com.company;

import java.util.Scanner;


public class q3 {
    static int aOccurence(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }

    static int andOccurence(String str){

        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'a' && str.charAt(i+1) == 'n' && str.charAt(i+2) == 'd') {
                count++;
            }
        }

        return count;
    }

    static boolean startsWithThe(String str){
        
        return str.startsWith("The");
    }

    static void stringToArray(String str){
        str.toCharArray();
    }

    static void printTokens(String str){
        String [] tokens = new String[32];
        int i = 0;
        int start = 0;

        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == ' ' || str.charAt(j)=='@' || str.charAt(j)== '.') {
                tokens[i] = str.substring(start, j);
                start = j + 1;
                i++;
            }
        }

        tokens[i++] = str.substring(start,str.length());

        for (int j = 0; j < i; j++) {
            if(tokens[j] != null){
                System.out.println(tokens[j]);
            }
         
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println("Number of a's = "+aOccurence(str));
        System.out.println("Number of and's = "+andOccurence(str));
        System.out.println("Does the string starts with the? "+startsWithThe(str));
        stringToArray(str);
        printTokens(str);
        sc.close();
    }
}
