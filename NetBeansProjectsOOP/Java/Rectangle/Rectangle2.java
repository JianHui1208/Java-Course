/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;
import java.util.*;
/**
 *
 * @author User
 */
public class Rectangle2 {
    private int length;
    private int width;
    private static int numRectangle = 0;
    
    public Rectangle2(){
        numRectangle += 1;
    }
    public Rectangle2(int length, int width){
        this.length = length;
        this.width = width;
}
    
    public void setLength(int length){
        this.length = length;
    }
    
    public void setWidth(int width){
        this.width = width;
    }
    
    public int getWidth(){
        return width;
    }
    
    public int getLength(){
        return length;
    }
    
   public int getNumRectangle(){
       return numRectangle;
   }
    
    public int calArea(){
        return width*length;
    }
    
    
    
    public Rectangle dimSwitchedRect(Rectangle2 rect1){
        Rectangle rect2 = new Rectangle();
    
        rect2.setWidth(rect1.getWidth());
        rect2.setLength(rect1.getLength());
        return rect2;
    }
    
public boolean equals(Rectangle2 rect2)
{
   boolean status;

   if( width == rect2.getWidth() && length == rect2.getLength())
      status = true;
   else
      status = false;
   return status;
}


     public static void main(String[] args) {
        // TODO code application logic here
 //step2
 
  Scanner value = new Scanner(System.in);
    
    System.out.print("Rectangle 1 \n");
    System.out.print("The length of Rectangle 1\n");
    int length1 = 2;
    System.out.print("The width of Rectangle 1\n");
    int width1 = 6;
    
    /*System.out.print("Rectangle 2 \n");
    System.out.print("The length of Rectangle 2\n");
    int length2 = 2;
    System.out.print("The width of Rectangle 2\n");
    int width2 = 6;*/
    
    System.out.print("Rectangle 3 \n");
    System.out.print("The length of Rectangle 3\n");
    int length3 = 3;
    System.out.print("The width of Rectangle 3\n");
    int width3 = 5;
    
    Rectangle2 rect1 = new Rectangle2(length1 , width1);
  //  Rectangle rect2 = new Rectangle(length2 , width2);
    Rectangle2 rect3 = new Rectangle2(length3, width3);
    
    ArrayList<Rectangle2> arrRect = new ArrayList<Rectangle2>();

    arrRect.add(rect1);
    Rectangle2 rect2 = rect1.dimSwitchedRect(rect1);
    //arrRect.add(rect2);
    arrRect.add(rect2);
    arrRect.add(rect3);
    
    
    
      for (int k =0; k<arrRect.size();k++){
        int area = arrRect.get(k).calArea();
        System.out.print("Area of Rectangle"+(k+1)+"="+area+"\n");
     }
}   
} 


