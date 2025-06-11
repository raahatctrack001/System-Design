package com.bankmanagement.models.bankcard;

import java.time.LocalDate;

public class DebitCard extends Card {
    private double dailyWithdrawalLimit;
    private double availableBalance;

    // Default constructor
    public DebitCard() {
        super();
    }

    // Parameterized constructor
    public DebitCard(String cardNumber, String cardHolderName, LocalDate expiryDate, String cvv, int pin,
                     String status, String linkedAccountNo, double dailyWithdrawalLimit, double availableBalance) {
        super(cardNumber, cardHolderName, expiryDate, cvv, pin, status, linkedAccountNo);
        this.dailyWithdrawalLimit = dailyWithdrawalLimit;
        this.availableBalance = availableBalance;
    }

    // Getters
    public double getDailyWithdrawalLimit() {
        return dailyWithdrawalLimit;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    // Setters
    public void setDailyWithdrawalLimit(double dailyWithdrawalLimit) {
        this.dailyWithdrawalLimit = dailyWithdrawalLimit;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    // Operations

    public void withdraw(double amount) {
        if (getStatus().equals("Active")) {
            if (amount > dailyWithdrawalLimit) {
                System.out.println("Amount exceeds daily withdrawal limit.");
            } else if (amount > availableBalance) {
                System.out.println("Insufficient account balance.");
            } else {
                availableBalance -= amount;
                System.out.println("Withdrawal of ₹" + amount + " successful. Remaining balance: ₹" + availableBalance);
            }
        } else {
            System.out.println("Card is not active. Cannot withdraw.");
        }
    }

    public void checkBalance() {
        System.out.println("Available Balance: ₹" + availableBalance);
    }

    // toString() override
    @Override
    public String toString() {
        return super.toString() +
                "\nDebitCard{" +
                "dailyWithdrawalLimit=" + dailyWithdrawalLimit +
                ", availableBalance=" + availableBalance +
                '}';
    }
}
