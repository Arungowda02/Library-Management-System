package interfaces.librarian;


import entities.Book;
import entities.Member;


public interface Librarian {
    void issueBook(Book book, Member member);

    void receiveReturnedBook(Book book, Member member);
}
