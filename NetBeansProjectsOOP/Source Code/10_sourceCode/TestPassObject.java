/**
 * @(#)TestPassObject.java
 *
 *
 * @author 
 * @version 1.00 2010/4/11
 */


public class TestPassObject {
	//main method
	public static void main (String[] args){
		Circle myCircle = new Circle(1);
		
		//print area for radius 1,2,3,4 and 5
		int n = 5;
		printArea(myCircle, n);
		
		//See myCircle.radius and times
		System.out.println("\n"+"Radius is " + myCircle.getRadius());
		System.out.println("n is "+n);
	}
	
	public static void printArea(Circle c, int times){
		System.out.println("Radius \t\tArea");
		while(times >= 1){
			System.out.println(c.getRadius() + "\t\t" + c.findArea());
			c.setRadius(c.getRadius()+1);
			times--;
		}
	}
    
}