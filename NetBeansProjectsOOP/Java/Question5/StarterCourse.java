/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class StarterCourse extends DinnerMenu implements Menu {
    String name;
    double price;

    public StarterCourse() {

    }

    public StarterCourse(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName1() {
        return "Watermelon";
    }

    public double getPrice1() {
        return 8.99;
    }

    public String getName2() {
        return "Soup";
    }

    public double getPrice2() {
        return 8.99;
    }

    public String getName3() {
        return "Watermelon";
    }

    public double getPrice3() {
        return 12.99;
    }
}
