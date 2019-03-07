package com.capstone.giba;

public class Host
{
    private String email;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNum;

    // Default constructor
    public Host() {
    }

    // Overloaded constructor
    public Host(String email, String firstName, String lastName,
                String address, String phoneNum) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    // getter for @email
    public String getEmail() {
        return email;
    }

    // setter for @email
    public void setEmail(String email) {
        this.email = email;
    }

    // getter for firstName
    public String getFirstName() {
        return firstName;
    }

    // setter for @firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // getter for @lastName
    public String getLastName() {
        return lastName;
    }

    // setter for @lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // getter for @address
    public String getAddress() {
        return address;
    }

    // setter for @address
    public void setAddress(String address) {
        this.address = address;
    }

    // getter for @phoneNum
    public String getPhoneNum() {
        return phoneNum;
    }

    // setter for @phoneNum
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
