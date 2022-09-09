package projectPresent;

import java.util.ArrayList;

import java.util.Scanner;

public class Order {

    private Customer customer;
    private static int numOfOrder;
    private String orderID;
    private ArrayList<Food> foodList = new ArrayList<Food>();

    public Order() {

        numOfOrder++;
        setOrderID();

    }

    public Order(Customer customer, ArrayList<Food> foodList) {

        this.customer = customer;
        this.foodList = foodList;
        numOfOrder++;
        setOrderID();

    }

    public Customer getCustomer() {

        return this.customer;

    }

    public void setCustomer(Customer customer) {

        this.customer = customer;

    }

    public String getOrderID() {

        return this.orderID;

    }

    private void setOrderID() {

        orderID = String.format("%04d", numOfOrder);

    }

    public ArrayList<Food> getFoodList() {

        return foodList;

    }

    public void setFoodList(ArrayList<Food> foodList) {

        this.foodList = foodList;

    }

    public double calculateTotalPrice() {

        double totalPrice = 0;

        for (Food food : foodList) {

            if (customer instanceof Member) {

                totalPrice += food.calculateSubtotal();
                totalPrice *= ((Member) customer).getDiscountRate();

            } else if (customer instanceof Customer) {

                totalPrice += food.calculateSubtotal();

            }
        }

        return totalPrice;

    }

    public ArrayList<Food> placeOrder(int menuChoice, int foodChoice, ArrayList<Food> foodList) {

        Scanner input = new Scanner(System.in);
        Food food = new Food();

        switch (menuChoice) {

            case 1:
                if (foodChoice != 5) {
                    switch (foodChoice) {

                        case 1:
                            food = new Food("Double McChicken", 15);
                            foodList.add(food);
                            break;

                        case 2:
                            food = new Food("Spicy Chicken McDeluxe", 12);
                            foodList.add(food);
                            break;

                        case 3:
                            food = new Food("Ayam Goreng Spicy", 25);
                            foodList.add(food);
                            break;

                        case 4:
                            food = new Food("Spicy Chicken McDeluxe", 30);
                            foodList.add(food);
                            break;

                    }
                    System.out.print("Enter quantity: ");
                    int quantity = input.nextInt();

                    food.setQuantity(quantity);
                }
                break;

            case 2:
                if (foodChoice != 5) {
                    switch (foodChoice) {

                        case 1:
                            food = new Food("4pcs Chicken McNuggets", 9);
                            foodList.add(food);
                            break;

                        case 2:
                            food = new Food("Fried Chicken McD", 15);
                            foodList.add(food);
                            break;

                        case 3:
                            food = new Food("Chicken Burger", 10);
                            foodList.add(food);
                            break;

                        case 4:
                            food = new Food("Toy", 12);
                            foodList.add(food);
                            break;

                    }
                    System.out.print("Enter quantity: ");
                    int quantity = input.nextInt();

                    food.setQuantity(quantity);
                }
                break;

            case 3:
                if (foodChoice != 5) {
                    switch (foodChoice) {

                        case 1:
                            food = new Food("Oreo McFlurry", 4);
                            foodList.add(food);
                            break;

                        case 2:
                            food = new Food("Chocolate Sundae", 2);
                            foodList.add(food);
                            break;

                        case 3:
                            food = new Food("Strawberry Sundae", 2);
                            foodList.add(food);
                            break;

                        case 4:
                            food = new Food("Apple Pie", 6);
                            foodList.add(food);
                            break;

                    }
                    System.out.print("Enter quantity: ");
                    int quantity = input.nextInt();

                    food.setQuantity(quantity);
                }
                break;

            case 4:
                if (foodChoice != 5) {
                    switch (foodChoice) {

                        case 1:
                            food = new Food("100 Plus", 3);
                            foodList.add(food);
                            break;

                        case 2:
                            food = new Food("Coca-Cola", 3);
                            foodList.add(food);
                            break;

                        case 3:
                            food = new Food("Sprite", 3);
                            foodList.add(food);
                            break;

                        case 4:
                            food = new Food("Ice Lemon Tea", 3);
                            foodList.add(food);
                            break;

                    }
                    System.out.print("Enter quantity: ");
                    int quantity = input.nextInt();

                    food.setQuantity(quantity);
                }
                break;

        }

        return foodList;

    }

    public void payment(double payment) {
        Scanner input = new Scanner(System.in);

        double totalPrice = this.calculateTotalPrice();
        double change;

        if (payment < totalPrice) {

            System.out.println("\nInsufficient amount! Please enter again.");
            payment = input.nextInt();
            input.nextLine();

        }

        if (payment > totalPrice) {

            change = payment - totalPrice;
            System.out.println("\nHere is Your Change: RM" + change);
            System.out.println("Welcome to visit next time\n");

        } else {

            System.out.println("\nPaid successfully! Welcome to visit next time.\n");
        }

    }

    public void receipt() {

        System.out.println("\nOrder " + this.orderID);
        System.out.println(customer.toString());
        System.out.println("Your order: ");

        for (int i = 0; i < foodList.size(); i++) {
            System.out.print((i+1) + ". ");
            System.out.println(foodList.get(i));
            System.out.println();

        }

        if (customer instanceof Member) {
            
            System.out.println("Discount: -20%");
            
        }

        System.out.println("Total Price: RM" + this.calculateTotalPrice());
    }

    public void checkReceipt(String orderID) {

        if (orderID.equals(this.orderID)) {

            this.receipt();

        }

    }

}
