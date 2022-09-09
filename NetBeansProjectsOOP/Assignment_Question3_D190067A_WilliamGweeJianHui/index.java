package pizza;
import java.util.Scanner;
public class index {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    for(int i=0; i<10; i++){
        customer p1 = new pizza();
        System.out.print("Enter Your name: ");
        String Name = input.next();
        p1.setName(Name);
        System.out.print("Enter Your Phone Number: ");
        String Phone = input.next();
        p1.setPhoNumber(Phone);
        System.out.print("Enter Your Pizza Quantity: ");
        int quantity = input.nextInt();
        p1.SetQuantity(quantity);
        p1.toString();
    }
        
    }
}
