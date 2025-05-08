package library.main;

import java.util.ArrayList;

import library.model.*;

public class LibrarySystem {
    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<Member> members = new ArrayList<Member>();

    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1925");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "1960");
        Book book3 = new Book("1984", "George Orwell", "1949");

        Member member1 = new Member("John Doe", "12345");
        Member member2 = new Member("Jane Smith", "67890");

        LibrarySystem library = new LibrarySystem();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addMember(member1);
        library.addMember(member2);

        library.showBooks();
        library.showMembers();
    }
    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }

    public void showMembers() {
        for (Member member : members) {
            System.out.println(member.getName());
        }
    }
}
