
//extends => subclass only extends 1 superclass
//implements => Circle = subclass, Comparable = superclass
public class Circle implements Comparable{
	 protected double radius = 1.0;

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
    
    @Override
    public String toString(){
        return radius +" "+ findArea();
    }
    
    //override compareTo()
    /*
    compare 2 Circle objects? Compare radius
    1  radius in object 1 > radius in object 2
    -1 radius in object 1 < radius in object 2
    0 radius in object 1 == radius in object 2
    */
//    public int compareTo(Object object2){
//        //Object object1 = this;
//        Circle c2 = (Circle) object2;
//        if(this.getRadius() > c2.getRadius()){
//            return 1;
//        }else if(this.getRadius() < c2.getRadius()){
//            return -1;
//        }else{
//            return 0;
//        }
//    }
    
    /*
    compare radius
    return differences between the radius value in obj1 & obj2
    */
    public int compareTo(Object object2){
        Circle c2 = (Circle) object2;
        double dif = findArea() - c2.findArea();
        return (int)dif;
    }
}
