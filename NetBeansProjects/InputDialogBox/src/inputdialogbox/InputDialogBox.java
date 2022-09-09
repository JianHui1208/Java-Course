/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputdialogbox;

/**
 *
 * @author pc
 */
import javax.swing.JOptionPane;

public class InputDialogBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name = JOptionPane.showInputDialog(null,"Enter Your Name","Input Dialog Box",JOptionPane.INFORMATION_MESSAGE);
        
        System.out.println("The Name entered is:" +name);
    }
    
}
