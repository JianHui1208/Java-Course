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
public class Animal {

    String name;
    int numLegs;

    public Animal(String name, int numLegs) {
        this.name = name;
        this.numLegs = numLegs;
    }

    public Animal() {

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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();
        myDog.eat();
    }

}
