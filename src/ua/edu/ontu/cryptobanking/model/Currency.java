package ua.edu.ontu.cryptobanking.model;

public class Currency {
    private String currencyCode;
    private String currencyName;
    private int decimalPlaces;
    private double minLimit;
    private double maxLimit;
    private double exchangeRate;

    public Currency(String currencyCode, String currencyName, int decimalPlaces,
                    double minLimit, double maxLimit, double exchangeRate) {
        this.currencyCode = currencyCode;
        this.currencyName = currencyName;
        this.decimalPlaces = decimalPlaces;
        this.minLimit = minLimit;
        this.maxLimit = maxLimit;
        this.exchangeRate = exchangeRate;
    }

    public double convertTo(double amount, Currency targetCurrency) {
        return amount * this.exchangeRate / targetCurrency.exchangeRate;
    }

    public boolean isValidAmount(double amount) {
        return amount >= minLimit && amount <= maxLimit;
    }

    void updateExchangeRate(double newRate) {
        this.exchangeRate = newRate;
    }

    public String getCurrencyCode() { return currencyCode; }
    public String getCurrencyName() { return currencyName; }
    public double getExchangeRate() { return exchangeRate; }

    @Override
    public String toString() {
        return String.format("Currency{code='%s', rate=%.2f}", currencyCode, exchangeRate);
    }
}