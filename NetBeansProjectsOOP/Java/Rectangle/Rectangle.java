/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
/*public class Rectangle {
    private int length;
    private int width;
    private static int numRectangle = 0;
    
    public Rectangle(){
        numRectangle += 1;
    }
    public Rectangle(int length, int width){
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
    
    
    
    public Rectangle dimSwitchedRect(Rectangle rect1){
        Rectangle rect2 = new Rectangle();
    
        rect2.setWidth(rect1.getWidth());
        rect2.setLength(rect1.getLength());
        return rect2;
    }
    
public boolean equals(Rectangle rect2)
{
   boolean status;

   if( width == rect2.getWidth() && length == rect2.getLength())
      status = true;
   else
      status = false;
   return status;
}

public String toString(){
    return this.length + " " + this.width;
}


     public static void main(String[] args) {
        // TODO code application logic here
    
   
    ArrayList<Rectangle> arrRect = new ArrayList<Rectangle>();

    Rectangle rect1 = new Rectangle(2 , 6);
    Rectangle rect2 = rect1.dimSwitchedRect(rect1);
    Rectangle rect3 = new Rectangle(3, 5);
    
    arrRect.add(rect1);
    arrRect.add(rect2);
    arrRect.add(rect3);
    
      for (int k =0; k<arrRect.size();k++){
        int area = arrRect.get(k).calArea();
        System.out.print("Area of Rectangle"+(k+1)+"="+area+"\n");
     }
      
     }}*/


/*package rectangle;
import java.util.*;
/**
 *
 * @author User
 */
public class Rectangle {

    public  int length;
    public  int width;
    static Rectangle rectangle = new Rectangle();
    static ArrayList<Rectangle> arrRect = new ArrayList();
    
    public Rectangle(){
        
    }

public Rectangle(int length, int width){
    this.length = length;
    this.width = width;
}

public void setLength(int length){
    this.length = length;
}

public int getLength(){
    return length;
}

public void setWidth(int width){
    this.width= width;
}

public int getWidth(){
    return width;
}

public int calcArea(){
    return length*width;
}


    /*
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
 //step2
 
  Scanner value = new Scanner(System.in);
    
    System.out.print("Rectangle 1 \n");
    System.out.print("Enter the length\n");
    int length1 = value.nextInt();
    System.out.print("Enter the width\n");
    int width1 = value.nextInt();
    
    System.out.print("Rectangle 2 \n");
    System.out.print("Enter the length\n");
    int length2 = value.nextInt();
    System.out.print("Enter the width\n");
    int width2 = value.nextInt();
    
    System.out.print("Rectangle 3 \n");
    System.out.print("Enter the length\n");
    int length3 = value.nextInt();
    System.out.print("Enter the width\n");
    int width3 = value.nextInt();
 
   
    Rectangle rect1 = new Rectangle(length1 , width1);
    Rectangle rect2 = new Rectangle(length2 , width2);
    Rectangle rect3 = new Rectangle(length3 , width3);

//step3
    ArrayList<Rectangle> arrRect = new ArrayList<Rectangle>();

    arrRect.add(rect1);
    arrRect.add(rect2);
    arrRect.add(rect3);
    
   
    
    for (int k =0; k<arrRect.size();k++){
        int area = arrRect.get(k).calcArea();
        System.out.print("Area of Rectangle"+(k+1)+"="+area+"\n");
    }
}
}
