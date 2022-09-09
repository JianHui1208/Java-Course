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
public class DemoProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle c = new Circle(5);
        System.out.print(c.radius);//can access proitected radius
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(10);
        cylinder.setLength(5);
        System.out.println(cylinder.toString());
    }
    
}
