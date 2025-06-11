package com.bankmanagement.models.loan;

import java.time.LocalDate;

public abstract class Loan {
    protected String loanId;
    protected String borrowerName;
    protected double loanAmount;
    protected double interestRate;
    protected int tenureInMonths;
    protected LocalDate startDate;
    protected double outstandingAmount;
    protected String status; // Active / Closed

    // Constructor
    public Loan(String loanId, String borrowerName, double loanAmount, double interestRate,
                int tenureInMonths, LocalDate startDate) {
        this.loanId = loanId;
        this.borrowerName = borrowerName;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.tenureInMonths = tenureInMonths;
        this.startDate = startDate;
        this.outstandingAmount = loanAmount;
        this.status = "Active";
    }

    // Abstract methods — must be implemented by child classes
    public abstract void calculateEMI();

    public abstract void makeRepayment(double amount);

    public void closeLoan() {
        this.status = "Closed";
        this.outstandingAmount = 0;
        System.out.println("Loan " + loanId + " closed successfully.");
    }

    // Common Getters
    public String getLoanId() {
        return loanId;
    }

    public double getOutstandingAmount() {
        return outstandingAmount;
    }

    public String getStatus() {
        return status;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getTenureInMonths() {
        return tenureInMonths;
    }

    public LocalDate getStartDate() {
        return startDate;
    }
}
