/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removeduplicate.array;

/**
 *
 * @author William
 */
import java.util.*;
public class RemoveDuplicateArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int [] number=new int[10];
        for(int a=0;a<number.length;a++){
            System.out.print("Enter the 10 number: ");
            number[a]=input.nextInt();
        }
        System.out.println("Output: ");
        int[] result=removeDuplicate(number);
        for(int i=0;i<result.length;i++){
            if(result[i]==0){
                break;
            }
            System.out.println(result[i]+" ");
        }
    }
    public static int[] removeDuplicate(int [] x){
        int [] aList=new int[10];
        int count=0;
        for(int a=0;a<x.length;a++){
            boolean duplicate=false;//test he has repeat
            for(int b=0;b<x.length;b++){
                if(x[a]==aList[b]){
                duplicate=true;
                break;
                }
            }
            if(!duplicate){
                aList[count]=x[a];
                count++;
            }
        }return aList;
    }
}
