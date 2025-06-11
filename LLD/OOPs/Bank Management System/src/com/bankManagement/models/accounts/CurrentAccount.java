package com.bankmanagement.models.accounts;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    // Default constructor
    public CurrentAccount() {
        super();
    }

    // Parameterized constructor
    public CurrentAccount(String accountNo, double balance, String status, double overdraftLimit) {
        super(accountNo, balance, status);
        this.overdraftLimit = overdraftLimit;
    }

    // Getter
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    // Setter
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    // toString() override
    @Override
    public String toString() {
        return "CurrentAccount{" +
                "accountNo='" + getAccountNo() + '\'' +
                ", balance=" + getBalance() +
                ", status='" + getStatus() + '\'' +
                ", overdraftLimit=" + overdraftLimit +
                '}';
    }
}
