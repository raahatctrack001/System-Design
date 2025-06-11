package com.bankManagement.models.accounts;

class SavingsAccount extends Account {
    private double interestRate;
    private double minimumBalance;

    // Default constructor
    public SavingsAccount() {
        super();
    }

    // Parameterized constructor
    public SavingsAccount(String accountNo, double balance, String status, double interestRate, double minimumBalance) {
        super(accountNo, balance, status);
        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;
    }

    // Getters
    public double getInterestRate() {
        return interestRate;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    // Setters
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    // toString() override
    @Override
    public String toString() {
        return "SavingsAccount{" +
                "accountNo='" + getAccountNo() + '\'' +
                ", balance=" + getBalance() +
                ", status='" + getStatus() + '\'' +
                ", interestRate=" + interestRate +
                ", minimumBalance=" + minimumBalance +
                '}';
    }
}
