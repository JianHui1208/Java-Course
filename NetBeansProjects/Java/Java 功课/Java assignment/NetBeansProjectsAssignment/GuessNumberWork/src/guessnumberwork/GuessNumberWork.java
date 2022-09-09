/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnumberwork;

/**
 *
 * @author William
 */
import java.util.*;
public class GuessNumberWork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Write a game call Guess Number.The GuessNumber is an integer value(auto generate).");
        String Yes;
        char No=0;
 do{
        int inputnum=0;
        int change=10;//机会的Int
        int max=100;
        int min=0;
        int RandomNum=(int)(Math.random()*100);
        
        do{
            System.out.println(RandomNum);
            System.out.println("[" + change + " Chances]");
            System.out.print("Please guess the number between " + min +" - "+ max + ": ");
            inputnum = input.nextInt();
            change--;
            if(inputnum<=RandomNum){
                min=inputnum;
            }else{
                max=inputnum;
            }
            if(inputnum==RandomNum){
                System.out.println("Congratulation you win!");
            }else if(change==0){
                System.out.println("You lose");
            }
        }while(min != RandomNum && change != 0);
        
        System.out.println("DO you want to repeat [Y-Yes N-No]");
        Yes=input.next();//yes = "JAVA"
        No=Yes.charAt(0);//
        
    }while(No!='N');{System.out.println("Thank you");}
 
    }

}
