public class Cylinder2 extends Circle {
	private double length;

	// constructor
	public Cylinder2() {
		super();
		length = 1.0;
	}

	public Cylinder2(double radius, double length) {
		super(radius);
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double findArea() {
		return 2 * super.findArea() + 2 * getRadius() * Math.PI * length;
	}

	public double findVolume() {
		return super.findArea() * length;
	}

	public String toString() {
		return "Cylinder area= " + findArea() + "\nvolume=" + findVolume();
	}
}
