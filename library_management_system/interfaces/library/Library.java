package interfaces.library;

import entities.Book;

import java.util.List;

public interface Library {
    List<entities.Book> searchBook(String title);

    List<entities.Book> searchBookByAuthor(String author);

    List<Book> listAvailableBooks();

}
