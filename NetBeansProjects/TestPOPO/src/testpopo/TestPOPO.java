/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpopo;

/**
 *
 * @author William
 */
import java.util.*;
public class TestPOPO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Num1: ");
        int Num1 = input.nextInt();
        System.out.print("Enter the Num2: ");
        int Num2 = input.nextInt();
        int X;
        System.out.println(Num1 + "," +  Num2);
        do{
            System.out.print("Select function:");
            X = input.nextInt();
        if(X>=1 && X<=5)
            if(X<=1){
                int Addition = Num1 + Num2;
                System.out.println(Addition);
            }else if(X<=2){
                int Subtraction = Num1 - Num2;
                System.out.println(Subtraction);
            }else if(X<=3){
                int Multiplication = Num1 * Num2;
                System.out.println(Multiplication);
            }else if(X<=4){
                int Division = Num1 / Num2;
                System.out.println(Division);
            }else if(X<=5){
                System.out.println("exit");
            }if(X<1 || X>5){
            System.out.println("resat the number");
        }
        }while(X!=5);
        
        
        
        /*System.out.println("bring other number");*/
        }
    
}
