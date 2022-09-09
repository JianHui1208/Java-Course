/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalexpressionsusingifelsestatements;

/**
 *
 * @author William
 */
import java.util.*;
public class ConditionalExpressionsUsingIfElseStatements2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter income:");
        int income = input.nextInt();
        double tax = 0;
        
        if (income>10000){
            tax=income*0.2;
         }else{
            tax=income*0.17+1000;}
        
        System.out.println("Income is " + tax);
    }
    
}
