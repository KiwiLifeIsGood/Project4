package com.example.demofirebase.Entity;

public class Users {
    private String UserName;
    private String Email;
    private int PhoneNo;
    private String Password;
    private Boolean AdminStatus;


    public Users() {
    }

    public Users(String userName, String email, int phoneNo, String password, Boolean adminStatus) {
        UserName = userName;
        Email = email;
        PhoneNo = phoneNo;
        Password = password;
        AdminStatus = adminStatus;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Integer getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(Integer phoneNo) {
        PhoneNo = phoneNo;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Boolean getAdminStatus() {
        return AdminStatus;
    }

    public void setAdminStatus(Boolean adminStatus) {
        AdminStatus = adminStatus;
    }
}
