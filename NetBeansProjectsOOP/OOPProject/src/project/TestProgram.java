package project;

import java.util.Scanner;

public class TestProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Customer[] customerArray = new Customer[10];
        Member[] memberArray = new Member[10];
        Member M1 = new Member();
        int menuNum = 0;
        int option;
        double payment;
        int count = 0;
        menu menu = new menu();
        do {
            for (int i = 0; i < customerArray.length; i++) {
                System.out.println("\n---------------- MENU ----------------\n");
                System.out.println("1. Order");
                System.out.println("2. Member");
                System.out.println("3. Check Your Receipt\n");
                System.out.print("Your option, 0 to exit: ");
                menuNum = input.nextInt();
                switch (menuNum) {
                    // Order
                    case 1:
                        System.out.println("\n---------------- ORDER ----------------\n");
                        System.out.print("Enter your name: ");
                        String customerName = input.next();
                        System.out.print("Enter you phone number: ");
                        String phoneNumber = input.next();
                        System.out.print("Enter you email: ");
                        String email = input.next();
                        customerArray[i] = new Customer(customerName, phoneNumber, email);
                        do {
                            count++;
                            System.out.println(
                                    "------------------------------------------------------------------------------");
                            System.out.println(
                                    "                                   Menu                                       ");
                            System.out.println(
                                    "------------------------------------------------------------------------------");
                            System.out.print(
                                    "Enter 1 to Package Meals,2 to HappyMeals,3 to Dessert,4 to drinks or 5 to exit: ");
                            option = input.nextInt();
                            switch (option) {
                                case 1:
                                    menu.packageMeals(count);
                                    break;
                                case 2:
                                    menu.happyMeals(count);
                                    break;
                                case 3:
                                    menu.desserts(count);
                                    break;
                                case 4:
                                    menu.drinks(count);
                                    break;
                            }
                        } while (option != 5);
                        System.out.println();
                        customerArray[i].displayCustomerDetails();
                        menu.Control(customerName, phoneNumber, email, count);
                        System.out.print("Enter Your Paymnet Money: RM");
                        payment = input.nextDouble();
                        menu.Payment(payment, count);
                        count--;
                        break; // break Menu case 1
                    // Member
                    case 2:
                        int memberOption = 0;
                        do {
                            for (int j = 0; j < memberArray.length; j++) {
                                System.out.println("\n---------------- MEMBER ----------------\n");
                                System.out.println("1. Register Member");
                                System.out.println("2. Check Qualification\n");
                                System.out.print("Your option, 0 to menu: ");
                                memberOption = input.nextInt();
                                switch (memberOption) {
                                    // Register Member
                                    case 1:
                                        System.out.print("Enter your name");
                                        customerName = input.next();
                                        System.out.print("Enter you phone number: ");
                                        phoneNumber = input.next();
                                        System.out.print("Enter you email: ");
                                        email = input.next();
                                        memberArray[j] = new Member(customerName, phoneNumber, email);
                                        System.out.println("Your member ID: " + memberArray[j].getMemberID());
                                        System.out.println("Register Successfully!\n");
                                        break; // break Member case 1
                                    // Check Qualification
                                    case 2:
                                        System.out.print("Enter Your memberID to Check Qualification: ");
                                        String memberID = input.next();
                                        M1.findMember(memberID);
                                        break; // break Member case 2
                                    case 3:
                                        System.out.println("Invalid option!");
                                }
                                break; // break for loop
                            }
                        } while (memberOption != 0); // End member
                        break; // break Menu case 2
                    case 3:
                        System.out.print("Enter Your Name: ");
                        String Name = input.next();
                        menu.printReceipt(Name);
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid option.");
                        break;
                }
            }
        } while (menuNum != 0); // End menu
    }

}
