/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Animal1 {

    String name;
    int numLegs;

    public Animal1(String name, int numLegs) {
        this.name = name;
        this.numLegs = numLegs;
    }

    public Animal1() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public String getName() {
        return name;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public void sound() {

    }

    public void eat() {

    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        Animal dogname = new Animal("Bob", 3);
        System.out.print("My dog" + dogname.name + "has only" + dogname.numLegs + "legs");
        System.out.println("It");
        myDog.sound();
        System.out.print("and");
        myDog.eat();
    }

}
