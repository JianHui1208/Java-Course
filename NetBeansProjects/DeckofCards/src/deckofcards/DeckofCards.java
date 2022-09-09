/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deckofcards;

/**
 *
 * @author William
 */
import java.util.*;
public class DeckofCards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double []a ={1.2,2.5,9.9,6.6};
        double []acopy = new double[a.length];
        calTotal(a);
        suffleValue(a);
        for(int b=0;b<acopy.length;b++){
        System.out.println(a[b]);
        }
    }
    public static void calTotal(double []a){
        double total = 0;
        for(int b=0;b<a.length;b++){
            total = total + a[b];
        }
        System.out.println("Total is " +total);
    }
    public static void suffleValue(double []a){
        for(int b=0;b<a.length;b++){
            int index =(int)(Math.random()*a.length);
            double temp = a[b];
            a[b] = a[index];
            a[index] = temp;
        }
    }
}
