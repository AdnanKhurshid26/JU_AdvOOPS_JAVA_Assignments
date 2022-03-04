package Main;

import java.util.Scanner;
import BookList.BookList;
import MemberList.MemberList;
import Transactions.TransactionList;

class LibraryQ4 implements LibraryInterface{
    Scanner scan = new Scanner(System.in);


    BookList books = new BookList(50);
    MemberList members = new MemberList(50);
    TransactionList transactions = new TransactionList();

    // Add a new Book to Library
    public void addBook() {
        books.addBook();
    }

    // Update a new Book in Library
    public void updateBook() {
        books.updateBook();
    }

    // Display details of a Book
    public void showBook() {
        books.showBook();
    }

    // Display the Book List
    public void showBookList() {
        books.showBookList();
    }

    // Register a new Member to Library
    public void addMember() {
        members.addMember();
    }

    // Display details of a Member
    public void showMember() {
        members.showMember();
    }

    // Display details of all the Members
    public void showMemberList() {
        members.showMemberList();
    }

    // Issue a Book
    public void issueBook() {
        String mem_ID, book_ID;
        System.out.print("Enter Member ID:");
        mem_ID = scan.nextLine();

        if (members.booksIssued(mem_ID) == -1) {
            System.out.println("Member with given ID not registered");
        }
        else if (members.booksIssued(mem_ID) == max_books_issued) {
            System.out.println("Member already has the maximum permissible books issued");
        }
        else {
            System.out.print("Enter Book ID:");
            book_ID = scan.nextLine();

            if (books.available(book_ID) == -1) {
                System.out.println("Book with given ID not present in the Library");
            }
            else if (books.available(book_ID) == 0) {
                System.out.println("No copies of book available");
            }
            else {
                System.out.println("Book Issued!");
                books.copiesAfterTransaction(book_ID, -1);
                members.issuedAfterTransaction(mem_ID, 1);
                transactions.issueBook(mem_ID, book_ID);
            }
        }
    }

    // Return a Book
    public void returnBook() {
        String mem_ID, book_ID;
        System.out.print("Enter Member ID:");
        mem_ID = scan.nextLine();

        if (members.booksIssued(mem_ID) == -1) {
            System.out.println("Member with given ID not registered");
        }
        else {
            System.out.print("Enter Book ID:");
            book_ID = scan.nextLine();

            if (books.available(book_ID) == -1) {
                System.out.println("Book with given ID not present in the Library");
            }
            else if (!transactions.prevTransaction(mem_ID, book_ID, "Issue")) {
                System.out.println("Given Member ID had not issued a book with given Book ID");
            }
            else {
                System.out.println("Book returned!");
                books.copiesAfterTransaction(book_ID, 1);
                members.issuedAfterTransaction(mem_ID, -1);
                transactions.returnBook(mem_ID, book_ID);
            }
        }
    }
}

public class Q4Menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LibraryQ4 lib = new LibraryQ4();
        int choice = 0;

        do {
            System.out.println("---------------LIbrary Management System---------------");
            System.out.println("1.  Add new book in Book list");
            System.out.println("2.  Add copies of a book");
            System.out.println("3.  Show details of a Book");
            System.out.println("4.  Show all the books ");
            System.out.println("5.  Register a Member");
            System.out.println("6.  Show details of a registered Member");
            System.out.println("7.  Show details of all the registered members");
            System.out.println("8.  Issue a Book");
            System.out.println("9.  Return a Book");
            System.out.println("10. Exit");
            System.out.println("\nEnter your choice");

            choice = scan.nextInt();
            scan.nextLine();

            switch(choice) {
                case 0:
                    break;
                case 1:
                    lib.addBook();
                    break;
                case 2:
                    lib.updateBook();
                    break;
                case 3:
                    lib.showBook();
                    break;
                case 4:
                    lib.showBookList();
                    break;
                case 5:
                    lib.addMember();
                    break;
                case 6:
                    lib.showMember();
                    break;
                case 7:
                    lib.showMemberList();
                    break;
                case 8:
                    lib.issueBook();
                    break;
                case 9:
                    lib.returnBook();
                    break;
                default:
                    choice = 0;
                    break;
            }

        } while (choice!=10);
        scan.close();
    }
}

