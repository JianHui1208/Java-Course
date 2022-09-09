/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integerreversed;

/**
 *
 * @author William
 */
import java.util.*;
public class IntegerReversed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("Integer reverse is ");
        reverse(number);
    }
    public static void reverse(int number){
        while(number >0){
            System.out.print((number %10));
               number /=10;
        }
    }
}
