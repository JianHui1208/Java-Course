/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betterprice;

/**
 *
 * @author William
 */
import java.util.*;
public class BetterPrice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the price for package 1: ");
        double price1 = input.nextDouble();
        System.out.print("Enter the weight for packge 1: ");
        double weight1 = input.nextDouble();
        
        System.out.print("Enter the price for package 2: ");
        double price2 = input.nextDouble();
        System.out.print("Enter the weight for packge 2: ");
        double weight2 = input.nextDouble();
        
        if (price1/weight1 < price2/weight2){
            System.out.println("Packge 1 has a better price");
        }else if ((price2/weight2) < (price1/weight1)){
            System.out.println("Packge 2 has a better price");
            }else{
                System.out.println("Two Packges have the same price.");}
              
            
        
    }
    
}
