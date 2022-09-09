/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srocescale;

/**
 *
 * @author William
 */
import java.util.*;
public class SroceScale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.print("Enter X for number: ");
        int X = input.nextInt();
        int Score = 0;
        int Scale = 5;
        if(X>10){
                Score = 3 * Scale;
        }else{
            Score = 4 * Scale;}
        
        System.out.println("Score is " + Score);
    }
    
}
