/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofdigit.pkgfor;

/**
 *
 * @author William
 */
import java.util.*; 
public class SumOfDigitFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); 
        String a;
        do{
           System.out.print("Enter a number : ");
           a = input.next();
        
        } while(!isInteger(a));
        System.out.println(addString(a));
    }
        public static int addString(String a){
        int sum = 0;
        for(int i = 0;i<a.length();i++){
            char b = a.charAt(i);
            if(Character.isDigit(b)){
                int c = Integer.parseInt(String.valueOf(b));
                sum = sum + c ;
            }
            
        }
        return sum;
    }
        public static boolean isInteger(String str){
        if(str == null || str.trim().isEmpty()){
            return false;
        }
        for(int i = 0; i<str.length();i++){
            if(!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

}
