/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hy;

/**
 *
 * @author William
 */
import java.net.InetAddress;
import java.util.*;
import javax.swing.JOptionPane;
public class Hy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        /*int i = 5;
        int j = 2;
        int k = max(i, j);
        System.out.println( i + " 和 " + j + " 比较，最大值是：" + k);
     }*/
 
   /* 返回两个整数变量较大的值 */
   /*public static int max(int num1, int num2) {
      int result;
      if (num1 > num2)
         result = num1;
      else
         result = num2;
 
      return result; 
   }*/
        /*System.out.println("Pattern A:");
        for(int a=1; a<=6;a++){
            for(int b=1;b<=a;b++){
                System.out.print(b+" ");
            }
            System.out.println("");
        }
        
        System.out.println("Pattern B:");
        for(int a=1; a<=6;a++){
            for(int b=1;b<=7-a;b++){
                System.out.print(b+" ");
            }
            System.out.println();
        }
        
        System.out.println("Pattern C");
        for(int a=1;a<=6;a++){
            for(int b=1;b<=6-a;b++){
                System.out.print("  ");
            }
            for(int c=a;c>=1;c--){
                System.out.print(c+" ");
            }
            System.out.println();
        }*/
        
        /*for(int a=0;a>10;a=a+1){
            System.out.println(a);
        }*/
        /*int a=0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Enter the a number (10 to stop): ");
            a = input.nextInt();
        }while(a>=10);*/
        
        /*double[] myList = {1.9, 2.9, 3.4, 3.5};
 
        // 打印所有数组元素
        for (int i = 0; i < myList.length; i++) {
           System.out.println(myList[i] + " ");
        }
        // 计算所有元素的总和
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
           total += myList[i];
        }
        System.out.println("Total is " + total);
        // 查找最大元素
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
           if (myList[i] > max) max = myList[i];
        }
        System.out.println("Max is " + max);*/
        
        /*String s[][] = new String[2][];
        s[0] = new String[2];
        s[1] = new String[3];
        s[0][0] = new String("Good");
        s[0][1] = new String("Luck");
        s[1][0] = new String("to");
        s[1][1] = new String("you");
        s[1][2] = new String("!");
        
        System.out.println(s[2]+s[0][0]+" "+s[0][1]);*/
        //Prime Number
        /*int num=3;
        int status=1;
        int a =1;
        Scanner input = new Scanner(System.in);
        while(a!=100){
        System.out.print("Enter One Number :");
        a = input.nextInt();
       
        if(a>=1){
            System.out.println("First "+a+" Prime number are");
            System.out.println(2);
        }
        for(int count=2;count<=a;)
        {
        for(int j=2;j<=Math.sqrt(num);j++)
        {
        if(num%j==0)
        {
        status = 0;  
        break;
        }
        }
        if(status !=0)
        {
         System.out.println(num);
         count++;
        }
        status=1;
        num++;
        }
    }*/
        
        /*System.out.println(InetAddress.getLocalHost());*/
        
        //cheak Prime Number
        /*int temp;
        boolean isPrime = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = input.nextInt();
        for(int i=2;i<=num/2;i++){
            temp=num%i;
            if(temp==0){
                isPrime=false;
            }
        }
        if(isPrime){
            System.out.println(num + " is a Prime Number");
        }else{
	   System.out.println(num + " is not a Prime Number");
        }*/
/////////////////////////////////////////////////
        /*int i;
        int num1 = 0;
        int maxCheck = 1000; // maxCheck limit till which you want to find prime numbers
        boolean isPrime1 = true;
 
        //Empty String
        String primeNumbersFound = "";
 
        //Start loop 1 to maxCheck
        for (i = 1; i <= maxCheck; i++) {
            isPrime1 = CheckPrime(i);
            if (isPrime1) {
                primeNumbersFound = primeNumbersFound + i + "\n ";
            }
        }
        System.out.println("Prime numbers from 1 to " + maxCheck + " are:");
        // Print prime numbers from 1 to maxCheck
        System.out.println(primeNumbersFound);
    }
    public static boolean CheckPrime(int numberToCheck) {
        int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;
            //if remainder is 0 than numberToCheckber is not prime and break loop. Elese continue loop
            if (remainder == 0) {
                return false;
            }
        }
        return true;*/
