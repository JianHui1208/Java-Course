/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William
 */
public class Class {
    public Class(){}
    
    public static int Min(int B,int[] Array){
        int count=0;
        for(int p=0;p<Array.length;p++){
            if(Array[p]==B){
                count++;
            }
        }
        return count;
    }
    
    public static int[] removeMin(int[] Array1, int P){
        int count=Min(P,Array1);
        int[] Array2=new int[Array1.length-count];
        int remove=0;
        for(int y:Array1){
            if(y!=P){
                Array2[remove]=y;
                remove++;
            }
        }
        return Array2;
    }
}
