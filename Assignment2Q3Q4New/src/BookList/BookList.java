package BookList;
import java.util.Scanner;

public class BookList {
    Scanner scan = new Scanner(System.in);
    Book[] books;
    int len;
    int MAX;

    public BookList(int max) {
        MAX = max;
        len=0;
        books = new Book[100];
    }

    // Checks if a book is present in the list
    public int isPresent(String id) {
        for (int i = 0; i <len; i++) {
            if (books[i].getID().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    // Adding a new Book to the list
    public void addBook() {
        if (len < MAX){
            String i;
            System.out.println("Enter the ID of new Book:");
            i = scan.nextLine();

            if (isPresent(i) != -1) {
                System.out.println("Book with same ID already exists!!");
            }
            else {
                books[len] = new Book();
                books[len].setData(i);
                len++;
            }
        }
        else {
            System.out.println("Library already has the maximum amount of books");
        }
    }

    // Display information of a Book
    public void showBook() {
        String i;
        System.out.println("Enter the ID of Book");
        i = scan.nextLine();

        if (isPresent(i) != -1) {
            books[isPresent(i)].showData();
        }
        else {
            System.out.println("Book not present in the library");
        }
    }

    // Display the list of books
    public void showBookList() {
        for (int i = 0; i < len; i++) {
            books[i].showData();
        }
    }

    // Change attributes of a Book
    public void updateBook() {
        String i;
        System.out.println("Enter the ID of Book:");
        i = scan.nextLine();

        if (isPresent(i) != -1) {
            books[isPresent(i)].addCopies();
        }
        else {
            System.out.println("Book not present in the library");
        }
    }

    // Get copies available of a Book
    public int available(String id) {
        if (isPresent(id) != -1) {
            return books[isPresent(id)].getCopiesAvailable();
        }

        return -1;
    }

    // Update copies available of a book after transaction
    public void copiesAfterTransaction(String _id, int x) {
        books[isPresent(_id)].transact(x);
    }
}
