public class Deposit extends Operation {
    private String externalTransactionHash;

    public Deposit() {}
    public Deposit(String operationId, String operationType, String status,
                   String initiatorUserId, String currency, double amount, double fee, String externalTransactionHash) {
        super(operationId, operationType, status, initiatorUserId, currency, amount, fee);
        this.externalTransactionHash = externalTransactionHash;
    }

    public void acceptExternalTransaction() {}
    public void verifyConfirmation() {}
    public void creditUserAccount() {}

    public String getExternalTransactionHash() { return externalTransactionHash; }
    public void setExternalTransactionHash(String externalTransactionHash) { this.externalTransactionHash = externalTransactionHash; }

    @Override
    public String toString() {
        return "Deposit{" +
                "operationId='" + getOperationId() + '\'' +
                ", operationType='" + getOperationType() + '\'' +
                ", status='" + getStatus() + '\'' +
                ", initiatorUserId='" + getInitiatorUserId() + '\'' +
                ", currency='" + getCurrency() + '\'' +
                ", amount=" + getAmount() +
                ", fee=" + getFee() +
                ", externalTransactionHash='" + externalTransactionHash + '\'' +
                '}';
    }
}