package com.bankmanagement.models.loan;

import java.time.LocalDate;

public class CarLoan extends Loan {
    private String carModel;

    public CarLoan(String loanId, String borrowerName, double loanAmount, double interestRate,
                   int tenureInMonths, LocalDate startDate, String carModel) {
        super(loanId, borrowerName, loanAmount, interestRate, tenureInMonths, startDate);
        this.carModel = carModel;
    }

    @Override
    public void calculateEMI() {
        double emi = (loanAmount * interestRate / 100) / tenureInMonths;
        System.out.println("Car Loan EMI: ₹" + emi);
    }

    @Override
    public void makeRepayment(double amount) {
        if (status.equals("Active")) {
            outstandingAmount -= amount;
            System.out.println("Car loan repayment of ₹" + amount + " done.");
            if (outstandingAmount <= 0) {
                closeLoan();
            }
        } else {
            System.out.println("Loan is already closed.");
        }
    }

    public String getCarModel() {
        return carModel;
    }
}
