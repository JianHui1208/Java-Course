/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package positivenegativenumber;

/**
 *
 * @author William
 */
import java.util.*;
public class PositiveNegativeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	Scanner input = new Scanner(System.in);

	double positives = 0; 	// Count the number of positive numbers
	double negatives = 0; 	// Count the number of negative numbers
	double count = 0;       // Count all numbers
	double total = 0;	// Accumulate a totol


		// Promopt the user to enter an integer or 0 to exit
	System.out.print("Enter an integer, the input ends if it is 0: ");
	double number = input.nextDouble();

	if (number == 0) {	// 看他是不是等于0 or 其他的号码
	System.out.println("No numbers are entered except 0");
        System.exit(1);
	}

	while (number != 0) {// Test for sentinel value
	if (number > 0)
		positives++;	// 如果号码大于0 就是正 就会在这里
	else
		negatives++;	// 如果号码小于0 就是负 就会跳在这里
	total += number;	// 两个号码的总和
	count++;		// 要算平均数的 总数除2
	number = input.nextInt();
	}

	// 算平均数
	double average = total / count;
                
	System.out.println(
	"The number of positive is " + positives +
	"\nThe number of negatives is " + negatives +
	"\nThe total is " + total +
	"\nThe average is " + average);
	}
}