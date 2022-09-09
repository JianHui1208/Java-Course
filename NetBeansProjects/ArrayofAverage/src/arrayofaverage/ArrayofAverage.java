/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayofaverage;

/**
 *
 * @author William
 */
import java.util.*;
public class ArrayofAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double[] vals = new double[10];
        System.out.print("Please enter to double values: ");

        for (int i = 0; i < 10; i++) {
            vals[i] = input.nextDouble();
        }
        System.out.printf("The average is: %4.2f", average(vals));
    }

    public static int average(int[] vals) {
        int sum = 0;
        for (int array : vals)
            sum += array;
        return sum / vals.length;
    }

    public static double average(double[] vals) {
        double sum = 0.0;
        for (double array : vals) 
            sum += array;
        return sum / vals.length;
    }
}
