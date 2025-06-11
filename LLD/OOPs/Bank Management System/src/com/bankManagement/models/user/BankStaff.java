package com.bankmanagement.models.user;

class BankStaff extends User {
    private String designation;

    public BankStaff(String userId, String name, String phone, String email, String address, String gender, String dateOfBirth, String designation) {
        super(userId, name, phone, email, address, gender, dateOfBirth);
        this.designation = designation;
    }

    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }

    public void displayStaffInfo() {
        super.displayUserInfo();
        System.out.println("Designation: " + designation);
    }
}
