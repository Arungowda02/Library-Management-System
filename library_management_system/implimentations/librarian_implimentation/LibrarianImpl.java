package implimentations.librarian_implimentation;

import entities.Book;
import entities.Member;
import implimentations.library_implimentation.LibraryImpl;
import interfaces.book.AddAndRemoveBook;
import interfaces.librarian.Librarian;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static static_variables.StaticVariables.*;

public class LibrarianImpl implements AddAndRemoveBook, Librarian {

    //add book
    @Override
    public void addBook(Book book) {
        new LibraryImpl().addBook(book);
    }

    //remove book
    @Override
    public void removeBook(Book book) {
        libraryImpl.removeBook(book);
    }


    //book issued to member
    @Override
    public void issueBook(Book book, Member member) {
        membersDatabase.stream().filter(mem -> mem.getName().equals(member.getName())).toList().get(0)
                .setBorrowedBooks(List.of(book));
        System.out.println("The Book " + book.getTitle() + " is issued to " + member.getName());
        memberImpl.borrowBook(book);

    }

    //book return from member
    @Override
    public void receiveReturnedBook(Book book, Member member) {
        membersDatabase.stream().filter(mem -> mem.getName().equals(member.getName()))
                .toList().get(0).getBorrowedBooks().remove(book);
        System.out.println("The Book " + book.getTitle() + " is returned from " + member.getName());
        memberImpl.returnBook(book);
    }
}
