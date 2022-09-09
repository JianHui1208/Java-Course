/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmark;

/**
 *
 * @author William
 */
import java.util.*;
public class TestMark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student's Mark: ");
        double marks=input.nextDouble();
        
        if (marks>=50 && marks<=100){
            System.out.println("Passed");
        } else if (marks<50){
            System.out.println("Failed");
        }   else {
            System.out.println("Invalid Number");
        }
        
    }
    
}
