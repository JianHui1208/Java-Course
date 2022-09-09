/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findthesmallestelement;

/**
 *
 * @author William
 */
import java.util.*;
public class FindTheSmallestElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double [] numbers = new double[10];
        System.out.print("Enter the numbers: ");
        for(int a=0;a<10;a++){
            numbers[a] = input.nextDouble();
        }
        System.out.println("The minimun number is " +min(numbers));
    }
        public static double min(double[] array){
            double min = array[0];
            for(double a:array){
                if(a<min){
                    min=a;
                }
            }return min;
    }
}
