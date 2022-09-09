/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test123;

/**
 *
 * @author William
 */
public class Test123 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Stock c1 = new Stock();
        c1.setSymbol(1001);
        c1.setName("AirAsia");
        c1.setpreviousClosingPrice(2.85);
        c1.setCurrentPrice(2.75);
        
        System.out.println(c1.toString());
    }
    
}
