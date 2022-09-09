/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionaloperator;

/**
 *
 * @author William
 */
import java.util.*;
public class ConditionalOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age:");
        double age = input.nextDouble();
        int ticketPrice = 0;
        
        if (age>=16)
            ticketPrice = 20;
        else
            ticketPrice = 10;
       
        ticketPrice = (age >= 16) ? 20 : 10;
        System.out.println("Ticket Price is " + ticketPrice);
    }
    
}
