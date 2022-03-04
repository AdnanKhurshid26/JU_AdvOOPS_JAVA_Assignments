package BookList;

import java.util.*;
public class Book {
    Scanner scan = new Scanner(System.in);
    private String id;
    private String title;
    private int copiesPurchased;
    private int copiesAvailable;

    //default constructor
    public Book() {
        id = "";
        title = "";
        copiesPurchased = 0;
        copiesAvailable = 0;
    }

    // Setting the information of a new Book
    public void setData(String i) {
        id = i;
        System.out.println("Enter the Title of the book:");
        title = scan.nextLine();
        System.out.println("Enter the copies purchased of the book:");
        copiesPurchased = Integer.parseInt(scan.nextLine());
        copiesAvailable = copiesPurchased;
    }

    // Showing the information of a Book
    public void showData() {
        System.out.println("\n---Details of Book---\n");
        System.out.println("Book ID:  " + id);
        System.out.println("Title:  " + title);
        System.out.println("Copies of book purchased:  " + copiesPurchased);
        System.out.println("Copies of book available:  " + copiesAvailable);
    }
    // Updating information of an existing Book
    public void addCopies() {

        int temp;
        System.out.println("Enter the number of copies to be added:");
        temp = Integer.parseInt(scan.nextLine());
        copiesPurchased += temp;
        copiesAvailable += temp;

    }
    public String getID() {
        return id;
    }

    // Return copies available of a Book
    public int getCopiesAvailable() {
        return copiesPurchased;
    }

    // Update copies available of a Book
    public void transact(int x) {
        copiesAvailable += x;
    }
}

