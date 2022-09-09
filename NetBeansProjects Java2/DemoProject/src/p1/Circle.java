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
public class Circle extends DemoProject{
    //declare attributes/property/state
    //class variable
    protected double radius;//default value for number=>0
    char character;
    boolean booleandata;//default value is false
    String color;
    
    //constant variable
    final double PI=3.1415;
    static final double PI1=3.1425;
    
    //keep track the total number of circle object
    static int numberProject=0;
    
    //constructor method
    /*
    1)method name = class name
    2)no return type = no void
    */
    //default constructor
    //3)no argument / parameter
    // 3 visibility modifier=>default,private,public
    public Circle(){
        radius=99.0;
        //this(1)=>Circle(1)
    }
    public Circle (double newRadius){
        radius=newRadius;
        setRadius(newRadius);
        numberProject++;
    }
    public void setRadius(double newRadius){
        if(newRadius>0){
            this.radius=newRadius; //this.radius=>Circle.radius
            //radius=newRadius; radius is local variable
        }
    }
    public double getRadius(){
        return radius;
    }
    public double findArea(){
        double area = PI * this.getRadius() * radius;
        //this.getRadius()=>Circle.getRadius
        return area;
    }
    //getter method for numberProject=>return numberProject
    //no static
    public static int getnumberProject(){
        return numberProject;
    }
    
    //override toString() Object class
    @Override
    public String toString(){
        String Message = "Radius: " + getRadius() + "\nArea: " + findArea();
        return Message;
    }
}
