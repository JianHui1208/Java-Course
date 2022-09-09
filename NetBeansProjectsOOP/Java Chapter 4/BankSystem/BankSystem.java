package BankSystem;
import java.util.Scanner;
public class BankSystem {
    public static void main(String[] args) {
        double money1 = 100;
        double money2 = 100;
        double deposit = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Account 1 has RM" + money1 + ".");
        System.out.println("Account 2 has RM" + money2 + ".");
        System.out.print("Enter the deposit: RM");
        deposit = input.nextDouble();
        bankaccount tran = new bankaccount(deposit, money1, money2);
        System.out.println(tran.printResult());
        input.close();
    }
}
