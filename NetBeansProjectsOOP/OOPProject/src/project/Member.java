package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Member extends Customer{
    Scanner input = new Scanner(System.in);
    private String memberID;
    private static int numOfMember=0;
    Member[] memberArray = new Member[10];

    public Member() {
        super();
        setMemberID();
    }

    public Member(String name, String phoneNumber, String email) {
        super(name, phoneNumber, email);
        numOfMember++;
        setMemberID();
        setMember(name, phoneNumber, email);
    }

    public String getMemberID() {
        return memberID;
    }

    private void setMemberID() {
        memberID = String.format("%04d", numOfMember);
    }

    private void setMember(String name, String phoneNumber, String email){
        name = super.getCustomerName();
        phoneNumber = super.getPhoneNumber();
        email = super.getEmail();
        String filename = getMemberID();
        try {
            String setName = name;
            String setNumber = phoneNumber;
            String setEmail = email;
            File file = new File(filename + ".txt");
            PrintWriter output = new PrintWriter(file);
            output.println(setName);
            output.println(setNumber);
            output.println(setEmail);
            output.close();
        } catch (FileNotFoundException e) {
            System.out.println("File no found");
        }
    }
    
    public void findMember(String memberID){
        String setName = "";
        String setNumber = "";
        String setEmail = "";
        try {
            String name = memberID;
            File file = new File(name + ".txt");
            Scanner data = new Scanner(file);
            while (data.hasNext()) {
                setName = data.nextLine();
                setNumber = data.nextLine();
                setEmail = data.nextLine();
            }
            System.out.println("\n---------------- Information ----------------\n");
            System.out.println("Name: " + setName);
            System.out.println("Phone number: " + setNumber);
            System.out.println("Email: " + setEmail);
        } catch (FileNotFoundException e) {
            System.out.println("File no found");
        }
    }
}
