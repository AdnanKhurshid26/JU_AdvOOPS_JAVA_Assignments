package Transactions;


public class Transaction {
    String memId;
    String bookId;
    String type;

    public Transaction(String mid, String bid, String t) {
        memId = mid;
        bookId = bid;
        type = t;
    }

    // Updating a Txn
    public void updateEntry(String m, String b) {
        memId = m;
        bookId = b;
    }

    // Showing an Entry
    public void showTxn() {
        System.out.println("\n---Transaction Entry---");
        System.out.println("Member ID:  " + memId);
        System.out.println("Book ID:  " + bookId);
        System.out.println("Nature of Transaction:  " + type);
    }

    public String getBookID() {
        return bookId;
    }

    public String getMemID() {
        return memId;
    }

    public String getTrasactionType() {
        return type;
    }

}

