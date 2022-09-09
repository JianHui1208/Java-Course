package RentSystem;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Customer C1 = new Member();
        for(int i=0;i<10;i++){
            System.out.print("Enter Your name: ");
            String Name = input.next();
            C1.setName(Name);
            C1.setId();
            System.out.print("Enter Your rent Day: ");
            int rentDay = input.nextInt();
            System.out.print("Enter Your Address: ");
            String Address = input.next();
            RentDetail R1 = new RentDetail(rentDay, C1, Address, 100);
            System.out.println(R1.toString());
            System.out.println(C1.addRentalDetail(R1));
        }
    }
}
