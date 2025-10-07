package ua.edu.ontu.cryptobanking.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String id;
    private String name;
    private String contactInfo;
    private String userType;
    private String verificationStatus;
    private double balance;
    private List<String> transactionHistory;

    String internalNotes;
    protected String securityLevel;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
        this.verificationStatus = "UNVERIFIED";
        this.userType = "REGULAR";
        this.internalNotes = "";
        this.securityLevel = "STANDARD";
    }

    public User(String id, String name, String contactInfo, String userType,
                String verificationStatus, double balance, String transactionHistory) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
        this.userType = userType;
        this.verificationStatus = verificationStatus;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
        if (transactionHistory != null) {
            this.transactionHistory.add(transactionHistory);
        }
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public void addInternalNote(String note) {
        this.internalNotes += note + "\n";
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            addToTransactionHistory("DEPOSIT: +" + amount);
            System.out.println("Successful deposit: " + amount);
        }
    }


    public boolean transferTo(User recipient, double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            recipient.deposit(amount);
            addToTransactionHistory("TRANSFER to " + recipient.getId() + ": -" + amount);
            return true;
        }
        System.out.println("Transfer failed: insufficient funds");
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            addToTransactionHistory("WITHDRAWAL: -" + amount);
            System.out.println("Successful withdrawal: " + amount);
            return true;
        }
        System.out.println("Withdrawal failed");
        return false;
    }

    private void addToTransactionHistory(String transaction) {
        transactionHistory.add(transaction);
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getBalance() { return balance; }
    public List<String> getTransactionHistory() {
        return new ArrayList<>(transactionHistory);
    }

    @Override
    public String toString() {
        return String.format("User{id='%s', name='%s', balance=%.2f}", id, name, balance);
    }
}