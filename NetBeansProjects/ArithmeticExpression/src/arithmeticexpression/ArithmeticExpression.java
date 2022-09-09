/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmeticexpression;

import static java.time.Clock.system;

/**
 *
 * @author William
 */
public class ArithmeticExpression {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //写公式的
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 5;
        int r = 6;
        
        System.out.println(4/(3*(r+34))-9*(a+b*c)+(3+d*(2+a))/(a+b*d));
        
    }
    
}
