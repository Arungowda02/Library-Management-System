package implimentations.library_implimentation;

import entities.Book;
import entities.Member;
import interfaces.library.Library;
import interfaces.book.AddAndRemoveBook;
import interfaces.member.AddAndRemoveMember;

import java.util.List;

import static static_variables.StaticVariables.booksDatabase;
import static static_variables.StaticVariables.membersDatabase;

public class LibraryImpl implements AddAndRemoveBook, AddAndRemoveMember, Library {


    //adding book into book database
    @Override
    public void addBook(Book book) {
        booksDatabase.add(book);
        System.out.println(book.getTitle()+" is added successfully.");
    }

    //removing book from book database
    @Override
    public void removeBook(Book book) {
        booksDatabase.remove(book);
        System.out.println(book.getTitle()+" is removed successfully.");
    }

    //adding member into member database
    @Override
    public void registerMember(Member member) {
        membersDatabase.add(member);
        System.out.println(member.getName()+" is added successfully.");

    }

    //removing member from  member database
    @Override
    public void removeMember(Member member) {
        membersDatabase.remove(member);
        System.out.println(member.getName()+" is removed successfully.");
    }


    //list books by book title
    @Override
    public List<Book> searchBook(String title) {
        return booksDatabase.stream().filter(book -> book.getTitle().equals(title)).toList();
    }

    //list books by book author
    @Override
    public List<Book> searchBookByAuthor(String author) {
        return booksDatabase.stream().filter(book -> book.getAuthor().equals(author)).toList();
    }

    //list books is available
    @Override
    public List<Book> listAvailableBooks() {
        return booksDatabase.stream().filter(Book::isAvailable).toList();
    }
}
