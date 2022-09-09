/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputdialogbox1;

/**
 *
 * @author pc
 */
import javax.swing.JOptionPane;

public class InputDialogBox1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String msg = JOptionPane.showInputDialog(null,"What is your name?","Welcome",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, msg+",Welcometo java Would!", "hello", JOptionPane.PLAIN_MESSAGE);
    }
    
}
