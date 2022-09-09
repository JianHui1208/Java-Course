/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miles;

/**
 *
 * @author William
 */
public class Miles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //step1
        double miles=200;
        //step2
        final double MILE_TO_KILOMETER=1.609;
        //Step3
        double kilometer= miles*MILE_TO_KILOMETER;
        //STEP4
        System.out.println("Kilometer is "+ kilometer);
    }
}
