package static_variables;

import databases.BookDatabase;
import databases.BorrowedBooks;
import databases.MemberDatabase;
import entities.Book;
import entities.Member;
import implimentations.library_implimentation.LibraryImpl;
import implimentations.member_implimentation.MemberImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StaticVariables {
    public static List<Book> booksDatabase = new BookDatabase().databaseOfBooks();
    public static List<Member> membersDatabase = new MemberDatabase().databaseOfMembers();
    public static ArrayList<Book> borrowedBooks = new BorrowedBooks().databaseOfBorrowedBooks();
    public static Scanner sc = new Scanner(System.in);
    public static LibraryImpl libraryImpl = new LibraryImpl();
    public static MemberImpl memberImpl = new MemberImpl();
}
