/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testprimenumber;

/**
 *
 * @author William
 */
public class TestPrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int[] array = new int[10];
        for(int a=1;a<array.length;a++){
           array[a] +=(Math.random()*100);
           
           for(int b = 2 ; b <= array[a] /2 ; b++ ){
               if ( array[a] % b == 0){
                   System.out.println(array[a]+" is not prime number\n");
                   break;
               }
               if (!( array[a] % b == 0)){
                   System.out.println(array[a]+" is prime number\n");
                   break;
               }
               if(array[a]==1 || array[a]==2){
                   System.out.println(array[a]+" is not prime number\n");
                }
            }
        }
        /*final int NumberPrimes =50;
        final int NumberPrimesLine=10;
        int count =0;
        int number =2;
        System.out.println("The frist 50 prime number are \n");
        
        while(count<NumberPrimes){
            boolean isPrime= true;
            
            for(int divisor =2;divisor<=number/2;divisor++){
                if(number%divisor==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                count++;
                if(count % NumberPrimesLine==0){
                    System.out.print(number + " ");
                }else{
                    System.out.print(number + " ");
                }
                
            }
            number++;
        }*/
        
        final int NUMBER_OF_PRIMES = 50; // Number of primes to display
        final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
        int count = 0; // Count the number of prime numbers
        int number = 2; // A number to be tested for primeness
 
        System.out.println("The first 50 prime numbers are \n");
 
        // Repeatedly find prime numbers
        while (count < NUMBER_OF_PRIMES) {
        // Assume the number is prime
                boolean isPrime = true; // Is the current number prime?

        // Test whether number is prime
                for (int divisor = 2; divisor <= number / 2; divisor++) {
                    if (number % divisor == 0) { // If true, number is not prime
                            isPrime = false; // Set isPrime to false
                            break; // Exit the for loop
                    }
            }

 // Display the prime number and increase the count
                if (isPrime) {
                                count++; // Increase the count

                                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
 // Display the number and advance to the new line
                                    System.out.println(number);
                                }else
                                    System.out.print(number + " ");
                             }

// Check if the next number is prime
                                 number++;
                }
        }
}
    
    

