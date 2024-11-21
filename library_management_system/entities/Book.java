package entities;

public class Book implements interfaces.book.Book {
    private String title;
    private String author;
    private String ISBN;
    private int publicationYear;
    private boolean isAvailable;

    public Book() {
    }

    public Book(String title, String author, String ISBN, int publicationYear, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public void updateAvailability(boolean status) {
        this.isAvailable = status;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-20s %-20s %-15d %-10s", title, author, ISBN, publicationYear, isAvailable);
    }

    @Override
    public String getDetails() {
        return String.format("%-20s %-20s %-20s %-15d %-10s", title, author, ISBN, publicationYear, isAvailable);
    }
}
