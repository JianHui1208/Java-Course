/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesmark.other;

/**
 *
 * @author William
 */
import java.util.*;
public class TesMarkOther {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student's Mark: ");
        double mark=input.nextDouble();
        
        if((mark>=0) && (mark<=100)){
            if(mark>=50)
                System.out.println("Passed");
            else
                System.out.println("Failed");
        }
        else{
            if(mark>=100)
                System.out.println("Invalid Number");
        
        }
    }
    
}
