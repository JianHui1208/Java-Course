/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamescrapsteacher;

/**
 *
 * @author William
 */
import java.util.*;
public class GamesCrapsTeacher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = dice();
        int num2 = dice();
        checkWinLose(num1,num2);
    }
    public static int dice(){
           int number = (int)(Math.random()*6)+1;
           return number;
    }
    
    public static void checkWinLose(int num1,int num2){
        int sum=num1+num2;
            if(sum==2 || sum==3 || sum==12){
                System.out.println("You Lose");
            }else if(sum==7 || sum==11){
                System.out.println("You Win");
            }else{
                System.out.println("Point is "+ sum);
                checkSecondWinLose(sum);
            }
    }
    public static void checkSecondWinLose(int sum){
    int num1=dice();
    int num2=dice();
    int total= num1+num2;
    System.out.println("You rolled "+num1+" + "+num2+ "="+total);
    if(total == sum){
     System.out.println("You Win");   
    }else if(total == 7 ){
        System.out.println("You lose");
    }else{
        checkSecondWinLose(sum);
    }
    }
}