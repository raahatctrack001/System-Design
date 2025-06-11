package com.bankmanagement.models.bankcard;

import java.time.LocalDate;

public class CreditCard extends Card {
    private double creditLimit;
    private double availableCredit;
    private double dueAmount;
    private LocalDate billGenerationDate;

    // Default constructor
    public CreditCard() {
        super();
    }

    // Parameterized constructor
    public CreditCard(String cardNumber, String cardHolderName, LocalDate expiryDate, String cvv, int pin,
                      String status, String linkedAccountNo, double creditLimit, double availableCredit,
                      double dueAmount, LocalDate billGenerationDate) {
        super(cardNumber, cardHolderName, expiryDate, cvv, pin, status, linkedAccountNo);
        this.creditLimit = creditLimit;
        this.availableCredit = availableCredit;
        this.dueAmount = dueAmount;
        this.billGenerationDate = billGenerationDate;
    }

    // Getters
    public double getCreditLimit() {
        return creditLimit;
    }

    public double getAvailableCredit() {
        return availableCredit;
    }

    public double getDueAmount() {
        return dueAmount;
    }

    public LocalDate getBillGenerationDate() {
        return billGenerationDate;
    }

    // Setters
    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setAvailableCredit(double availableCredit) {
        this.availableCredit = availableCredit;
    }

    public void setDueAmount(double dueAmount) {
        this.dueAmount = dueAmount;
    }

    public void setBillGenerationDate(LocalDate billGenerationDate) {
        this.billGenerationDate = billGenerationDate;
    }

    // Operations

    public void makePurchase(double amount) {
        if (getStatus().equals("Active")) {
            if (amount <= availableCredit) {
                availableCredit -= amount;
                dueAmount += amount;
                System.out.println("Purchase of ₹" + amount + " successful. Remaining credit: ₹" + availableCredit);
            } else {
                System.out.println("Insufficient available credit.");
            }
        } else {
            System.out.println("Card is not active. Cannot make a purchase.");
        }
    }

    public void payDue(double amount) {
        if (amount <= dueAmount) {
            dueAmount -= amount;
            availableCredit += amount;
            System.out.println("Payment of ₹" + amount + " successful. Remaining due: ₹" + dueAmount);
        } else {
            System.out.println("Amount exceeds due amount.");
        }
    }

    public void generateBill() {
        System.out.println("Bill generated. Total Due: ₹" + dueAmount);
        // Optionally, set new billGenerationDate here for next month.
    }

    // toString() override
    @Override
    public String toString() {
        return super.toString() +
                "\nCreditCard{" +
                "creditLimit=" + creditLimit +
                ", availableCredit=" + availableCredit +
                ", dueAmount=" + dueAmount +
                ", billGenerationDate=" + billGenerationDate +
                '}';
    }
}
