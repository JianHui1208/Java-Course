/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmath;

/**
 *
 * @author William
 */
import java.util.*;
public class TestMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number(1 or 2): ");
        int str = input.nextInt();
        switch(str){
            case 1 :System.out.println("AAA and BBB");break;
            case 2 :System.out.println("BBB and AAA");break;
            default:System.out.println("Wrong");
        }
    }
    
}
