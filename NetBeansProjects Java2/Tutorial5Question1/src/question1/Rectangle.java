/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author William
 */
public class Rectangle {
    double width,length;
    double Area,Perimeter;
    public Rectangle(){
    
    }
    public Rectangle(double newWidth, double newLength){
        setWidth(newWidth);
        setLength(newLength);
    }

    public void setWidth(double newWidth){
        width = newWidth;
    }
    
    public void setLength(double newLength){
        length = newLength;
    }
    
    public double getArea(){
        Area = length*width;
        return Area;
    }
    
    public double getPerimeter(){
        Perimeter = (length*2)+(width*2);
        return Perimeter;
    }
}
