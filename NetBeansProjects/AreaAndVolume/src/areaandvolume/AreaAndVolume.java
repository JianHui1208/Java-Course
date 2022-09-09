/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaandvolume;

/**
 *
 * @author William
 */
import java.util.*;

public class AreaAndVolume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                //input的function
		Scanner input = new Scanner(System.in);
                //写input的地方
		System.out.print("Enter the radius and length of a cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();
                //圆柱体公式
		double area = radius * radius * 3.14159;
		double volume = area * length;
                //Display出来的答案
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
    }
    
}
