/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketprice;

/**
 *
 * @author William
 */
import java.util.*;
public class TicketPrice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the age: ");
        double age = input.nextDouble();
        double ticketPrice = 0;
        
        ticketPrice = age>=16 ? 20 : 10 ;
        System.out.println("TicketPrice is " + ticketPrice);
    }
    
}
