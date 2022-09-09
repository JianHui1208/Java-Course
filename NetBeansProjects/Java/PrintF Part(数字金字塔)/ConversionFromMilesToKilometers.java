/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversionfrommilestokilometers;

/**
 *
 * @author William
 */
import java.util.*;
public class ConversionFromMilesToKilometers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
	final double KILOMETERS_PER_MILE = 1.609; 

	System.out.println("Miles  Kilometers");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-7d%-10.3f\n", i, (i * KILOMETERS_PER_MILE));
		}
	}
}