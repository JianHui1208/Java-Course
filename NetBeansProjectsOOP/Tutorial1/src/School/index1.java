package School;
import java.util.Scanner;
public class index1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        String id = "";
        String PhoneNum = "";
        String[] Code = new String[5];
        String[] SubName = new String[5];
        int[] hours = new int[5];
        int score;
        int score1;
        int num1 = 0;
        subject sub = new subject();
        do{
            System.out.println("Enter the Name: ");
            name = input.next();
            System.out.println("Enter the Student id: ");
            id = input.next();
            System.out.println("Enter the Phone Number: ");
            PhoneNum = input.next();

            for (int i = 0; i < Code.length; i++) {
                System.out.print("\nEnter the Subject code: ");
                Code[i] = input.next();
                System.out.print("\nEnter the Subject name: ");
                SubName[i] = input.next();
                System.out.print("\nEnter the Credit hours: ");
                hours[i] = input.nextInt();
                System.out.print("\n");
                System.out.print("If you want to finish, please enter 1. If you want to continue, enter 2.");
                score1 = input.nextInt();
                if (score1 == 1) {
                    break;
                }
                sub = new subject(Code[i], SubName[i], hours[i]);
            }

            num1++;
            information Infor = new information(name, id, PhoneNum);
            System.out.print("Students " + num1 + " : \n");
            System.out.print(Infor.Result());
            System.out.print(sub.Result());
            System.out.println("If you want to finish, please enter 0. If you want to continue, enter 1.");
            score = input.nextInt();
        } while (score != 0);
        System.out.println(num1);
        input.close();
    }
}
