package com.bankmanagement.models.accounts;

public class Account {
    private String accountNo;
    private double balance;
    private String status;  // e.g. Active, Blocked, Closed

    // Default constructor
    public Account() {}

    // Parameterized constructor
    public Account(String accountNo, double balance, String status) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.status = status;
    }

    // Getters
    public String getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // toString() method
    @Override
    public String toString() {
        return "Account{" +
                "accountNo='" + accountNo + '\'' +
                ", balance=" + balance +
                ", status='" + status + '\'' +
                '}';
    }
}
