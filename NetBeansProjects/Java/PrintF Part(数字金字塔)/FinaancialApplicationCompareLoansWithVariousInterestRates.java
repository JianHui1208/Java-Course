/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaancialapplicationcompareloanswithvariousinterestrates;

/**
 *
 * @author William
 */
import java.util.*;
public class FinaancialApplicationCompareLoansWithVariousInterestRates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

	System.out.print("Loan Amount: ");
	double LoanAmount = input.nextDouble();
	System.out.print("Number of Years: ");
	int numberOfYears = input.nextInt();

	System.out.println("Interest Rate    Monthly Payment    Total Payment");
		
        // Display table with interest rates
	for (double i = 5.0; i <= 8; i += 0.125) {
            System.out.printf("%-5.3f", i);
            System.out.print("%           ");
            double monthlyInterestRate = i / 1200;
            double monthlyPayment = LoanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
            System.out.printf("%-19.2f", monthlyPayment);
            System.out.printf("%-8.2f\n",(monthlyPayment * 12) * numberOfYears);
            }
	}
}