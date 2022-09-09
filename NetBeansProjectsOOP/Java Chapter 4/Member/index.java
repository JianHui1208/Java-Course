package Member;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        int score = 0;
        String name = "";
        String keyword = "";
        Scanner input = new Scanner(System.in);
        file f1 = new file();
        do {
            System.out.print("Enter Name: ");
            name = input.next();
            System.out.print("Do you want to become a member? (YES/NO): ");
            keyword = input.next();
            f1 = new file(name, keyword);
            f1.save();
            System.out.println("If you want to finish, please enter 0. If you want to continue, enter 1.");
            score = input.nextInt();
        } while (score != 0);
        System.out.print("Enter Your Name, Check Your File: ");
        name = input.next();
        f1.setName(name);
        System.out.println(f1.show());
    }
}