/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestAnythings;

/**
 *
 * @author William
 */
public class ArrayClass {
    int a = 0;
    int []Array = new int[10];
    public ArrayClass(){}
    
    public int[] insert(int number){
        for(int i = 0;i < Array.length;i++){
            Array[i] = number;
        }
        return Array;
    }
    
    public int[] display(){
        for(int j = 1;j < Array.length;j++){
            System.out.println(Array[j]);
        }
        return Array;
    }
}
