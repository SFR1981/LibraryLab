package models;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="borrowers")
public class Borrower {

    private int id;
    private String name;
    private Set<Book> itemsBorrowed;

    public Borrower(String name){
        this.name = name;

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

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "borrower")
    public Set<Book> getItemsBorrowed() {
        return itemsBorrowed;
    }

    public void setItemsBorrowed(Set<Book> itemsBorrowed) {
        this.itemsBorrowed = itemsBorrowed;
    }

    public void addBookToItemsBorrowed(Book book) {
        this.itemsBorrowed.add(book);
    }

    public void borrows(Book book){
        this.itemsBorrowed.add(book);
    }
}
