/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structures;

/**
 *
 * @author William
 */
public class TestCoding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num [] = {10,15,10,20,25,20,5,5,30,35,5,90,60,78,36,5};
        //Arrays.sort(num);//arranged array value
        //System.out.println(getMin(num));
        //getMin(num);
        //System.out.println(num[0]);
        int min = num[0];
        for(int i=0; i<10;i++){
            if(min > num[i]){
                min = num[i];
            }
        }
        int [] number = removeMin(min,num);
        //int [] number = delete(min,num);
        for(int i=0;i<number.length;i++){
            System.out.println(number[i]+" ");
        }
    }
    public static int [] removeMin(int num,int [] num1){
        int count = count(num,num1);
        int [] newNum = new int[num1.length - count];
        int index = 0;
        for(int a:num1){
            if(a!=num){
                newNum[index] = a;
                index++;
            }
        }
        return newNum;
    }
//    
    
    public static boolean delete(int value,int [] num3){
        int nElems = 10;
        num3=new int[nElems];
        int j;
        for(j=0;j<num3.length;j++){
            if(value == num3[j]){
                break;
            }
        }
        if(j==num3.length){
            return false;
        }else{
            for(int k=0;k<num3.length;k++){
                num3[k]=num3[k+1];
            }
            nElems--;
            return true;
        }
    }
    
    public static int count(int value,int [] num){
        /*calculate occurrance*/
        int count=0;
        int i;
        for(i=0;i<num.length;i++){
            if(num[i] == value){
                count++;
            }
        }
        return count;
    }
    
    /*public void int []  delete(int value,int [] num3){
        int k;
        int nElems = 10;
        num3=new int[nElems];
        int j;
        for(j=0;j<num3.length;j++){
            if(value == num3[j]){
                break;
            }
        }
        if(j==num3.length){
            return num3;
        }else{
            for(k=0;k<num3.length;k++){
                num3[k]=num3[k+1];
            }
            nElems--;
            return num3;
        }
    }*/
    
    /*public static int count (int value, int [] num2){
        int count = 0;
        for(int a: num2){
            if(a == valuemin){
                count++;//appearance of min value
            }
        }
        return count;
    }*/
}
