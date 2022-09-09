package TutorialOneTest;

import java.util.Scanner;

public class index1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        subject[] S1 = new subject[6];
        int number = 0;
        int hours;
        String Name, ID, PhoNumber, SubCode, SubName;
        do {
            for (int x = 0; x < S1.length; x++) {
                System.out.print("Enter the Subject code: ");
                SubCode = input.next();
                System.out.print("Enter the Subject name: ");
                SubName = input.next();
                System.out.print("Enter the Credit hours: ");
                hours = input.nextInt();
                // S1[x] = new subject(SubCode, SubName, hours, x);
                System.out.println("Enter 1 if You want stop typing the Subject.");
                System.out.println("Enter 0 Continue to enter Subject.");
                number = input.nextInt();
                if (number == 1) {
                    break;
                }
            }
            System.out.println();
            System.out.println("Stop enter 3");
            number = input.nextInt();
        } while (number != 3);

        for (int i = 0; i < S1.length; i++) {
            if (S1[i] == null) {
                break;
            } else {
                S1[i].DisplaySubject();
            }
        }
    }
}
