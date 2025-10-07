public class Exchange extends Operation {
    private double exchangeRate;
    private String targetCurrency;

    public Exchange() {}
    public Exchange(String operationId, String operationType, String status,
                    String initiatorUserId, String currency, double amount, double fee,
                    double exchangeRate, String targetCurrency) {
        super(operationId, operationType, status, initiatorUserId, currency, amount, fee);
        this.exchangeRate = exchangeRate;
        this.targetCurrency = targetCurrency;
    }

    public void calculateConversion() {}
    public void checkSourceFunds() {}
    public void interactWithExchange() {}
    public void chargeExchangeFee() {}

    public double getExchangeRate() { return exchangeRate; }
    public void setExchangeRate(double exchangeRate) { this.exchangeRate = exchangeRate; }

    public String getTargetCurrency() { return targetCurrency; }
    public void setTargetCurrency(String targetCurrency) { this.targetCurrency = targetCurrency; }

    @Override
    public String toString() {
        return "Exchange{" +
                "operationId='" + getOperationId() + '\'' +
                ", operationType='" + getOperationType() + '\'' +
                ", status='" + getStatus() + '\'' +
                ", initiatorUserId='" + getInitiatorUserId() + '\'' +
                ", currency='" + getCurrency() + '\'' +
                ", amount=" + getAmount() +
                ", fee=" + getFee() +
                ", exchangeRate=" + exchangeRate +
                ", targetCurrency='" + targetCurrency + '\'' +
                '}';
    }
}