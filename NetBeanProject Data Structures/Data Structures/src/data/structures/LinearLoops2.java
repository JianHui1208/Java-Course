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
public class LinearLoops2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int LIMIT = 25;
        int count = 0;
        do{
            count = count + 1;
            System.out.println(count);
        }while(count < LIMIT);
        System.out.println("Done");
    }
    
}
