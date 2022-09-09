/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author William
 */
//subclass extends superclass
//subclass inherit superclass
//Cylinder class inherit Circle class
//extends at most 1 superclass//1324
public class Cylinder extends Circle {
    //subclass can inherit all data/method from superclass
    //except:
    //1) private data/method
    //2) constructor
    
    //add new data
    private double length;
    
    //overload method => same method name but different Parameter
    //default constructor
    public Cylinder(){
        //super and this cannot together
        //auto-gen call superclass constructor =>default const.
//        super (5);//super() =>Circle()
        this(10);//Cylinder()
    }
    public Cylinder (double length){
        super(5);
        setLength(length);
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getlenght(){
     return length;
    }
    //override method => replace the same method as the method in supercalss
    //same method signature => same method name,same parameter
    @Override//check the method has at the super class
    public double findArea(){
        double area = 2*super.PI*super.getRadius()*getlenght()
                + 2*super.PI*getRadius()*getRadius();
                //+ 2*super.findArea();
        return area;
    }
    public static int getnumberProject(){
        return 999;
    }
    @Override
    public String toString(){
        String Message = "\n" + super.toString()
                + "\nLength: " + getlenght();
        return Message;
    }
}
