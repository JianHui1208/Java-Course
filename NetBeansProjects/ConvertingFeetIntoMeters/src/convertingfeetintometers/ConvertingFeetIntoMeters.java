/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertingfeetintometers;

/**
 *
 * @author William
 */
import java.util.*;

public class ConvertingFeetIntoMeters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();

        double meters = feet * 0.305 ; 
        
        System.out.println(feet + " feet is " + meters + " meters");
        
    }
    
}
