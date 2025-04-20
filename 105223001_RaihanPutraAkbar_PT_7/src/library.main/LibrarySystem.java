package library.main;

import library.model.*;
import java.util.ArrayList;

public class LibrarySystem {
    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<Member> members = new ArrayList<Member>();

    public void addBook(Book book) {
        books.add(book);
    }
}
