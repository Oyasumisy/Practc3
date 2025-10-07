public class Operation {
    private String operationId;
    private String operationType;
    private String status;
    private String initiatorUserId;
    private String currency;
    private double amount;
    private double fee;

    public Operation() {}
    public Operation(String operationId, String operationType, String status,
                     String initiatorUserId, String currency, double amount, double fee) {
        this.operationId = operationId;
        this.operationType = operationType;
        this.status = status;
        this.initiatorUserId = initiatorUserId;
        this.currency = currency;
        this.amount = amount;
        this.fee = fee;
    }

    public void registerTransactionDetails() {}
    public void updateUserBalances() {}
    public void generatePaymentRecords() {}
    public void controlOperationStatus() {}

    public String getOperationId() { return operationId; }
    public void setOperationId(String operationId) { this.operationId = operationId; }

    public String getOperationType() { return operationType; }
    public void setOperationType(String operationType) { this.operationType = operationType; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getInitiatorUserId() { return initiatorUserId; }
    public void setInitiatorUserId(String initiatorUserId) { this.initiatorUserId = initiatorUserId; }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public double getFee() { return fee; }
    public void setFee(double fee) { this.fee = fee; }

    @Override
    public String toString() {
        return "Operation{" +
                "operationId='" + operationId + '\'' +
                ", operationType='" + operationType + '\'' +
                ", status='" + status + '\'' +
                ", initiatorUserId='" + initiatorUserId + '\'' +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                ", fee=" + fee +
                '}';
    }
}