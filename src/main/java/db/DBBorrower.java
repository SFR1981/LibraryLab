package db;

import models.Book;
import models.Borrower;

public class DBBorrower {

    public static void bookIsBorrowedByBorrower(Book book, Borrower borrower){
        book.isBorrowed(borrower);
        borrower.borrows(book);
        DBHelper.save(book);
        DBHelper.save(borrower);

    }
}
