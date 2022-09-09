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
import java.util.Scanner;
import p1.Circle;
public class testCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //short long byte int double float boolean char
        //new(object)() **default constructor method**
        int i=1;
        System.out.println("Value i: "+ i);
        int j=2;
        i=j;
        System.out.println("Value i: "+ i);
        j=3;
        System.out.println("Value i: "+ i);
        System.out.println("Value j: "+ j);
        
        Circle c1=new Circle(5);
        System.out.println("value c1: "+ c1);
        System.out.println("value c1 radius: "+c1.getRadius());
        
        Circle c2=new Circle(9);
        System.out.println("value c2: "+ c2);
        System.out.println("value c2 radius: "+c2.getRadius());
        
        c1.setRadius(100);
        
        System.out.println("c1 radius: "+c1.getRadius());
        System.out.println("c2 radius: "+c2.getRadius());
        System.out.println("c2 radius: "+c1.findArea());
        
        Scanner input=new Scanner(System.in);
        System.out.print("Enter radius: ");
        int radius=input.nextInt();
        Circle c3=new Circle(radius);
        System.out.println("Area is :"+c3.findArea());
    }
    
}
