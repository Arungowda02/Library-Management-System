package implimentations.member_implimentation;

import entities.Book;
import interfaces.member.Member;

import java.util.List;

import static static_variables.StaticVariables.borrowedBooks;

public class MemberImpl implements Member {

    //borrow book
    @Override
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.updateAvailability(false);
            System.out.println("The Book " + book.getTitle() + " is borrowed.");
        } else {
            System.out.println("The Book " + book.getTitle() + " is not available.");
        }

    }

    //return book
    @Override
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.updateAvailability(true);
            System.out.println("Book " + book.getTitle() + " is returned");
        } else {
            System.out.println("The Book " + book.getTitle() + " is not available.");
        }
    }

    //Listing all borrowed books.
    @Override
    public List<Book> listBorrowedBooks() {
        return borrowedBooks;
    }
}
