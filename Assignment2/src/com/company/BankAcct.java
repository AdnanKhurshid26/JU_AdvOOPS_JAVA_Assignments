package com.company;

import java.util.Scanner;

public class BankAcct {
    private int accno;
    private int balance;
    private static int interestRate;
  

    public BankAcct(int accno, int balance) {
        this.accno = accno;
        this.balance = balance;
    }

    public int getAccno() {
        return accno;
    }

    public static int getInterestRate() {
        return interestRate;
    }

   public static void setInterestRate(int interestRate) {
        BankAcct.interestRate = interestRate;
    }

    public int getBalance() {
        return balance;
    }

    public double calculateInterest() {
        System.out.println("Enter number of years\n");
        Scanner sc = new Scanner(System.in);
        int years = sc.nextInt();
        sc.nextLine();
        sc.close();
        return ((balance * years * interestRate) / 100);

    }

    public static void main(String[] args) {
        BankAcct b1 = new BankAcct(12345, 10000);
        BankAcct b2 = new BankAcct(12346, 20000);
        BankAcct.setInterestRate(10);
        System.out.println("Interest Rate is " + BankAcct.getInterestRate());
       
        System.out.println("Interest for b1 is " + b1.calculateInterest());
        System.out.println("Interest for b2 is " + b2.calculateInterest());
        
    }

}