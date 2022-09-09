/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structures;

/**
 *
 * @author William
 */
public class QuadraticLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int LIMIT1 = 5;
        final int LIMIT2 = 5;
        
        for(int count = 1; count <= LIMIT1; count++){
            for(int i = 1; i <= LIMIT2; i++){
                System.out.println(i + count);
            }
        }System.out.println("Done");
    }
    
}
