/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;
import p1.Circle;
/**
 *
 * @author William
 */
public class DemoProtected extends Circle{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle c = new Circle(5);
//        System.out.println(c.radius);
        
        DemoProtected test = new DemoProtected();
        System.out.println(test.radius);

    }
    
}
