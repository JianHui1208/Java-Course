/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countoccurrenceofnumbers;

/**
 *
 * @author William
 */
import java.util.*;
public class CountOccurrenceOfNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int[] count = new int[100];
        int POPO;
        int BOBO = 0;
        System.out.print("Enter the integers between 1 and 100: ");
        do{
            POPO = input.nextInt();
            count[BOBO]=POPO;
            BOBO+=1;
        }
        while(POPO!=0);
        countOccurence(count);
    }
    public static void countOccurence(int[] list){
        for(int a=1;a<=100;a++){
            int count=0;
            for(int b=0;b<list.length-1;b++){
                if(list[b]==a)
                    count+=1;
            }
            if(count!=0){
                System.out.printf("%d occurs %d %s%n", a ,count,count>1?
                        "times":"time");
            }
        }
    }
}
