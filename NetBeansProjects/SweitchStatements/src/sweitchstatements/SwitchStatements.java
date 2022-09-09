/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sweitchstatements;
import java.util.*;
/**
 *
 * @author William
 */

public class SwitchStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.print("Enter a number 1-12: ");
       int month = input.nextInt();
       switch(month){
           case 1: System.out.println("January");
                   break;
           case 2: System.out.println("February");
                   break;
           case 3: System.out.println("March");
                   break;
           case 4: System.out.println("April");
                   break;
           case 5: System.out.println("May");
                   break;
           case 6: System.out.println("June");
                   break;
           case 7: System.out.println("July");
                   break;
           case 8: System.out.println("August");
                   break;
           case 9: System.out.println("September");
                   break;
           case 10: System.out.println("October");
                   break;
           case 11: System.out.println("November");
                   break;
           case 12: System.out.println("December");
                   break;
           default: System.out.println("Wrong");
           }
        double n = 199; 
        System.out.println("Sum of digits in numbers"
                          +" from 1 to " + n + " is "
                          + sumOfDigitsFrom1ToN(n)); 
    }
    static int sumOfDigitsFrom1ToN(double n) 
    { 
        int result = 0; // initialize result 
       
        // One by one compute sum of digits 
        // in every number from 1 to n 
        for (int x = 1; x <= n; x++) 
            result += x; 
       
        return result; 
    } 
       
    // A utility function to compute sum  
    // of digits in a given number x 
    static int sumOfDigits(int x) 
    { 
        int sum = 0; 
        while (x != 0) 
        { 
            sum += x % 10; 
            x   = x / 10; 
        } 
        return sum; 
    } 
}
