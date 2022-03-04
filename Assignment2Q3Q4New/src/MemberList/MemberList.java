package MemberList;

import java.util.Scanner;

public class MemberList {

    Scanner scan = new Scanner(System.in);

    private Member[] members;
    int len;
    int MAX;

    public MemberList(int max) {
        len = 0;
        MAX = max;
        members = new Member[100];
    }

    // Checking if a Member is present or not
    public int isPresent(String id) {
        for (int i = 0; i < len; i++) {
            if (members[i].getID().equals(id)) {
                return i;
            }
        }

        return -1;
    }

    // Getting the books issued to a Member
    public int booksIssued(String id) {
        if (isPresent(id) != -1) {
            return members[isPresent(id)].noOfBooksIssued();
        }

        return -1;
    }

    // Adding a new Member
    public void addMember() {
        if (len < MAX) {
            String i;
            System.out.println("Enter the ID of new Member:");
            i = scan.nextLine();

            if (isPresent(i) != -1) {
                System.out.println("Member is already registered!!");
            }
            else {
                members[len] = new Member();
                members[len].setData(i);
                len++;
            }
        }
        else {
            System.out.println("Maximum number of members have been registered");
        }
    }

    // Display information of a Member
    public void showMember() {
        String i;
        System.out.println("Enter the ID of Member whose details you want to see:");
        i = scan.nextLine();

        if (isPresent(i) != -1) {
            members[isPresent(i)].showData();
        }
        else {
            System.out.println("Member not registered");
        }

    }

    // Display the list of Members
    public void showMemberList() {
        for (int i = 0; i < len; i++) {
            members[i].showData();
        }
    }

    public void issuedAfterTransaction(String id, int x) {
        members[isPresent(id)].updateBooksIssued(x);
    }
}

