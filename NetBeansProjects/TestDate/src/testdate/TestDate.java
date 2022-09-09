/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdate;

/**
 *
 * @author William
 */
import java.util.*;
public class TestDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*double[] LOLO = {1.9, 2.9, 3.4, 3.5};
 
      // 打印所有数组元素
      for (double PPP: LOLO) {
         System.out.println(PPP);
      }
    }
    public static void ArrayMethods(){
        double[] myList = {1.9, 2.9, 3.4, 3.5};
 
      // 打印所有数组元素
      for (int i = 0; i < myList.length; i++) {
         System.out.println(myList[i] + " ");
      }
      // 计算所有元素的总和
      double total = 0;
      for (int i = 0; i < myList.length; i++) {
         total += myList[i];
      }
      System.out.println("Total is " + total);
      // 查找最大元素
      double max = myList[0];
      for (int i = 1; i < myList.length; i++) {
         if (myList[i] > max) max = myList[i];
      }
      System.out.println("Max is " + max);
    }
    public static void DisplayDate(){
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);
        int dow = cal.get(Calendar.DAY_OF_WEEK);
        int dom = cal.get(Calendar.DAY_OF_MONTH);
        int doy = cal.get(Calendar.DAY_OF_YEAR);
 
        System.out.println("当期时间: " + cal.getTime());
        System.out.println("日期: " + day);
        System.out.println("月份: " + month);
        System.out.println("年份: " + year);
        System.out.println("一周的第几天: " + dow);  // 星期日为一周的第一天输出为 1，星期一输出为 2，以此类推
        System.out.println("一月中的第几天: " + dom);
        System.out.println("一年的第几天: " + doy);*/
        Scanner input = new Scanner(System.in);
        double [] vals = new double[10];
        System.out.print("Please enter to double value: ");
        for(int i=0;i<vals.length;i++){
            vals[i] = input.nextDouble();
            
            System.out.println("The Average is: " + average(vals));
            System.out.print("Enter the next number: ");
        }
        
        int [] val = new int[10];
        System.out.print("\nPlease enter to int value: ");
        for(int i=0;i<val.length;i++){
            val[i] = input.nextInt();
            
            System.out.println("The Average is: " + averge(val));
            System.out.print("Enter the next number: ");
        }
    }
    public static int averge(int[] array){
        int sum = 0;
        for(int val : array){
            sum+=val;
        }
        return sum/array.length;
    }
    public static double average(double[] array){
        double sum =0.0;
        for(double val : array){
            sum+=val;
        }
        return sum/array.length;
    }
        
 }
   
