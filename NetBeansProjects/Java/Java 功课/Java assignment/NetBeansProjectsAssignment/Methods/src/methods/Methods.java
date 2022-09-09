/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author William
 */
import java.util.*;
public class Methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //invoke methods - call methods
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the start number: ");
        double start = input.nextDouble();
        System.out.print("Enter the end number: ");
        double end = input.nextDouble();
        /*int sum=sum(1,10);*/ //用在sum（1，10）//
        double  sum=sum(start,end);
        System.out.println("Sum from "+ start +" to "+ end +" is " + sum);
        System.out.println("Sum from 1 to 10 is " + sum(1,10));
        sum=sum(5,50);
        System.out.println("Sum from 5 to 50 is " + sum(5,50));
    }
    public static double sum(double i1,double i2){
    int sum=0;
    for(double i = i1;i<=i2;i++)
        sum+=i;
    return sum;
    }
}