//////////////////////////////////////////////\
        /*double []array = new double[30];
        for(int a=0;a<=array.length;a++){
            array[a]+=(Math.random()*100);
            System.out.println(array[a]);
        }*/
        
        /*Scanner input = new Scanner(System.in);
        String a;
        do{
        System.out.print("Enter the number: ");
        a = input.next();
        }while(!isInteger(a));
        System.out.print(addString(a));
        
    }
    public static int addString(String g){
        int o=0;
        int p=Integer.parseInt(g);//string to int
        while(p>0){
            o+=p%10;//加的意思（有余数） [c+b(input)]%10
            p/=10;  //（没有余数）b=b/10
        }
        return o;
    }
    
    public static boolean isInteger(String Str){
        if(Str==null || Str.trim().isEmpty()){
            return false;
        }
        for(int i=0;i<Str.length();i++){
            if(!Character.isDigit(Str.charAt(i))){
            return false;
            }
        }
        return true;
    //检查user有没有keyin错误的号码和字母*/
        
        /*double value=1234.56789;
        
        String format = "%10.2f";
        JOptionPane.showMessageDialog(null,String.format(format,value),"String format",
                JOptionPane.PLAIN_MESSAGE);
        String formattedVal=String.format("The value is %10.2f",value);
        System.out.println(formattedVal);
        System.out.print(String.format(format,value));*/
        
        /*int temp=0;
        boolean isPrime = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = input.nextInt();
        for(int i=2;i<=num/2;i++){
            temp=num%i;
            if(temp==0){
                isPrime=false;
            }
        }
        if(isPrime){
            System.out.println(num + " is a Prime Number");
        }else{
	   System.out.println(num + " is not a Prime Number");
        }
        
        /*final int NUMBER_OF_PRIMES_PER_LINE = 8; // Display 8 per line
		int count = 0; // Count the number of prime numbers

		System.out.println(
			"The prime numbers between 2 and 1,000, inclusive are \n");

		// Repeatedly find prime numbers
		for (int number = 2; number <= 1000; number++) {
			// Assume the number is prime
			boolean isPrime = true;	// Is the current number prime?

			// Test whether number is prime
			for (int divisor = 2; divisor <= number / 2; divisor++) {
				if (number % divisor == 0)	{ // If true, number is not prime
					isPrime = false;	// Set isPrime to false
					break;	// Exit the for loop
				}
			}

			// Display the prime number and increase the count
			if (isPrime) {
				count++;	// Increase the count

				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					// Display the number and advance to the new line
					System.out.println(number);
				}
				else
					System.out.print(number + " ");
			}
		}*/
    /*int a[] = new int[] { 23, 34, 13, 64, 72, 90, 10, 15, 9, 27 };
    int min = a[0]; //  assume first elements as smallest number
    int max = a[0]; //  assume first elements as largest number

	for (int i = 1; i < a.length; i++)  // iterate for loop from arrays 1st index (second element)
	{
	if (a[i] > max) 
			{
				max = a[i];
			}
			if (a[i] < min) 
			{
				min = a[i];
			}
		}

		System.out.println("Largest Number in a given array is : " + max);
		System.out.println("Smallest Number in a given array is : " + min);*/
    /*int x=0;
    int y=0;
    
    /*x=1;
    y = ++x;
    System.out.println(x);
    System.out.println(y);
    y = x++;
    System.out.println(x);
    System.out.println(y);
    
    x=1;
    y=5;
    y=x++ + x-- + ++x - --x;
    System.out.println(x);
    System.out.println(y);
    
    double [] myList = new double [10];
    double max = myList[0];*/
    
//        double [] a ={1.2,2.5,9.9,6.6};
//        double [] acopy=new double[a.length];
//        calTotal(a);
//        suffleValue(a);
//      for(int b=0;b<acopy.length;b++){
//      }
//    }
//    public static  void calTotal(double []a){
//        double total=0;
//        for(int b=0;b<a.length;b++){
//            total=total+a[b];
//        }
//        System.out.println("Total is " +total);
//       
//    }
//    public static  void suffleValue(double []a){
//        for(int b=0;b<a.length;b++){
//            int index = (int)(Math.random()*a.length);
//            double temp=a[b];
//            a[b]=a[index];
//            a[index]=temp;
//            System.out.println("\n"+a[index]);
//        }
//        //return a;
    
    double p = 1; 
    System.out.println(p/0); 
    }
     /*int [] aList ={2,6,5,8,9};
       sum(aList);  
       aList=wash(aList);
       for(int a=0;a<aList.length;a++){
        System.out.println(aList[a]);
       }
    }
    public static void sum(int [] aList){
        int total=0;
        for(int a=0;a<aList.length;a++){
            total=total+aList[a];
        }
        System.out.println("total is "+total);
    }
    public static int[] wash(int [] aList){
        for(int a=0;a<aList.length;a++){
            int temp=aList[a];
            int index= (int)(Math.random()*aList.length);
            aList[a]=aList[index];
            aList[index]=temp;
        }
        return aList;
     
    /*int [] bucky = new int [5];
    change(bucky);
    
    for(int y:bucky){
        System.out.println(y);
    }
    }
    public static void change(int [] x){
        int max=0;
        int min=0;
        for(int a=0;a<x.length;a++){
            x[a]+= (Math.random()*100);
            if(x[a]>max){
                System.out.println(x[a]);
            }
            else if(x[a]<min){
                System.out.println(x[a]);
            }
        }*/
        /*System.out.printf("%8d%8s%8.1f\n",1234,"Java",5.6);
        System.out.printf("%-8d%-8s%-8.1f\n",1234,"Java",5.6);*/
        
}