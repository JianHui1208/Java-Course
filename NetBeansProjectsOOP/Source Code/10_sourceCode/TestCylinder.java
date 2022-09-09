
public class TestCylinder {

    public static void main (String[] args) {
    	Cylinder cylinder = new Cylinder();
		System.out.println("The length is " +  
    	cylinder.getLength());
		System.out.println("The radius is " + 
    	cylinder.getRadius());
		System.out.println("The volume of the cylinder is " +
    	cylinder.findVolume());
		System.out.println("The area of the circle is " +
    	cylinder.findArea()); 

	}
    
    
}