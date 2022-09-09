package TutorialOneTest;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        school[] B1 = new school[99];
        subject[] S1 = new subject[12];
        int number = 0;
        int hours;
        int j = 0;
        String Name, ID, PhoNumber, SubCode, SubName;

        for (int i = 0; i < B1.length; i++) {
            System.out.print("Enter the Name: ");
            Name = input.next();
            System.out.print("Enter the Student id: ");
            ID = input.next();
            System.out.print("Enter the Phone Number: ");
            PhoNumber = input.next();
            B1[i] = new school(Name, ID, PhoNumber, i);
            for (j = 0; j < S1.length; j++) {
                S1[j] = new subject("ABCD1234", "HTML", 9, j);
                j++;
                S1[j] = new subject("ZXYW", "PHP", 2, j);
                j++;
                S1[j] = new subject("ABCD", "asdf", 2, j);
                j++;
                S1[j] = new subject("ABCD1234", "HTML", 9, j);
                j++;
                S1[j] = new subject("ZXYW", "PHP", 2, j);
                j++;
                S1[j] = new subject("ABCD", "asdf", 2, j);
            }
            System.out.println("Enter 1 if You want stop typing the Sudents.");
            System.out.println("Enter 0 Continue to enter Sudents.");
            number = input.nextInt();
            if (number == 1) {
                break;
            }
        }
        for (int i = 0; i < B1.length; i++) {
            if (B1[i] == null) {
                break;
            } else {
                B1[i].DisplaySchool();
                for (int y = 0; y < j / 2; y++) {
                    if (S1[y] == null) {
                        break;
                    } else {
                        S1[y].DisplaySubject();
                    }
                }
            }
        }
    }
}
