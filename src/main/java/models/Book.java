package models;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    private int id;
    private String title;
    private String author;
    private Boolean onLoan;
    private Borrower currentBorrower;

    public Book(){}

    public Book(String title, String author, Boolean onLoan) {
        this.title = title;
        this.author = author;
        this.onLoan = onLoan;
        this.currentBorrower = null;
    }


    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Column(name = "loan")
    public Boolean getOnLoan() {
        return onLoan;
    }

    public void setOnLoan(Boolean onLoan) {
        this.onLoan = onLoan;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="borrower_id", nullable = true)
    public Borrower getBorrower() {
        return currentBorrower;
    }

    public void setBorrower(Borrower borrower) {
        this.currentBorrower = borrower;
    }
}
