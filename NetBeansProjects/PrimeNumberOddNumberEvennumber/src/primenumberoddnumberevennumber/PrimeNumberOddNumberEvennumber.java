/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumberoddnumberevennumber;

/**
 *
 * @author William
 */
import java.util.*;
public class PrimeNumberOddNumberEvennumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = new int[10];
        //Scanner input=new Scanner(System.in);
        for(int a=0;a<array.length;a++){
           array[a] +=(Math.random()*100)+2;
           //System.out.print("Enter a int number: ");
           //array[a]=input.nextInt();
           if(array[a]%2==0){
                System.out.println(array[a] + " number is even");
           }else{
                System.out.println(array[a] + " number is odd");
           }
           boolean isPrime = true;
           for(int divisor=2;divisor<=array[a]/2;divisor++){
               if(array[a]%divisor==0){
                   isPrime = false;
                   break;
               }
           }
           if(isPrime){
               System.out.println(array[a]+" is Prime Number\n");
           }else{
               System.out.println(array[a]+" not is Prime Number\n");
           }array[a]++;
        }
    }
}