/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication67656;

/**
 *
 * @author William
 */
import java.util.*;
public class MethodsAdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number1: ");
        int num1 = input.nextInt();
        System.out.print("enter the number2: ");
        int num2 = input.nextInt();
        int add = add(num1,num2);
        System.out.println(num1 + "+" + num2 + "=" + add);
    }
    public static int add(int num1,int num2){
        return num1+num2;
    }
}
