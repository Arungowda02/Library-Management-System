package interfaces.transactions;

public interface Transaction {
    void markAsReturned();
    String getTransactionDetails();
}
