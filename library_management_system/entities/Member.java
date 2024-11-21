package entities;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String memberId;
    private String name;
    private String address;
    private String contactNumber;
    private List<Book> borrowedBooks;

    public Member() {
    }

    public Member(String memberId, String name, String address, String contactNumber) {
        this.memberId = memberId;
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-10s %-10s %-15s %-15s",memberId,name,address,contactNumber,borrowedBooks);
    }
}
