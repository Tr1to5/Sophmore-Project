/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.oakland.budgetapp.login_information;

/**
 *
 * @author Mousumi Das
 */
public class UserInformation {

    private String firstName;
    private String lastName;
    private String password;
    private String address;
    private String phoneNumber;
    private String emailAddress;
    private String gender;
   
    /**
     * @return the First Name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the First Name to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the Last Name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the Last Name to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phone Number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phone Number to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the email Address
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the email Address to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
}
