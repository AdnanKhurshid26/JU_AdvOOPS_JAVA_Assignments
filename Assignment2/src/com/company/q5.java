package com.company;

import java.util.Scanner;

class Customer {
    private int cId;
    private String name;
    private int curLoanAmount;
    private String phone;
    private boolean isPrivileged = false;

    public static int lastId = 0;
    public static int creditLimit;

    public Customer(String name, String phone) {
        lastId++;
        this.cId = lastId;
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getCredLimit() {
        return creditLimit;
    }

    public int getCurLoanAmount() {
        return curLoanAmount;
    }

    public int eligibleLoan() {
        return creditLimit - curLoanAmount;
    }

    public boolean loanAsked(int amount) {
        if (amount > creditLimit) {
            return false;
        }
        curLoanAmount += amount;
       
        return true;
    }

    public boolean makePrivileged(int amount) {
        if (this.isPrivileged) {
            return false;
        }

        this.isPrivileged = true;
        creditLimit += amount;
        return true;
    }

    public int getId() {
        return this.cId;
    }

    public boolean isPrivileged() {
        return this.isPrivileged;
    }

    public void showDetails() {
        System.out.println("Customer Id: " + this.cId);
        System.out.println("Customer Name: " + this.name);
        System.out.println("Customer Phone: " + this.phone);
        System.out.println("Customer Credit Limit: " + this.getCredLimit());
        System.out.println("Customer Current Loan Amount: " + this.curLoanAmount);
        System.out.println("Customer is Privileged: " + this.isPrivileged);
    }

}

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer.creditLimit = 50000;

     
        Customer[] customers = new Customer[100];

        int i = 0;

        int choice = 12;

        while (choice != 10) {
            System.out.println("1. Create Customer");
            System.out.println("2. Request Loan");
            System.out.println("3. Update account to Privileged");
            System.out.println("4. Update Name");
            System.out.println("5. Update Phone");
            System.out.println("6. Check Credit Limit");
            System.out.println("7. Check Current Loaned Amount");
            System.out.println("8. Check Eligible Loan Amount");
            System.out.println("9. Show Details of a customer");
            System.out.println("10. Exit");
            System.out.println("Enter your choice");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the name");
                    String name = sc.nextLine();
                    System.out.println("Enter the phone");
                    String phone = sc.nextLine();
                    customers[i++] = new Customer(name, phone);
                    break;
                case 2:
                    System.out.println("Enter the customer id");
                    int cid = sc.nextInt();
                    if (cid > customers.length) {
                        System.out.println("Customer not found");
                        break;
                    }

                    System.out.println("Enter the loan amount");
                    int loan = sc.nextInt();

                    if (customers[cid - 1].loanAsked(loan)) {
                        System.out.println("Loan Sanctioned Successsfully");
                    }

                    else {
                        System.out.println("You are not eligible for loan");
                    }
                    break;
                case 3:
                    System.out.println("Enter customer id");
                    cid = sc.nextInt();

                    if (cid > customers.length) {
                        System.out.println("Customer not found");
                        break;
                    }

                    if (customers[cid - 1].isPrivileged()) {
                        System.out.println("Already a privileged customer");
                    }

                    System.out.println("Enter the amount to increase Credit Limit");
                    int amt = sc.nextInt();

                    if (customers[cid - 1].makePrivileged(amt)) {
                        System.out.println("Made Privileged account succcessfully");
                    }
                    break;
                case 4:

                    System.out.println("Enter customer id");
                    cid = sc.nextInt();
                    if (cid > customers.length) {
                        System.out.println("Customer not found");
                        break;
                    }
                    System.out.println("Enter new name");
                    String newName = sc.nextLine();
                    customers[cid - 1].setName(newName);
                    break;

                case 5:

                    System.out.println("Enter customer id");
                    cid = sc.nextInt();
                    if (cid > customers.length) {
                        System.out.println("Customer not found");
                        break;
                    }
                    System.out.println("Enter new phone number");
                    String newPh = sc.nextLine();
                    customers[cid - 1].setName(newPh);
                    break;

                case 6:

                    System.out.println("Enter customer id");
                    cid = sc.nextInt();
                    if (cid > customers.length) {
                        System.out.println("Customer not found");
                        break;
                    }
                    System.out.println("Credit Limit : " + customers[cid - 1].getCredLimit());
                    break;

                case 7:

                    System.out.println("Enter customer id");
                    cid = sc.nextInt();
                    if (cid > customers.length) {
                        System.out.println("Customer not found");
                        break;
                    }
                    System.out.println("Current Loaned Amount : " + customers[cid - 1].getCurLoanAmount());
                    break;

                case 8:

                    System.out.println("Enter customer id");
                    cid = sc.nextInt();
                    if (cid > customers.length) {
                        System.out.println("Customer not found");
                        break;
                    }
                    System.out.println("Eligible Loan Amount : " + customers[cid - 1].eligibleLoan());
                    break;

                case 9:

                    System.out.println("Enter customer id");
                    cid = sc.nextInt();

                    if (cid > customers.length) {
                        System.out.println("Customer not found");
                        break;
                    }

                    customers[cid - 1].showDetails();
                    break;

                case 10:
                    choice = 10;
                    break;

            }
        }
        sc.close();
    }
}
