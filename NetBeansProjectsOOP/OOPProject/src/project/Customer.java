package project;

import java.util.Scanner;

public class Customer extends menu{
    Scanner input = new Scanner(System.in);
    private String customerName, phoneNumber, email, address;
    public Customer() {

    }

    public Customer(String customerName, String phoneNumber, String email) {

        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }

    public String getCustomerName() {

        return customerName;

    }

    public void setCustomerName(String customerName) {

        this.customerName = customerName;

    }

    public String getPhoneNumber() {

        return phoneNumber;

    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;

    }

    public String getEmail() {

        return email;

    }

    public void setEmail(String email) {

        this.email = email;

    }

    public String getAddress() {

        return address;

    }

    public void setAddress(String address) {

        this.address = address;

    }

    public void displayCustomerDetails() {
        System.out.println("Are You a Member? Enter You member ID");
        System.out.print("If no Enter no: ");
        String ID = input.next();
        super.setID(ID);
        super.isMember();
        System.out.println("Name: " + this.customerName);
        System.out.println("Phone number: " + this.phoneNumber);
        System.out.println("Email: " + this.email);

    }
}
