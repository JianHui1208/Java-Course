public class Cylinder extends Circle {
  private double length = 1;

  /** Return length */
  public double getLength() {
    return length;
  }

  /** Set length */
  public void setLength(double length) {
    this.length = length;
  }

  /** Return the volume of this cylinder */
  public double findVolume() {
    return findArea() * length;
  }
}