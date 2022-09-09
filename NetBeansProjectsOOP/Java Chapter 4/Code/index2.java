package Code;

import java.util.Scanner;

public class index2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] strName = { "Ali", "Abu", "AhMiao" };
        String[] strPhoneNum = { "1234", "5678", "9012" };
        String[] strEmail = { "qwer", "asdf", "zxcv" };
        int data = 0;

        System.out.print("Enter your name: ");
        String name = input.next();
        for (int a = 0; a < strName.length; a++) {
            if (strName[a].equals(name)) {
                data = a;
            }
        }

        System.out.println("Name: " + name);
        if (strPhoneNum[data] == null) {
            System.out.println("Phone Number: ");
        } else {
            System.out.println("Phone Number: " + strPhoneNum[data]);
        }

        if (strEmail[data] == null) {
            System.out.println("Email: ");
        } else {
            System.out.println("Email: " + strEmail[data]);
        }
    }
}
