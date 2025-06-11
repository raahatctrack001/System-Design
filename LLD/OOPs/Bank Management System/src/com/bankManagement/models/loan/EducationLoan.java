package com.bankmanagement.models.loan;

import java.time.LocalDate;

public class EducationLoan extends Loan {
    private String courseName;

    public EducationLoan(String loanId, String borrowerName, double loanAmount, double interestRate,
                         int tenureInMonths, LocalDate startDate, String courseName) {
        super(loanId, borrowerName, loanAmount, interestRate, tenureInMonths, startDate);
        this.courseName = courseName;
    }

    @Override
    public void calculateEMI() {
        double emi = (loanAmount * interestRate / 100) / tenureInMonths;
        System.out.println("Education Loan EMI: ₹" + emi);
    }

    @Override
    public void makeRepayment(double amount) {
        if (status.equals("Active")) {
            outstandingAmount -= amount;
            System.out.println("Education loan repayment of ₹" + amount + " done.");
            if (outstandingAmount <= 0) {
                closeLoan();
            }
        } else {
            System.out.println("Loan is already closed.");
        }
    }

    public String getCourseName() {
        return courseName;
    }
}
