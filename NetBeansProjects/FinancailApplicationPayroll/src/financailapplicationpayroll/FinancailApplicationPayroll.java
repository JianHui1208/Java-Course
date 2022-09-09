/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financailapplicationpayroll;

/**
 *
 * @author William
 */
import java.util.*;
public class FinancailApplicationPayroll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter employee's name: ");
        String name = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        float hour = input.nextFloat();
        System.out.print("Enter hourly pay rate: ");
        float rate = input.nextFloat();
        System.out.print("Enter federal tax withholding rate: ");
        float federaltax = input.nextFloat();
        System.out.print("Enter state tax withholding rate: ");
        float statetax = input.nextFloat();
        
        float salary = hour * rate;
        float federal = (federaltax) * salary;
        float state = (statetax) * salary;
        float total = federal + state;
        float net = salary - total;
        
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hour);
        System.out.println("Pay Rate: " + rate);
        System.out.println("Gross Pay: " + salary);
        System.out.println("Deductions:");
        System.out.println("    Federel Withholding: " + federal);
        System.out.println("    State Withholding: " + state);
        System.out.println("    Total Deduction: " + total);
        System.out.println("Net Pay: " + net);
    }
    
}
