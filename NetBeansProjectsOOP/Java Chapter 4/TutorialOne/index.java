package TutorialOne;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        school[] B1 = new school[99];
        subject[] S1 = new subject[6];
        int number = 0;
        int hours;
        String Name, ID, PhoNumber, SubCode, SubName;

        for (int i = 0; i < B1.length; i++) {
            System.out.print("Enter the Name: ");
            Name = input.next();
            System.out.print("Enter the Student id: ");
            ID = input.next();
            System.out.print("Enter the Phone Number: ");
            PhoNumber = input.next();
            B1[i] = new school(Name, ID, PhoNumber, i);
            for (int x = 0; x < S1.length; x++) {
                System.out.print("Enter the Subject code: ");
                SubCode = input.next();
                System.out.print("Enter the Subject name: ");
                SubName = input.next();
                System.out.print("Enter the Credit hours: ");
                hours = input.nextInt();
                S1[x] = new subject(SubCode, SubName, hours, x);
                System.out.println("Enter 1 if You want stop typing the Subject.");
                System.out.println("Enter 0 Continue to enter Subject.");
                number = input.nextInt();
                if (number == 1) {
                    break;
                }
            }
            System.out.println("Enter 1 if You want stop typing the Sudents.");
            System.out.println("Enter 0 Continue to enter Sudents.");
            number = input.nextInt();
            if (number == 1) {
                break;
            }
        }
        System.out.println();
        for (int i = 0; i < B1.length; i++) {
            if (B1[i] == null) {
                break;
            } else {
                B1[i].DisplaySchool();
                for (int x = 0; x < S1.length; x++) {
                    if (S1[x] == null) {
                        break;
                    } else {
                        S1[x].DisplaySubject();
                    }
                }
            }
        }
    }
}
