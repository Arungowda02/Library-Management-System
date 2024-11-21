package interfaces.fine;

import java.time.LocalDate;

public interface Fine {
    void calculateFine(LocalDate dueDate, LocalDate returnDate);
    void markAsPaid();


}
