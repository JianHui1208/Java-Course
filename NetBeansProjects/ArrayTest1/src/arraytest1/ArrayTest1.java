/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytest1;

/**
 *
 * @author William
 */
import java.util.*;
public class ArrayTest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //老师一开始讲怎样用Array
        char [] aList = {'a','b'};
        String [] bList = {"A","B"};
        int [] cList={1,2,3};
        double [] dList={1.4,2};
        boolean [] eList ={true,false};
        byte [] gList = {2,4,-1,-2};
        System.out.println(aList[0]);
        String [] oList={"plpl","OKOK"};
        oList[0]="POPO";
        System.out.println(oList[0]);
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
        System.out.println(cars[i]);
        }
        String[] carqs = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String R : carqs) {
        System.out.println(R);
        }
        ali();
        abu(0,0);
    }
    public static void ali(){
        Scanner input =new Scanner(System.in);
        
        System.out.print("Enter the Number 1: ");
        int a=input.nextInt();
        System.out.print("Enter the Number 2: ");
        int b=input.nextInt();
        int total=0;
        abu(a,b);
        total = a+b;
        System.out.print(total+"\n");
    }
    public static void abu(int a, int b){
        System.out.print(a+"\n");
        System.out.print(b+"\n");
    }
}
