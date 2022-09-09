/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computearea;

/**
 *
 * @author William
 */
import java.util.*;
public class ComputeArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int number =0;
        double Area1=0;
        double Area2=0;
        double Area3=0;
        double Area4=0;
        System.out.println("Calculate Area");
        System.out.println("----------------------------");
        System.out.println("1.Rectangle");
        System.out.println("2.Square");
        System.out.println("3.Triangle");
        System.out.println("4.Circle");
        System.out.println("5.Exit");
        while(number!=5){
        System.out.println("----------------------------");
        System.out.print("Select Function: ");
        number = input.nextInt();
        switch(number){
            case 1:calculateRectangle(Area4);break;
            case 2:calculateSquare(Area3);break;
            case 3:calculateTriangle(Area2);break;
            case 4:calculateCircle(Area1);break;
            case 5:System.out.println("Bye!");System.exit(0);break;
            default:System.out.println("Not in fountion pls enter angin.Wrong number");
            }
        }
    }
    public static double calculateRectangle(double Area4){
        Scanner input = new Scanner(System.in);
        double a=0;
        double b=0;
        System.out.println("----------------------------");
        System.out.println("Select: 1");
        System.out.print("Enter Width: ");
        a = input.nextInt();
        System.out.print("Enter Height: ");
        b = input.nextInt();
        Area4=a*b;
        Display("Recrangle",Area4);
        return Area4;
    }
    
    public static double calculateSquare(double Area3){
        Scanner input = new Scanner(System.in);
        double a=0;
        System.out.println("----------------------------");
        System.out.println("Select: 2");
        System.out.print("Enter Side length: ");
        a = input.nextInt();
        Area3=a*a;
        Display("Square",Area3);
        return Area3;
    }
    
    public static double calculateTriangle(double Area2){
        Scanner input = new Scanner(System.in);
        double a=0;
        double b=0;
        System.out.println("----------------------------");
        System.out.println("Select: 3");
        System.out.print("Enter Base: ");
        a = input.nextInt();
        System.out.print("Enter Height: ");
        b = input.nextInt();
        Area2=0.5*a*b;
        Display("Triangle",Area2);
        return Area2;
    }
    
    public static double calculateCircle(double Area1){
        Scanner input = new Scanner(System.in);
        double a=0;
        System.out.println("----------------------------");
        System.out.println("Select: 4");
        System.out.print("Enter Radius: ");
        a = input.nextInt();
        Area1 =3.1415*a*a;
        Display("Circle",Area1);
        return Area1;
    }
    public static void Display(String Shaqe,double Area){
        System.out.println("The Area for the "+Shaqe+" is "+Area);
    }
}
