/**
 * @(#)TestSimpleCircle.java
 *
 *
 * @author 
 * @version 1.00 2010/4/11
 */


public class TestPassCircle {   
   
    public static void main(String[] args) {
       Circle c1 = new Circle(5.0);
       Circle c2 = new Circle();
       //call printCircle method
       System.out.println("Before: Radius:" + c1.getRadius()); 
       int a = 1;
       printCircle(c1,a);
       System.out.println("After: Radius:" + c1.getRadius()); 
       	System.out.println("After: a:" + a); 
       	
       //printCircle(c2);
    }
    
    //method to print Circle 's object
    public static void printCircle(Circle c, int a){
    	System.out.println("Area:" + c.findArea());
    	System.out.println("Radius:" + c.getRadius());   	
    	c.setRadius(10);
    	a = 3;
    }
    
}

