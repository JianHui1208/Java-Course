/**
 * @(#)Circle.java
 *
 *
 * @author 
 * @version 1.00 2010/4/11
 */


public class Circle {
	//attribute
	private double radius = 1.0;

	//default constructor
    public Circle() {
    	radius = 5.0;
    }
    
    //constructor with parameter
    public Circle(double newRadius){
    	radius = newRadius;
    }
    //getRadius
    public double getRadius(){
    	return radius;
    }
    //setRadius
    public void setRadius(double newRadius){
    	radius = newRadius;
    }    
    //user-defined method
    public double findArea(){
    	return radius * radius * 3.14159;
    }
    public void printCircle(){
    	System.out.println("Radius:" + getRadius());
        System.out.println("Area:" + findArea());
    }   
    
}
