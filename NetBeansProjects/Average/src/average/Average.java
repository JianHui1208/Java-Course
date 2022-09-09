/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package average;

/**
 *
 * @author William
 */
import java.util.*;

public class Average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//不知道为什么我会用这个code 怪怪的 不懂是上网哪里找的 你想看看我们有没有用过这个code
//或者这个另一种scanner的写法???        
/*Scanner aaa;
        aaa = new Scanner(System.in);
        
        Scanner bbb;
        bbb = new Scanner(System.in);
        
        float a,b;
        float avg;
        
        System.out.print("Enter Frist Number:");
        a=aaa.nextFloat();
        
        System.out.print("Enter Second Number:");
        b=aaa.nextFloat();
        
        //Calculate Sum and Average
        avg = ((a+b)/2);
        
        System.out.print("Average : " + avg);*/
        //新的在这里
        double avg=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Frist Number: ");
        int a = input.nextInt();
        System.out.print("Enter Second Number: ");
        int b = input.nextInt();
        
        //count avg
        avg=(a+b)/2;
        
        System.out.println("Average: " +avg);
    }
    
}
