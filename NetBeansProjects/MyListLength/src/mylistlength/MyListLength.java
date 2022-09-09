/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylistlength;

/**
 *
 * @author William
 */
import java.util.*;
public class MyListLength {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Scanner input = new Scanner(System.in);
        double[] myList = new double[30];
        System.out.print("Enter " + myList.length +" values: ");
        //set using random valus
        for(int i=0; i<myList.length;i++){
            myList[i] = Math.random()*100;
        }
        //find total/sum all element
        double total = 0;
        for(int i=0;i<myList.length;i++){
            total+=myList[i]; //total=total+myList[i]
        }
        System.out.println("Total is " +total);
        //find largest & smallest element
        double max = myList[0];
        double min = myList[0];
        for(int i=0;i<myList.length;i++){
            if(myList[i]>max){
                max = myList[i];
            }
            if(myList[i]<min){
                min = myList[i];
            }
        }
        System.out.println("Largest is " +max);
        System.out.println("Smallest is " +min);
        //display all element
        for(int i=0;i<myList.length;i++){
            System.out.println(myList[i] +" ");
        }*/
        
        int [] aList={2,6,5,8,9};
        sum(aList);
        aList=wash(aList);
        for(int a=0;a<aList.length;a++){
            System.out.println(aList[a]);
        }
    }
    public static void sum(int [] aList){
        for(int total=0;total<aList.length;total++){
            System.out.println("Total is " +total);
        }
}
    public static int[] wash(int[]aList){
        for(int a=0;a<aList.length;a++){
        int temp = aList[a];
        int index = (int)(Math.random()*aList.length);
        aList[a] = aList[index];
        aList[index]=temp;
        }
        return aList;
    }
} 

