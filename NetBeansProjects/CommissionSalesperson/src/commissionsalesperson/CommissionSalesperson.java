/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commissionsalesperson;

/**
 *
 * @author William
 */
import java.util.*;
import javax.swing.JOptionPane;
public class CommissionSalesperson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /*double value = 1234.56789;
    String format = "%1.5f"; 
    JOptionPane.showMessageDialog(null,String.format(format, value),"String format",JOptionPane.PLAIN_MESSAGE);
    String formattedVal = String.format("The value is %10.2f",value);
    System.out.println(formattedVal);
    System.out.format(String.format(format, value));*/
    
    System.out.printf("%8d%8s%8.1f\n",1234,"java",5.6);
    System.out.printf("-%8d-%8s-%-8.1f\n",1234,"java",5.6);
    }
}

