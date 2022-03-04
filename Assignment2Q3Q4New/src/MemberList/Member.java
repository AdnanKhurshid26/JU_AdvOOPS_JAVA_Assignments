package MemberList;

import java.util.Scanner;


public class Member {
    Scanner scan = new Scanner(System.in);
    private String id;
    private String name;
    private String dob;
    private int booksIssued;

    public Member() {
        id = "";
        name = "";
        dob = "";
        booksIssued = 0;
    }

    // Setting the information a new Member
    public void setData(String i) {
        id = i;
        System.out.println("Enter Name of the Member:");
        name = scan.nextLine();
        System.out.println("Enter Date of Birth of the Member:");
        dob = scan.nextLine();
        booksIssued = 0;
    }

    // Returns ID of Member
    public String getID() {
        return id;
    }

    // Showing the information of a Member
    public void showData() {
        System.out.println("\n---Details of Member---\n");
        System.out.println("Member ID:  " + id);
        System.out.println("Name:  " + name);
        System.out.println("Date of Birth:  " + dob);
        System.out.println("Books isseud currently:  " + booksIssued);
    }

    // Issuing books to a Member
    public void issueBooks(int x) {
        booksIssued += x;
    }

    public int noOfBooksIssued() {
        return booksIssued;
    }

    public void updateBooksIssued(int x) {
        booksIssued += x;
    }
}