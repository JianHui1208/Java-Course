/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thedo.pkgwhile.loop;

/**
 *
 * @author William
 */
import java.util.*;
import javax.swing.JOptionPane;
public class TheDoWhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int data;//也可以用double 会自动变去Int//
        int sum = 0;
        do
        {
            String dataString=JOptionPane.showInputDialog(null,"Enter an int value,\nthe program exits if the input is o",
                    "TestDo",JOptionPane.QUESTION_MESSAGE);
            data = Integer.parseInt(dataString);
            sum+=data;
        }while(data!=0);
        
        JOptionPane.showMessageDialog(null,"the sum is "+sum,"TestDo",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
