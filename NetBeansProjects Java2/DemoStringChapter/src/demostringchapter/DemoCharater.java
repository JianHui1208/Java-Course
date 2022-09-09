/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostringchapter;

/**
 *
 * @author William
 */
import java.util.*;
public class DemoCharater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char c1 = 'a';//primitive data type
        Character c2 = new Character('a');
        char c3 = c2.charValue();//return char
        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isLetter('a'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(c3);
        System.out.println(Character.toUpperCase(c3));
        
        //equals() => c1.equals(c2) => compare Character object(compare content)
        //== => compare char value
        System.out.println(c2.equals(c1));
        
        //compareTo()
        System.out.println(c2.compareTo('A'));
        
        String MSG = "Hello World";
        char [] Array = MSG.toCharArray();
        for(int i = 0; i < Array.length; i++){
            System.out.println(Array[i]);
        }
    }
}
