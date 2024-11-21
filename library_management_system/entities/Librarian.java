package entities;

public class Librarian {
    private String librarianId;
    private String name;
    private String email;
    private String contactNumber;

    public Librarian() {
    }

    public Librarian(String librarianId, String name, String email, String contactNumber) {
        this.librarianId = librarianId;
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-20s %-25s %-15s",librarianId,name,email,contactNumber);
    }
}
