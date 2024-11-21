package entities;

import java.time.LocalDate;

public class Transaction implements interfaces.transactions.Transaction {
    private String transactionId;
    private Member member;
    private Book book;
    private LocalDate issueDate;
    private LocalDate returnDate;
    private boolean isReturned;

    public Transaction() {
    }

    public Transaction(String transactionId, Member member, Book book, LocalDate issueDate, LocalDate returnDate) {
        this.transactionId = transactionId;
        this.member = member;
        this.book = book;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
        this.isReturned = false;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isReturned() {
        return isReturned;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }

    //printing transaction
    @Override
    public String getTransactionDetails() {
        return "Transaction ID : " + getTransactionId() +
                "\nMember         : " + getMember().getName() +
                "\nBook           : " + getBook().getTitle() +
                "\nIssue Date     : " + getIssueDate() +
                "\nReturn Date    : " + (isReturned() ? returnDate : "Not returned yet") +
                "\nStatus         : " + (isReturned() ? "Returned" : "Not returned");
    }

    //marking the return
    @Override
    public void markAsReturned() {
        if(!isReturned()){
            this.isReturned = true;
            this.returnDate = LocalDate.now();
            System.out.println("Book is return successfully.");
        }else {
            System.out.println("This book has already been returned.");
        }
    }
}
