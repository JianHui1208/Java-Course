/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author William
 */
public class TEST {
        public static int[] qsort(int arr[],int start,int end) {        
        int pivot = arr[start];        
        int i = start;        
        int j = end;        
        while (i<j) {            
            while ((i<j)&&(arr[j]>pivot)) {                
                j--;            
            }            
            while ((i<j)&&(arr[i]<pivot)) {                
                i++;            
            }            
            if ((arr[i]==arr[j])&&(i<j)) {                
                i++;            
            } else {                
                int temp = arr[i];                
                arr[i] = arr[j];                
                arr[j] = temp;            
            }        
        }        
        if (i-1>start) arr=qsort(arr,start,i-1);        
        if (j+1<end) arr=qsort(arr,j+1,end);        
        return (arr);    
    }    
 
    public static void main(String[] args) {        
        int arr[] = new int[]{78,45,32,98,23,87,76,16,55,65};        
        int len = arr.length-1;        
        arr=qsort(arr,0,len);        
        for (int i:arr) {            
            System.out.print(i+"\n");        
        }    
    }
    
}
