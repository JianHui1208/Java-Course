/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviecenima;

/**
 *
 * @author William
 */
import java.util.*;
public class Moviecenima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int [] seat={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.print("Press 1 to booking or Press 2 to exit: ");
        int number = input.nextInt();
        do{
        System.out.print("Enter Your Name: ");
        String name=input.next();
        for(int a=0;a<seat.length;a++){
            System.out.print(seat[a]);
            if((a+1)%5 ==0){
                System.out.println();
            }else if(a<10){
                System.out.print("  ");
            }else{
                System.out.print("  ");
            }
        }
            System.out.print("Select Your Seat (1 To 20): ");
            int choose = input.nextInt();
            if(choose ==0 || choose >20){
                System.out.println("Not availble,try angin.");
            }
            for(int a=0;a<seat.length;a++){
                if(choose == seat[a]){
                    seat[a]=0;
                }
            }
            System.out.println("Your Name : " +name+" Your Seat : "+choose);
            System.out.print("Press 1 to booking or Press 2 to exit: ");
            number = input.nextInt();
        }while(number!=2);
    }
    
}
