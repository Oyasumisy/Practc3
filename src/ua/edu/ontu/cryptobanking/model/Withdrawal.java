public class Withdrawal extends Operation {
    private String destinationAddress;

    public Withdrawal() {}
    public Withdrawal(String operationId, String operationType, String status,
                      String initiatorUserId, String currency, double amount, double fee, String destinationAddress) {
        super(operationId, operationType, status, initiatorUserId, currency, amount, fee);
        this.destinationAddress = destinationAddress;
    }

    public void checkBalance() {}
    public void reserveFunds() {}
    public void executeExternalTransfer() {}

    public String getDestinationAddress() { return destinationAddress; }
    public void setDestinationAddress(String destinationAddress) { this.destinationAddress = destinationAddress; }

    @Override
    public String toString() {
        return "Withdrawal{" +
                "operationId='" + getOperationId() + '\'' +
                ", operationType='" + getOperationType() + '\'' +
                ", status='" + getStatus() + '\'' +
                ", initiatorUserId='" + getInitiatorUserId() + '\'' +
                ", currency='" + getCurrency() + '\'' +
                ", amount=" + getAmount() +
                ", fee=" + getFee() +
                ", destinationAddress='" + destinationAddress + '\'' +
                '}';
    }
}