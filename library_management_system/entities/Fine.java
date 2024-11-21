package entities;

import java.time.LocalDate;
import java.time.Period;

public class Fine implements interfaces.fine.Fine {
    private String fineId;
    private Member member;
    private double amount;
    private LocalDate issueDate;
    private boolean isPaid;

    public Fine() {
    }

    public Fine(String fineId, Member member, double amount, LocalDate issueDate) {
        this.fineId = fineId;
        this.member = member;
        this.amount = amount;
        this.issueDate = issueDate;
        this.isPaid = false;
    }
    @Override
    public void calculateFine(LocalDate dueDate, LocalDate returnDate) {
        Period period = Period.between(dueDate,returnDate);
        int totalDueDays = period.getYears() * 365 + period.getMonths() * 30 + period.getDays();
        this.amount = totalDueDays * 10;
        System.out.println("fineId   = " + fineId +
                "\nmember     = " + member.getName() +
                "\namount     = " + amount +
                "\nissueDate  = " + issueDate +
                "\nisPaid     = " + (isPaid ? "Paid" : "Not Paid"));
    }

    @Override
    public void markAsPaid() {
        if (!isPaid) {
            this.isPaid = true;
        }
    }
}
