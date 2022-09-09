/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financailapplicationpayrolldialogbox;

/**
 *
 * @author William
 */
import javax.swing.JOptionPane;

public class FinancailApplicationPayrollDiaLogBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name = JOptionPane.showInputDialog(null,"Enter Employee's name: ","Input",JOptionPane.QUESTION_MESSAGE);
        String hour = JOptionPane.showInputDialog(null,"Enter number of hour worked in a week: ","Input",JOptionPane.QUESTION_MESSAGE);
        double shour = Double.parseDouble(hour);
        String salary = JOptionPane.showInputDialog(null,"Emter hourly pay rate: ","Input",JOptionPane.QUESTION_MESSAGE);
        double salarys = Double.parseDouble(salary);
        String federal = JOptionPane.showInputDialog(null,"Enter Federal tax withholding rate: ","Input",JOptionPane.QUESTION_MESSAGE);
        double federals = Double.parseDouble(federal);
        String state = JOptionPane.showInputDialog(null,"Enter state tax withholding rate: ","Input",JOptionPane.QUESTION_MESSAGE);
        double states = Double.parseDouble(state);
        
        double grossPay = shour * salarys;
        double FederalWithholding = federals * grossPay;
        double StateWithholding = states * grossPay;
        double Total = FederalWithholding + StateWithholding;
        double NetPay = grossPay - Total;
        
        
        
        String output=( "Employee Name: " + name + 
                        "\nHours Worked: " + shour +
                        "\nPay Rate: " + salarys +
                        "\nGross Pay: " + grossPay + 
                        "\nDeductions: " + 
                        "\n   Federal Withholding(20.0%): " + FederalWithholding +
                        "\n   State Withholding(9.0%): " + StateWithholding + 
                        "\n   Total Deduction: " + Total +
                        "\nNet pay: " + NetPay);
        
        JOptionPane.showMessageDialog(null, output,"Employee Payroll Info",1);
    }
    
}
