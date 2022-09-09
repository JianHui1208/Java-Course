package projectPresent;

import java.util.ArrayList;

import java.util.Scanner;

public class TestProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        int option = 0;
        int menuChoice = 0;
        int foodChoice = 0;
        int memberChoice = 0;
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        ArrayList<Food> foodList;
        Order order = null;
        ArrayList<Order> orderList = new ArrayList<Order>();

        do {
            System.out.println("-----------------------------------------------------------");
            System.out.println("                Welcome My Restaurant");
            System.out.println("-----------------------------------------------------------");
            System.out.print("Press 1 to Order, Press 2 to Do Member, Press 3 to Check Receipt, Press 0 to Exit: ");
            option = input.nextInt();

            switch (option) {

                // ORDER
                case 1:
                    System.out.println("\n---------------- ORDER ----------------");
                    
                    // Enter customer details
                    System.out.print("Enter your name: ");
                    String name = input.next();

                    System.out.print("Enter your phone number: ");
                    String phoneNumber = input.next();

                    System.out.print("Enter your email: ");
                    String email = input.next();

                    System.out.print("Enter your address: ");
                    String address = input.next();

                    Customer customer = new Customer(name, phoneNumber, email, address);
                    customerList.add(customer);

                    // Pizza Menu
                    foodList = new ArrayList<Food>();
                    order = new Order();
                    do {
                        System.out.println("\nChoose Your Package\n1. Package Meals\n2. Happy Meals\n3. Desserts\n4. Drinks\n5. Exit");
                        System.out.print("Your choice: ");
                        menuChoice = input.nextInt();
                        System.out.println();

                        switch (menuChoice) {
                            case 1: // Package Meals
                                Food.packageMeals();
                                System.out.print("\nEnter food number: ");
                                foodChoice = input.nextInt();
                                order.placeOrder(menuChoice, foodChoice, foodList);
                                break;
                            case 2: // Happy Meals
                                Food.happyMeals();
                                System.out.print("\nEnter food number: ");
                                foodChoice = input.nextInt();
                                order.placeOrder(menuChoice, foodChoice, foodList);
                                break;
                            case 3: // Desserts
                                Food.desserts();
                                System.out.print("\nEnter dessert number: ");
                                foodChoice = input.nextInt();
                                order.placeOrder(menuChoice, foodChoice, foodList);
                                break;
                            case 4: // Drinks
                                Food.drinks();
                                System.out.print("\nEnter drink number: .");
                                foodChoice = input.nextInt();
                                order.placeOrder(menuChoice, foodChoice, foodList);
                                break;
                        }
                    } while (menuChoice != 5);

                    // Check whether customer is member or not
                    System.out.println("Are you a member? ");
                    System.out.print("Enter your member ID (If not, enter 'n'): ");
                    String memberID = input.next();

                    for (int i = 0; i < customerList.size(); i++) {
                        Customer customers = customerList.get(i);
                        customers.searchMember(memberID);
                        if (customers instanceof Member) {
                            if (((Member) customers).getMemberID().equals(memberID)) {
                                order.setCustomer(customers);
                                order.setFoodList(foodList);
                                break;
                            }
                        } else if (customers instanceof Customer || memberID.charAt(0) == 'n') {
                            order.setCustomer(customers);
                            order.setFoodList(foodList);
                        }
                    }
                    order.receipt();
                    System.out.println();
                    // Payment
                    System.out.print("Enter payment money: RM ");
                    double payment = input.nextDouble();
                    order.payment(payment);
                    orderList.add(order);
                    break;

                // MEMBER
                case 2:

                    do {
                        System.out.println("\n---------------- MEMBER ----------------");
                        System.out.println("1. Register Member");
                        System.out.println("2. Check Member Details\n");
                        System.out.print("Your option, press 0 to Home: ");

                        memberChoice = input.nextInt();

                        switch (memberChoice) {
                            // Register member
                            case 1:
                                System.out.print("Enter your name: ");
                                name = input.next();
                                System.out.print("Enter you phone number: ");
                                phoneNumber = input.next();
                                System.out.print("Enter you email: ");
                                email = input.next();
                                System.out.print("Enter you address: ");
                                address = input.next();
                                Member member = new Member(name, phoneNumber, email, address);
                                customerList.add(member);
                                System.out.println("\nYour member ID: " + (member).getMemberID());
                                System.out.println("Register Successfully!\n");
                                break;
                                
                            // Check qualification
                            case 2:
                                System.out.print("Enter your member ID to check qualification: ");
                                memberID = input.next();
                                for (Customer customers : customerList) {
                                    if (customers instanceof Member) {
                                        ((Member) customers).searchMember(memberID);
                                    }
                                }
                                break;
                        }
                    } while (memberChoice != 0);
                    break;

                case 3:
                    System.out.println("\n---------------- RECEIPT ----------------");
                    System.out.print("Enter Your Order ID: ");
                    String orderID = input.next();
                    for (int i = 0; i < orderList.size(); i++) {
                        orderList.get(i).checkReceipt(orderID);
                    }
                    break;

                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option!");
                    break;
            }
        } while (option != 0);
    }
}
