package com.capstone.giba;

public class Volunteer
{
    public String email;
    public String firstName;
    public String lastName;
    public String address;
    public String phoneNum;

    // Default constructor
    public Volunteer() {
    }

    // Overloaded constructor
    public Volunteer(String email, String firstName, String lastName,
                     String address, String phoneNum) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    // Getter for @email
    public String getEmail() {
        return email;
    }

    // Setter for @email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for @firstName
    public String getFirstName() {
        return firstName;
    }

    // Setter for @firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter for @lastName
    public String getlastName() {
        return lastName;
    }

    // Setter for @lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter for @address
    public String getAddress() {
        return address;
    }

    // Setter for @address
    public void setAddress(String address) {
        this.address = address;
    }

    // Getter for @phoneNum
    public String getPhoneNum() {
        return phoneNum;
    }

    // Setter for @phoneNum
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
