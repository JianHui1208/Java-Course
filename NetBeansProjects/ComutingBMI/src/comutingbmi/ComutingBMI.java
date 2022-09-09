/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comutingbmi;

/**
 *
 * @author William
 */
import java.util.*;

public class ComutingBMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double inches= input.nextDouble();
        
        double weight = pounds * 0.45359237;
        double height = inches * 0.0254;
        double BMI = weight / (height*height);
        
        System.out.println("BMI is " + BMI);
    }
    
}
