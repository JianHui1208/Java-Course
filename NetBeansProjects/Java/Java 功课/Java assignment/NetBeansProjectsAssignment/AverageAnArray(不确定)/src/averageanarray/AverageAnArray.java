/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averageanarray;

/**
 *
 * @author William
 */
import java.util.*;
public class AverageAnArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double [] vals = new double[10];
        System.out.print("Please enter to double value: ");
        for(int i=0;i<vals.length;i++){
            vals[i] = input.nextDouble();
            
            System.out.println("The Average is: " + average(vals));
            System.out.print("Enter the next number: ");
        }
        
        int [] val = new int[10];
        System.out.print("\nPlease enter to int value: ");
        for(int i=0;i<val.length;i++){
            val[i] = input.nextInt();
            
            System.out.println("The Average is: " + averge(val));
            System.out.print("Enter the next number: ");
        }
    }
    public static int averge(int[] array){
        int sum = 0;
        for(int val : array){
            sum+=val;
        }
        return sum/array.length;
    }
    public static double average(double[] array){
        double sum =0.0;
        for(double val : array){
            sum+=val;
        }
        return sum/array.length;
    }
}