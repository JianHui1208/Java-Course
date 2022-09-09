package polymorphism;

public class TestPolymorphismCasting {
  /** Main method
     * @param args */
  public static void main(String[] args) {
    // Declare and initialize two objects
    Object object1 = new Circle(1);
    Object object2 = new Rectangle(1, 1);

    // Display circle and rectanlge
    displayObject(object1);
    displayObject(object2);
  }

  /** A method for displaying an object
     * @param object */
  public static void displayObject(Object object) {
    if (object instanceof Circle) {
      System.out.println("The circle area is " +
        ((Circle)object).getArea());
      System.out.println("The circle diameter is " +
        ((Circle)object).getDiameter());
      System.out.println(object instanceof Circle);
    }
    else if (object instanceof Rectangle) {
      System.out.println("The rectangle area is " +
        ((Rectangle)object).getArea());
      System.out.println(object instanceof Circle);
    }
  }
}
