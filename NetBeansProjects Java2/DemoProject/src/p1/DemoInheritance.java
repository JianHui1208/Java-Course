/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author William
 */
public class DemoInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cylinder cylinder = new Cylinder();
        System.out.println("radius: "+cylinder.getRadius());
        System.out.println("length: "+cylinder.getlenght());
        System.out.println("area: "+cylinder.findArea());
        System.out.println("static method: "+Cylinder.getnumberProject());
        System.out.println("static method: "+Circle.getnumberProject());
    }
    
}
