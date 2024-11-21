package interfaces.member;



import entities.Book;

import java.util.List;

public interface Member {
    void borrowBook(Book book);
    void returnBook(Book book);
    List<Book> listBorrowedBooks();

}
