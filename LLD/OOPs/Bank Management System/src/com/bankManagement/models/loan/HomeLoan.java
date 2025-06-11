package com.bankmanagement.models.loan;

import java.time.LocalDate;

public class HomeLoan extends Loan {
    private String propertyAddress;

    public HomeLoan(String loanId, String borrowerName, double loanAmount, double interestRate,
                    int tenureInMonths, LocalDate startDate, String propertyAddress) {
        super(loanId, borrowerName, loanAmount, interestRate, tenureInMonths, startDate);
        this.propertyAddress = propertyAddress;
    }

    @Override
    public void calculateEMI() {
        double emi = (loanAmount * interestRate / 100) / tenureInMonths;
        System.out.println("Home Loan EMI: ₹" + emi);
    }

    @Override
    public void makeRepayment(double amount) {
        if (status.equals("Active")) {
            outstandingAmount -= amount;
            System.out.println("Home loan repayment of ₹" + amount + " done.");
            if (outstandingAmount <= 0) {
                closeLoan();
            }
        } else {
            System.out.println("Loan is already closed.");
        }
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }
}
