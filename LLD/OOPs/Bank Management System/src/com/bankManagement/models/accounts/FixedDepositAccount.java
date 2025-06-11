package com.bankManagement.models.accounts;

import java.time.LocalDate;

public class FixedDepositAccount extends Account {
    private double interestRate;
    private LocalDate maturityDate;
    private int tenureMonths;

    // Default constructor
    public FixedDepositAccount() {
        super();
    }

    // Parameterized constructor
    public FixedDepositAccount(String accountNo, double balance, String status, double interestRate, LocalDate maturityDate, int tenureMonths) {
        super(accountNo, balance, status);
        this.interestRate = interestRate;
        this.maturityDate = maturityDate;
        this.tenureMonths = tenureMonths;
    }

    // Getters
    public double getInterestRate() {
        return interestRate;
    }

    public LocalDate getMaturityDate() {
        return maturityDate;
    }

    public int getTenureMonths() {
        return tenureMonths;
    }

    // Setters
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setMaturityDate(LocalDate maturityDate) {
        this.maturityDate = maturityDate;
    }

    public void setTenureMonths(int tenureMonths) {
        this.tenureMonths = tenureMonths;
    }

    // toString() override
    @Override
    public String toString() {
        return "FixedDepositAccount{" +
                "accountNo='" + getAccountNo() + '\'' +
                ", balance=" + getBalance() +
                ", status='" + getStatus() + '\'' +
                ", interestRate=" + interestRate +
                ", maturityDate=" + maturityDate +
                ", tenureMonths=" + tenureMonths +
                '}';
    }
}
