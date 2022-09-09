/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showmessage;

/**
 *
 * @author lc3543
 */
import java.util.Scanner;
public class CountSale {
    public static void main(String [] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter total of salesman: ");
       int nos = input.nextInt();
       int count=1;
       int totalSale=0;
       int above =0;
       int below =0;
       //while(count<=nos){
           System.out.print("Total sale for Saleman "+count+" :");
           int sale = input.nextInt();
           count++;
           totalSale+=sale; //totalSale=totalSale+sale;
           if(sale<200000){
               below++;
           }else{
               above++;
           }
      // }
       int average = totalSale / nos;
       System.out.println("Total sale is "+totalSale);
       System.out.println("Average sale is "+average);
       System.out.println("Total of saleman is below 200000:"+ below+" ("+ ((double)below/nos*100.0)+"%)");
       System.out.println("Total of saleman is above 200000:"+ above+" ("+ ((double)above/nos*100.0)+"%)");

       
    }
    
}
