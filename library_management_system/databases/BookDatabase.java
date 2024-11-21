package databases;

import entities.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookDatabase {
    public List<Book> databaseOfBooks() {
        return new ArrayList<>(Arrays.asList(
                new Book("To Kill", "Harper Lee", "9780061120084", 1960, true),
                new Book("1984", "George Orwell", "9780451524935", 1949, true),
                new Book("Pride & Prejudice", "Jane Austen", "9780141040349", 1813, false),
                new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", 1925, true),
                new Book("Moby Dick", "Herman Melville", "9781503280786", 1851, false),
                new Book("Jane Eyre", "Charlotte Brontë", "9781503278196", 1847, true),
                new Book("The Lord of the Rings", "J.R.R. Tolkien", "9780544003415", 1954, false),
                new Book("The Book Thief", "Markus Zusak", "9780375842207", 2005, true),
                new Book("Little Women", "Louisa May Alcott", "9780147514011", 1868, false),
                new Book("Animal Farm", "George Orwell", "9780451526342", 1945, true)
        ));
    }
}
