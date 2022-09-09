/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averagetecher;

/**
 *
 * @author William
 */
import java.util.*;

public class AverageTecher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number 1=");
        int num1 = input.nextInt();
        System.out.print("Enter the number 2=");
        int num2 = input.nextInt();
        double ave = (num1+num2)/2.0;
        System.out.println("Average of "+num1+" and "+num2+" is " + ave);
    }
    
}
