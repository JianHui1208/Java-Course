//superclass
public class Circle {
	// instance variable
	private double radius;

	// constructors
	public Circle() {
		radius = 1.0;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	// accessor method
	public double getRadius() {
		return radius;
	}

	// mutator method
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double findArea() {
		return radius * radius * 3.14159;
	}
}
