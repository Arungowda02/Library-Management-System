package databases;

import entities.Librarian;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibrarianDatabase {
    public List<Librarian> databaseOfLibrarian() {
        return new ArrayList<>(Arrays.asList(
                new Librarian("L001", "John Smith", "john.smith@library.com", "9876543210"),
                new Librarian("L002", "Mary Johnson", "mary.johnson@library.com", "8765432109"),
                new Librarian("L003", "Robert Brown", "robert.brown@library.com", "7654321098"),
                new Librarian("L004", "Patricia Taylor", "patricia.taylor@library.com", "6543210987"),
                new Librarian("L005", "Michael Williams", "michael.williams@library.com", "5432109876")
        ));
    }
}
