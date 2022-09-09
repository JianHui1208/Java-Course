/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countsales;

/**
 *
 * @author William
 */
import java.util.*;
public class CountSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.print("Enter total for saleman: ");
        int total=input.nextInt();
        int num1=1;
        int num2=0;
        int sales;
        int above=0;
        int below=0;
        
        do{
            System.out.print("Total sale for Salesman" + num1 + " : ");
            sales=input.nextInt();
            if(sales > 200000){
                above++;
            }else{
                below++;
            }
            num2+=sales;
            num1++;
        }while(num1 != (total + 1) );
        int average = num2 / total;
        System.out.println("Total sales is "+ num2);
        System.out.println("Average sales is "+ average);
        System.out.println("Total of salesman is above the 200000 : " + above + "(" + (above * 100 / (above + below) + "%)"));
        System.out.println("Total of salesman is below the 200000 : " + below + "(" + (below * 100 / (above + below) + "%)"));
    }
    
}