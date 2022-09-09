/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestAnythings;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author William
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayClass a = new ArrayClass();
        System.out.println("Enter Number(10Time)");
        for(int i = 1;i <= 10;i++){
            int Q = input.nextInt();
            a.insert(Q);
        }
        System.out.println(Arrays.toString(a.display()));
    }
    
}
