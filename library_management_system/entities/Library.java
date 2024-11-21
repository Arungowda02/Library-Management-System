package entities;

import java.util.List;

public class Library {
    private String name;
    private String address;
    private List<Book> books;
    private List<Member> members;
    private List<Librarian> librarians;

    public Library() {
    }

    public Library(String name, String address, List<Book> books, List<Member> members, List<Librarian> librarians) {
        this.name = name;
        this.address = address;
        this.books = books;
        this.members = members;
        this.librarians = librarians;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-10s %-10s %-10s %-10s",name,address,books,members,librarians);
    }
}
