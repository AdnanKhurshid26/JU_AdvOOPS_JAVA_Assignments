package Main;


import java.util.Scanner;

import BookList.BookList;

import MemberList.MemberList;

import Transactions.TransactionList;

class LibraryQ3 {
    Scanner scan = new Scanner(System.in);

    BookList book_list = new BookList(50);
    MemberList mem_list = new MemberList(50);
    TransactionList transact = new TransactionList();
    static int max_books_issued;

    static {
        max_books_issued = 5;
    }

    // Add a new Book to Library
    public void addBook() {
        book_list.addBook();
    }

    // Update a new Book in Library
    public void updateBook() {
        book_list.updateBook();
    }

    // Display details of a Book
    public void showBook() {
        book_list.showBook();
    }

    // Display the Book List
    public void showBookList() {
        book_list.showBookList();
    }

    // Register a new Member to Library
    public void addMember() {
        mem_list.addMember();
    }

    // Display details of a Member
    public void showMember() {
        mem_list.showMember();
    }

    // Display details of all the Members
    public void showMemberList() {
        mem_list.showMemberList();
    }

    // Issue a Book
    public void issueBook() {

        String mem_ID, book_ID;
        System.out.print("Enter Member ID:");
        mem_ID = scan.nextLine();

        if (mem_list.booksIssued(mem_ID) == -1) {
            System.out.println("Member with given ID not registered");
        }
        else if (mem_list.booksIssued(mem_ID) == max_books_issued) {
            System.out.println("Member already has the maximum permissible books issued");
        }
        else {
            System.out.print("Enter Book ID:");
            book_ID = scan.nextLine();

            if (book_list.available(book_ID) == -1) {
                System.out.println("Book with given ID not present in the Library");
            }
            else if (book_list.available(book_ID) == 0) {
                System.out.println("No copies of book available");
            }
            else {
                System.out.println("Book Issued!");
                book_list.copiesAfterTransaction(book_ID, -1);
                mem_list.issuedAfterTransaction(mem_ID, 1);
                transact.issueBook(mem_ID, book_ID);
            }
        }
    }

    
    // Return a Book
    public void returnBook() {
        String mem_ID, book_ID;
        System.out.print("Enter Member ID:");
        mem_ID = scan.nextLine();

        if (mem_list.booksIssued(mem_ID) == -1) {
            System.out.println("Member with given ID not registered");
        }
        else {
            System.out.print("Enter Book ID:");
            book_ID = scan.nextLine();

            if (book_list.available(book_ID) == -1) {
                System.out.println("Book with given ID not present in the Library");
            }
            else if (!transact.prevTransaction(mem_ID, book_ID, "Issue")) {
                System.out.println("Given Member ID had not issued a book with given Book ID");
            }
            else {
                System.out.println("Book returned!");
                book_list.copiesAfterTransaction(book_ID, 1);
                mem_list.issuedAfterTransaction(mem_ID, -1);
                transact.returnBook(mem_ID, book_ID);
            }
        }
    }
}

public class Q3Menu
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LibraryQ3 lib = new LibraryQ3();
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
