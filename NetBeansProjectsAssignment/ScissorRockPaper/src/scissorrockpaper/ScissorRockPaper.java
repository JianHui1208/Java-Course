/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scissorrockpaper;

/**
 *
 * @author William
 */
import java.util.*;
public class ScissorRockPaper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int number = (int)(Math.random()*3);
        Scanner input = new Scanner(System.in);
        
        System.out.print("Guessing Game: Scissor,Rock,Paper" + 
                "\nEnter 0 for Scissor 1 for Rock or 2 for Paper: ");
        int guess = input.nextInt();
        
        if (number == 0 && guess == 0)
            System.out.println("The computer is Scissor. You are Scissors too. It is a draw.");
        else if (number == 0 && guess == 1)
            System.out.println("The computer is Scissor. You are Rock. You won.");
        else if (number == 0 && guess == 2)
            System.out.println("The computer is Scissor. You are Paper. You lose.");
        else if (number == 1 && guess == 0)
            System.out.println("The computer is Rock. You are Scissors. You lose.");
        else if (number == 1 && guess == 1)
            System.out.println("The computer is Rock. You are Rock too. It is a draw.");
        else if (number == 1 && guess == 2)
            System.out.println("The computer is Rock. You are Paper. You won.");
        else if (number == 2 && guess == 0)
            System.out.println("The computer is Paper. You are Scissors. You won.");
        else if (number == 2 && guess == 1)
            System.out.println("The computer is Paper. You are Rock. You lose.");
        else if (number == 2 && guess == 2)
            System.out.println("The computer is Paper. You are Paper too. It is a draw."); 
        else{ 
               System.out.println("The Game is Error.");
        }
    }
    
}
