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

}