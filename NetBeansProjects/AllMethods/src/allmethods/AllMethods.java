    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allmethods;

/**
 *
 * @author William
 */
import java.util.*;
public class AllMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //call no return no parament
        a();
        //call got return int value no paremeter
        double YYY=b();
        //call no return got paremeter
        c(5,6);
        //call got return got paremeter
        int d=d(0,"WOWO");
        
//        int X = 10;
        int Y = 9;
        System.out.println(Y < 100);
    }
    //no return no parament
    public static void a(){
        System.out.println("ALI lolol");
    }
    
    //got return int value no paremeter
    public static double b(){
        System.out.print("ijaijai");
        return 7;
    }
    
    //no return got paremeter
    public static void c(int a,int b){
        int total=a+b;
        System.out.println("\n"+total);
    }
    
    //got return got paremeter
    public static int d(int a,String b){
        System.out.print("POPOP\n");
        return 5;
    }
    
    
}
