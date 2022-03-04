package Transactions;


public class TransactionList {
    Transaction[] transaction;
    int len;

    public TransactionList() {
        len = 0;
        transaction = new Transaction[100];
    }

    // Issue a Book
    public void issueBook(String m, String b) {
        transaction[len] = new Transaction(m, b, "Issue");
        len++;
    }

    // Return a Book
    public void returnBook(String m, String b) {
        transaction[len] = new Transaction(m, b, "Return");
        len++;
    }

    public boolean prevTransaction(String m, String b, String t) {
        for (int i = 0; i < len; i++) {
            boolean a = transaction[i].getBookID().equals(b);
            boolean d = transaction[i].getMemID().equals(m);
            boolean c = transaction[i].getTrasactionType().equals(t);

            if (a && d && c) {
                return true;
            }
        }

        return false;
    }

}

