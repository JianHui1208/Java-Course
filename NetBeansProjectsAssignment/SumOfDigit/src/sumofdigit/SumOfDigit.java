/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofdigit;

/**
 *
 * @author William
 */
import java.util.*;
public class SumOfDigit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String a;
        do{
        System.out.print("Enter the number: ");
        a = input.next();
        }while(!isInteger(a));
        System.out.print(addString(a));
        
    }
    public static int addString(String g){
        int o=0;
        int p=Integer.parseInt(g);//string to int
        while(p>0){
            o+=p%10;//加的意思（有余数） [c+b(input)]%10
            p/=10;  //（没有余数）b=b/10
        }
        return o;
    }
    
    public static boolean isInteger(String Str){
        if(Str==null || Str.trim().isEmpty()){
            return false;
        }
        for(int i=0;i<Str.length();i++){
            if(!Character.isDigit(Str.charAt(i))){
            return false;
            }
        }
        return true;
    }//检查user有没有keyin错误的号码和字母
}
