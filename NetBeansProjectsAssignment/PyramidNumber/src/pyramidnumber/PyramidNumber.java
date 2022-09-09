/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramidnumber;

/**
 *
 * @author William
 */
import java.util.*;
public class PyramidNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Enter the number of lines:");
        Scanner input = new Scanner(System.in);
   
        //get the total number of lines n.
        int n = input.nextInt();
   
        //Loop through the lines from 1 to n
        for (int x = 1; x <= n; x++) {
        // printing spaces, 2 at a time from j=1 to j= n-i 
            for (int y = 1; y <= (n - x); y++) {
            System.out.print("  ");
            }
    
        //Printing number decreamentally from the line number j to 1
                for (int y = x; y >= 1; y--) {
                    System.out.print(y + " ");
                    }
    
        //Printing number increamentally from 2 to line number j
                        for (int y = 2; y <= x; y++) {
                            System.out.print(y + " ");
                            }
                                System.out.println();
 
        }
 
        }
 
}
