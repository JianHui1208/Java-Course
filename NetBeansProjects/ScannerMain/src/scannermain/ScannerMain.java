/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannermain;

/**
 *
 * @author pc
 */
import java.util.*;

public class ScannerMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num =scanner.nextInt();
        System.out.println("The number entered is:" +num);
    }
    
}
