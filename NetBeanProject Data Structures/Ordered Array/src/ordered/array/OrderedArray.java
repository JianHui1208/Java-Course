/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordered.array;
import java.util.Arrays;
/**
 *
 * @author William
 */
public class OrderedArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double sum = 0;
        int A = 0;
        int P = 0;
        double [] array = {792,1184.9,54,126,915.8,456.4,300,663.3,270,136,130.9,
            688.2,506.8,30,115.9,312};
        int [] array1 = {103,173,149,193,169,29,188,19,201,58,110,83,60,25,60,190};
        double [] array2 = {1.5,2,2.1,2.5,2.5,0.5,2.3,0.3,2.7,1,1.5,1.2,0.8,0.4,1.8,2.9};
        double [] array3 = {233,289,45,70,241,163,120,201,135,80,77,222,181,30,61};
        double [] array4 = {3.4,4.1,1.2,1.8,3.8,2.8,2.5,3.3,2.0,1.7,1.7,3.1,2.8,1,1.9,2.6};
        for(int i = 0; i < array1.length;i++){
            P = array1[i] * array1[i];
//            sum = sum + array4[i];
            A = A + P;
            System.out.println(P);
        }
        System.out.println(A);
//        System.out.println(sum);
//        System.out.println();
//        System.out.println(A);
//        Arrays.sort(array);
//        System.out.printf(Arrays.toString(array));
        
    }
    
}
