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
public class DemoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create String Variable
        //String content = immutable
        String s1 = "William";
        String s2 = new String("Ali");
        String s3 = s1 + s2;
        System.out.println(s3);
        System.out.println();
        
        //String1.concat(String2) => String1 = String2
        System.out.println(s2.concat(s1));
        System.out.println();
        
        //length() return total number of char
        System.out.println(s1.length());
        System.out.println();
        
        //return char
        String s191 = "abcd";
        String s192 = "efjh";
        System.out.println(s191.charAt(1));
        char letter = s192.charAt(2);
        System.out.println(letter);
        System.out.println();
        
        //String.indexOf('...') => return index (int)
        System.out.println("There Stop");
        System.out.println(s1.indexOf('l'));
        System.out.println(s1.indexOf('l',3));
        
        //other method
        System.out.println(s1.lastIndexOf('l'));
        System.out.println();
        
        //subString() => extra substring from a string want add 1
        String s4 = "Hello, Ali. I am Ahmad";
        
        //7 until 10
        System.out.println(s4.substring(7, 10));
        //extra sub string from index 17 until last char
        System.out.println(s4.substring(17));
        System.out.println();
        
        //equals() => compare string data
        // == => compare numeric data
        System.out.println("string1.equals(String2) => return boolean value");
        String s5 = "Welcome";
        String s6 = new String("Welcome");
        System.out.println(s5.equals(s6));
        System.out.println(s5 == s6);
//        System.out.println(s6.equals(null)); is wrong
        System.out.println();
        
        //compareTo() => compare 2 string data
        //String1.compareTo(String2)
        //return 3 possible value
        //0 => String1 == String 2
        //+ve => String1 > String2
        //-ve => String1 < String2
        System.out.println("compareTo() => compare 2 string data");
        System.out.println("A".compareTo("a"));
        System.out.println("ali".compareTo("ahmad"));
        System.out.println("ali".compareTo("alibaba"));
        System.out.println();
        
        //Caps
        String s7 = "Hello";
        System.out.println(s7.toUpperCase());
        System.out.println(s7.toLowerCase());
        System.out.println();
        
        //Bsckspace Space
        String s8 = "   Hello Would   ";
        System.out.println(s8.trim());
        System.out.println();
        String s9 = "helllllllo i am a girl";
        System.out.println(s8.replace("girl", "boy"));
        System.out.println(s8.replace("l", "q"));
        System.out.println(s8.replaceFirst("l", ""));
        System.out.println(s8.replaceAll("l", "o"));
        System.out.println(s8.replaceAll("[aeiou]", "*"));//has pantten
        System.out.println();
        
        System.out.println(String.valueOf(true));
        
        String s99 = "Welcome to java";
        String s100 = s99.substring(0, 11);
        System.out.println(s100);
        
        String s101 = new String("Welcome to java");
        
        System.out.println(s101.indexOf('W'));
        System.out.println(s101.indexOf('x'));
        System.out.println(s101.indexOf('o',5));
        System.out.println(s101.indexOf("come"));
        System.out.println(s101.indexOf("java" , 5));
        System.out.println(s101.lastIndexOf('a'));
    }
    
}
