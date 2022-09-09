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
public class DemoStringBuffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuffer str1 = new StringBuffer();
        str1.append("hello");
        str1.append(" would");
        System.out.println(str1.toString());
        
//        System.out.println(str1.reverse());
        //hello, sam, hello, would
        System.out.println(str1.insert(5,",Sam, "));
        //delete word
        
        str1.delete(0, 6);
        //delete char
        str1.deleteCharAt(1);
        System.out.println(str1.toString());
    }
    
}
