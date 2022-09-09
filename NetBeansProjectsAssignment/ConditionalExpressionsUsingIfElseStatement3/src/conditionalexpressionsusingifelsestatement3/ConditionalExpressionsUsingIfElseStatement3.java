/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalexpressionsusingifelsestatement3;

/**
 *
 * @author William
 */
import java.util.*;
public class ConditionalExpressionsUsingIfElseStatement3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        double number = input.nextDouble();
        if(number%3 == 0)
            System.out.println("I");
        else
            System.out.println("J");
        
    }
    
}
