/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thewhileloop.pkgdo;

/**
 *
 * @author William
 */
import java.util.*;
public class TheWhileLoopDo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int score;
        do{
            System.out.print("Enter the Score: ");
            score = input.nextInt();
        }while(score<0 || score>100);
        
        if (score>=80){
            System.out.println("A");
        }else if(score>=70){
            System.out.println("B");
        }else if(score>=60){
            System.out.println("C");
        }else if(score>=50){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
    
}
