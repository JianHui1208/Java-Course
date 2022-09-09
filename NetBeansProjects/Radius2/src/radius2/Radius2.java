/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radius2;

/**
 *
 * @author William
 */

import java.util.*;

public class Radius2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //step1:read radius
        double radius;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius:");
        radius = input.nextDouble();
        //step2:ocmpute area
        area = radius * radius * 3.1314;
        //step3:display radius
        System.out.println(" The area is "+area+" ");
    }
    
}
