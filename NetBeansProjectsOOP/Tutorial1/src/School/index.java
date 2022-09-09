package School;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        String id = "";
        String PhoneNum = "";
        String Code = "";
        String SubName = "";
        int hours = 0;
        int score;
        int num1 = 0;
        do{
            System.out.println("Enter the Name: ");
            name = input.next();
            System.out.println("Enter the Student id: ");
            id = input.next();
            System.out.println("Enter the Phone Number: ");
            PhoneNum = input.next();
            System.out.println("Enter the Subject code: ");
            Code = input.next();
            System.out.println("Enter the Subject name: ");
            SubName = input.next();
            System.out.println("Enter the Credit hours: ");
            hours = input.nextInt();
            num1++;
            information Infor = new information(name, id, PhoneNum);
            System.out.print("Students " + num1 + " : \n");
            System.out.print(Infor.Result());
            System.out.println("If you want to finish, please enter 0. If you want to continue, enter 1.");
            score = input.nextInt();
        } while (score != 0);
        System.out.println(num1);
        input.close();
    }
}
