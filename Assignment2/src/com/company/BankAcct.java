package com.company;

import java.util.Scanner;

public class BankAcct {
    private int accn;
    private int interest;
    private int balance;

    public BankAcct(int a,int b){accn=a;interest=10;balance=b;}

    public int getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }

    public int getBalance() {
        return balance;
    }
    double calculateInterest(){
        System.out.println("Enter number of years\n");
        Scanner sc=new Scanner(System.in);
        int years=sc.nextInt();
        sc.close();
        return ((balance*years*interest)/100);
        
    }
}