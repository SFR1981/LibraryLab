import db.DBHelper;
import models.Book;
import models.Borrower;

public class Runner {

    public static void main(String[] args) {
        Book book1 = new Book ("Dogs", "Mr Dogs", false);
        DBHelper.save(book1);
        Borrower borrower1 = new Borrower( "Barry Chuckle");
        DBHelper.save(borrower1);



    }
}
