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
import java.util.Scanner;
public class DemoPassProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //pass variable by value(primitive type)
        //pass variable by reference(object)
        Circle c1=new Circle (5);
        System.out.println("c1.getRadius(): "+c1.getRadius());//c1.getRadius=5
	int number=10;
	System.out.println(number);
        display(c1.getRadius(),c1);// call mothod
        System.out.println("main method: ");       
        System.out.println("c1.getRadius(): "+c1.getRadius());//10
    }
    
    public static void display(double r,Circle c){
        System.out.println("r: "+r);//5
        System.out.println("c.getRadius(): "+c.getRadius());//c.getRadius=5
        r=10;
        c.setRadius(10);
        System.out.println("r: "+r);//r=10
        System.out.println("c.getRadius(): "+c.getRadius());//c.getRadius=5
        
        
    }
    
}
