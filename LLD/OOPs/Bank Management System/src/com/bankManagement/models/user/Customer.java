package com.bankmanagement.models.user;

public class Customer extends User {
    private String accountType;

    public Customer(String userId, String name, String phone, String email, String address, String gender, String dateOfBirth, String accountType) {
        super(userId, name, phone, email, address, gender, dateOfBirth);
        this.accountType = accountType;
    }

    public String getAccountType() { return accountType; }
    public void setAccountType(String accountType) { this.accountType = accountType; }

    public void displayCustomerInfo() {
        super.displayUserInfo();
        System.out.println("Account Type: " + accountType);
    }
}
