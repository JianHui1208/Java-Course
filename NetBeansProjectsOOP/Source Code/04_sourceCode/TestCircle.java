public class TestCircle {   
   
    public static void main(String[] args) {
       Circle c1 = new Circle();
       Circle c2 = new Circle(9.0);
       c1.setRadius(4.0);      
      System.out.println("Radius:" + c1.radius);
      System.out.println("Area:" + c1.findArea());
      System.out.println("Radius:" + c2.getRadius());
      System.out.println("Area:" + c2.findArea());
    }
}

