/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoproject;

/**
 *
 * @author William
 */
import p1.Circle;
import java.util.Scanner;
public class DemoProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number1=10;
        int number2=20;
        // create two circle object
        Circle c1;
        c1 = new Circle();
        Circle c2 = new Circle(50);
        
        c1.setRadius(100);
        System.out.println("c1 radius: "+c1.getRadius());
        System.out.println("c2 radius: "+c2.getRadius());
        System.out.println("c2 radius: "+c1.findArea());
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter radius: ");
        int radius=input.nextInt();
        Circle c3=new Circle(radius);
        System.out.println("Area is :"+c3.findArea());
        
        Circle c4=new Circle();
        System.out.println(c4.getRadius());
    }
    
}
