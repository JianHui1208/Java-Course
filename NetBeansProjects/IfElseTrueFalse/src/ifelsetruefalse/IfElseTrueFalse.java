/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelsetruefalse;

/**
 *
 * @author William
 */
import java.util.*;
public class IfElseTrueFalse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student Mark = ");
        double marks = input.nextDouble();
        
        if(marks >=50){
            System.out.println(" Good ");}
        else{
                System.out.println(" fail ");
                }
    }
    
}
