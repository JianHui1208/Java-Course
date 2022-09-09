/**
 * @(#)TestSimpleCircle.java
 *
 *
 * @author 
 * @version 1.00 2010/4/11
 */


public class TestSimpleCircle {   
   
    public static void main(String[] args) {
       	Circle myCircle = new Circle();
       	//set radius = 2.0 using setter method
       	System.out.println("Original: "+ myCircle.getRadius());
		myCircle.setRadius(2.0);
		System.out.println("Radius: "+myCircle.getRadius());
		System.out.println("Area: "+myCircle.findArea());
		
    }
    
}

