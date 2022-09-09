/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial3;

/**
 *
 * @author William
 */
import java.util.*;
public class Tutorial3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        count("str",'c');
        countLetters("s");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word(must be letters and numbers inside)： ");
        String MSG = input.nextLine();
        countDigits(MSG);
        
        }
    public static int count(String str,char c){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        str = input.next();
        System.out.print("Enter a char: ");
        c = input.next().charAt(0);
        int res = 0;
        for(int i = 0; i<str.length(); i++){
            //checking character in string
            if(str.charAt(i) == c)
                res++;
        }
        System.out.println(res);
        return res;
    }
    
    public static int countLetters(String s){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word(must be letters and numbers inside)： ");
        s = input.nextLine();
        char [] Array = s.toCharArray();
        int num = 0;
        for(int i = 0;i<Array.length;i++){
            if(Character.isLetter(s.charAt(i)))
                num++;
        }
        System.out.println(num);
        return num;
    }
    
    public static int countDigits(String s){
        int num = 0;
        char [] Array = s.toCharArray();
        for(int i = 0;i<Array.length;i++){
            if(Character.isDigit(Array[i])){
                num++;
            }
        }
        System.out.println(num);
        
        return 1;
    }
}
