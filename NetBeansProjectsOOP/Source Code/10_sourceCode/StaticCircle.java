/**
 * @(#)Text1.java
 *
 *
 * @author 
 * @version 1.00 2010/4/16
 */

public class StaticCircle {
	//attribute
	private double radius =1.0;
	
	//the number of the objects created
	private static int numberOfObjects=0;

	//default constructor
    public StaticCircle() {
      numberOfObjects++;
    }
    
    //constructor with parameter
    public StaticCircle(double newRadius){
    	radius = newRadius;
    	 numberOfObjects++;
    }
    //return numberOfObjects
    public static int getNumberOfObjects(){
    	return numberOfObjects;
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


    
