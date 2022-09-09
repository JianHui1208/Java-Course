/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.pkg2;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Java2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner console = new Scanner (System.in);
        System.out.println("Enter your name");
        String name = console.nextLine();
        
        System.out.println("Enter your age:");
        int age = console.nextInt();
        
        displayInfo(name,age);
        
    }
    public static void displayInfo(String n,int a){
        System.out.println("Your name is "+n);
        System.out.println("your age is"+a);

    }
}
