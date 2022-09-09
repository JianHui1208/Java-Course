package projectPresent;

import java.util.Scanner;

public class Member extends Customer {

    Scanner input = new Scanner(System.in);

    private String memberID;
    private static int numOfMember = 0;
    private final double DISCOUNT_RATE = 0.8;

    public Member() {

        super();
        numOfMember++;
        setMemberID();

    }

    public Member(String name, String phoneNumber, String email, String address) {

        super(name, phoneNumber, email, address);
        numOfMember++;
        setMemberID();

    }

    public String getMemberID() {

        return memberID;

    }

    private void setMemberID() {

        memberID = String.format("%04d", numOfMember);

    }

    public double getDiscountRate() {

        return DISCOUNT_RATE;

    }

    @Override
    public String toString() {

        return super.toString();

    }

}
