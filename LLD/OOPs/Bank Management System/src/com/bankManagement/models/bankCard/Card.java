
package com.bankmanagement.models.bankcard;

import java.time.LocalDate;

public class Card {
    private String cardNumber;
    private String cardHolderName;
    private LocalDate expiryDate;
    private String cvv;
    private int pin;
    private String status; // Active / Blocked / Expired
    private String linkedAccountNo;

    // Default constructor
    public Card() {}

    // Parameterized constructor
    public Card(String cardNumber, String cardHolderName, LocalDate expiryDate, String cvv, int pin, String status, String linkedAccountNo) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.pin = pin;
        this.status = status;
        this.linkedAccountNo = linkedAccountNo;
    }

    // Getters
    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    public int getPin() {
        return pin;
    }

    public String getStatus() {
        return status;
    }

    public String getLinkedAccountNo() {
        return linkedAccountNo;
    }

    // Setters
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setLinkedAccountNo(String linkedAccountNo) {
        this.linkedAccountNo = linkedAccountNo;
    }

    // Card operations
    public boolean validatePin(int inputPin) {
        return this.pin == inputPin;
    }

    public void changePin(int oldPin, int newPin) {
        if (validatePin(oldPin)) {
            this.pin = newPin;
            System.out.println("PIN successfully changed.");
        } else {
            System.out.println("Invalid old PIN.");
        }
    }

    public void blockCard() {
        this.status = "Blocked";
    }

    public void unblockCard() {
        this.status = "Active";
    }

    // toString() override
    @Override
    public String toString() {
        return "Card{" +
                "cardNumber='" + cardNumber + '\'' +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", expiryDate=" + expiryDate +
                ", status='" + status + '\'' +
                ", linkedAccountNo='" + linkedAccountNo + '\'' +
                '}';
    }
}
