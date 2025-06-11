package com.bankmanagement.models.user;

class Admin extends User {
    private String adminLevel;

    public Admin(String userId, String name, String phone, String email, String address, String gender, String dateOfBirth, String adminLevel) {
        super(userId, name, phone, email, address, gender, dateOfBirth);
        this.adminLevel = adminLevel;
    }

    public String getAdminLevel() { return adminLevel; }
    public void setAdminLevel(String adminLevel) { this.adminLevel = adminLevel; }

    public void displayAdminInfo() {
        super.displayUserInfo();
        System.out.println("Admin Level: " + adminLevel);
    }
}
