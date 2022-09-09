/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traceprogramwitharrays;

/**
 *
 * @author William
 */
public class TraceProgramWithArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //TraceProgramWithArrays
        int[] values = new int[5];
         for(int i=1;i<5;i++){
             values[i] = i + values[i-1];
         }
         values [0] = values[1]+values[4];
         System.out.println(values[0]);
         
        //新的一题(Trace the reverse Method,cont.)
        
        int[] list1 = {1,2,3,4,5,6};
        int[] list2 = reverse(list1);
    }
    public static int[] reverse(int[] list){
        int[] result = new int[list.length];
        
        for(int i=0,j=result.length-1; i<list.length;i++,j--){
            result[j] = list[i];
            System.out.println(result[j]+" , "+list[i]);
        }
        return result;
        }
}
