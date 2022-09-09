/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testa;

/**
 *
 * @author William
 */
import java.util.*;
public class TestA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Scanner input = new Scanner(System.in);
        int a=0;
        int b=0;
        
        System.out.print("Enter A number: ");
        a=input.nextInt();
        System.out.print("Enter B number: ");
        b=input.nextInt();
        
        System.out.println(a++);
        System.out.println(a--);
        System.out.println(b++);
        System.out.println(b--);
        System.out.println(++a);
        System.out.println(--a);
        System.out.println(++b);
        System.out.println(--b);
        
        System.out.println("C=a++ + a-- + b++ + b--");
        System.out.println(a++ + a-- + b++ + b--);
        System.out.println("C=++a + --a + ++b + --b");
        System.out.println(++a + --a + ++b + --b);
        System.out.println("C=a++ - --a + --b + b--");
        System.out.println(a++ - --a + --b + b--);*/
        test();
    }
    public static void test(){
        int a=2;
        
        
        System.out.println(--a + a++ - --a + ++a);
        
    }
}
