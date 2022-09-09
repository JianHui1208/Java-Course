/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprimenumber;

/**
 *
 * @author William
 */
public class FinalPrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int  array [] = new int [20];
        int a=0;
        int i=0;
        boolean isPrime = true;
        int max=0;
        int min=0;
        for(a=0;a<array.length;a++){
            array[a] += (Math.random()*100)+1;
            System.out.println("Number: "+array[a]+" ");
            
            for(i=2;i<array[a]/2;i++){
                if(array[a]%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("Prime Number; "+ array[a]);
            }
            if(array[a]>max){
                System.out.println("Largest Number: "+array[a]);
            }
            if(array[a]<min){
                System.out.println("Smallest Number: "+array[a]);
            }
        }
    }
    
}
