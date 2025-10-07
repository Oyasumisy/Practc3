public class Transfer extends Operation {
    private String recipientUserId;

    public Transfer() {}
    public Transfer(String operationId, String operationType, String status,
                    String initiatorUserId, String currency, double amount, double fee, String recipientUserId) {
        super(operationId, operationType, status, initiatorUserId, currency, amount, fee);
        this.recipientUserId = recipientUserId;
    }

    public void transferFunds() {}
    public void checkSufficientFunds() {}
    public void recordTransaction() {}
    public void chargeInternalFee() {}

    public String getRecipientUserId() { return recipientUserId; }
    public void setRecipientUserId(String recipientUserId) { this.recipientUserId = recipientUserId; }

    @Override
    public String toString() {
        return "Transfer{" +
                "operationId='" + getOperationId() + '\'' +
                ", operationType='" + getOperationType() + '\'' +
                ", status='" + getStatus() + '\'' +
                ", initiatorUserId='" + getInitiatorUserId() + '\'' +
                ", currency='" + getCurrency() + '\'' +
                ", amount=" + getAmount() +
                ", fee=" + getFee() +
                ", recipientUserId='" + recipientUserId + '\'' +
                '}';
    }
}