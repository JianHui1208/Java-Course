package projectPresent;

import java.util.ArrayList;

public class Food {

    private String foodName;
    private double price;
    private int quantity;

    public Food() {

    }

    public Food(String foodName, double price) {

        this.foodName = foodName;
        this.price = price;

    }

    public String getFoodName() {

        return this.foodName;

    }

    public void setFoodName(String foodName) {

        this.foodName = foodName;

    }

    public double getPrice() {

        return this.price;

    }

    public void setPrice(double price) {

        this.price = price;

    }

    public int getQuantity() {

        return this.quantity;

    }

    public void setQuantity(int quantity) {

        this.quantity = quantity;

    }

    public static void packageMeals() {

        ArrayList packageMeals = new ArrayList();
        packageMeals.add("Double McChicken        RM15");
        packageMeals.add("Spicy Chicken McDeluxe  RM30");
        packageMeals.add("Chicken McNuggets       RM12");
        packageMeals.add("Ayam Goreng Spicy       RM25");

        System.out.println("------------- Package Meals -------------");

        System.out.println();

        for (int i = 0; i < packageMeals.size(); i++) {

            System.out.println((i + 1) + ". " + packageMeals.get(i));

        }

        System.out.println("Press 5 back to Menu.");

    }

    public static void happyMeals() {

        ArrayList happyMeals = new ArrayList();
        happyMeals.add("4pcs Chicken McNuggets   RM9");
        happyMeals.add("Fried Chicken McD        RM15");
        happyMeals.add("Chicken Burger           RM10");
        happyMeals.add("Toy                      RM12");

        System.out.println("------------- Happy Meals -------------");

        System.out.println();

        for (int i = 0; i < happyMeals.size(); i++) {

            System.out.println((i + 1) + ". " + happyMeals.get(i));

        }

        System.out.println("Press 5 back to Menu.");

    }

    public static void desserts() {

        ArrayList desserts = new ArrayList();
        desserts.add("Oreo McFlurry            RM4");
        desserts.add("Chocolate Sundae         RM2");
        desserts.add("Strawberry Sundae       RM2");
        desserts.add("Apple Pie                RM6");

        System.out.println("------------- Desserts -------------");

        System.out.println();

        for (int i = 0; i < desserts.size(); i++) {

            System.out.println((i + 1) + ". " + desserts.get(i));

        }

        System.out.println("Press 5 back to Menu.");

    }

    public static void drinks() {

        ArrayList drinks = new ArrayList();
        drinks.add("100 Plus                 RM3");
        drinks.add("Coca-Cola                RM3");
        drinks.add("Sprite                   RM3");
        drinks.add("Ice Lemon Tea            RM3");

        System.out.println("------------- Desserts -------------");

        System.out.println();

        for (int i = 0; i < drinks.size(); i++) {

            System.out.println((i + 1) + ". " + drinks.get(i));

        }

        System.out.println("Press 5 back to Menu.");

    }

    public double calculateSubtotal() {

        double subtotal = 0;

        subtotal = this.getPrice() * this.getQuantity();

        return subtotal;
    }

    @Override
    public String toString() {

        return  this.foodName + "\n   Unit Price: RM" + this.price + "\n   Subtotal: RM"
                + this.calculateSubtotal() + "\n   Quantity: " + this.quantity;

    }
}
