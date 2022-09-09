/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isprimemethod;

/**
 *
 * @author William
 */
public class IsPrimeMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numberOfPrime = 0;
        for(int i = 1;i<10000;i++){
        if (isPrime( i+1 )){
        System.out.print((i+1)+" ");
        numberOfPrime++;
        if(numberOfPrime % 10 == 0){
        System.out.println();
        }
            }
    }
        System.out.println("The number of primes is " + numberOfPrime);
    }
    public static boolean isPrime(int number){
        for(int divisor = 2;divisor<=number/2;divisor++){
            if(number % divisor == 0){
            return false;
            }
        }
        return true;
    }
}
