/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radius;

/**
 *
 * @author pc
 */
import java.util.*;

public class Radius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // step 1:read radius
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius:");
        double radius = input.nextDouble();
        // step 2:compute the area
        double area = radius * radius * 3.1415;
        // step 3:diplay the area
        System.out.println("The area for the radius " + radius +" is "+area);
        
    }
    
}
