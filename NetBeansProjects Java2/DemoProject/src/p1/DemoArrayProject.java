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
import java.util.*;
public class DemoArrayProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create array to keep 3 circle
        Circle[] circleArray=new Circle[3];
        Circle c1 = new Circle();
        circleArray[0]=c1;
        System.out.println("CircleArray[0]=> "+ circleArray[0]);
        System.out.println("c1 =>"+ c1);
        System.out.println("c1.getRadius() =>"+ c1.getRadius());
        System.out.println("circleArray[0].getRadius =>"+ circleArray[0].getRadius());
        circleArray[1] = new Circle(5);
        System.out.println("circleArray[1].getRadius => "+circleArray[1].getRadius());
        
        //create an array with 2 circle object(r=5,r=10)
        Circle [] circleArray2 = {new Circle(5),new Circle(10)};
        //display radius for circle object in circleArray2
        System.out.println("circle's radius in circleArray2: ");
        for(int i=0;i<circleArray2.length;i++){
            System.out.println(circleArray2[i].getRadius());
        }
        
//            Circle[] array = new Circle[2];
//            Scanner input = new Scanner(System.in);
//            for(int i=0; i<2; i++){
//                Circle circle = new Circle();
//                System.out.println("Enter radius: ");
//                int radius = input.nextInt();
//                circle.setRadius(radius);
//                array[i] = new Circle(radius);
//            }
    }
    
}
