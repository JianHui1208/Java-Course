/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personclass;

import java.util.Scanner;

/**
 *
 * @author William
 */
public class TestPerson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person c1;
        c1 = new Person();
//        c1.setName("William");
        c1.setAge(28);
        System.out.println("Name: "+c1.setName("William"));
        System.out.println("Age: "+c1.getAge());
        System.out.println("Age in Days: "+c1.computeAge());
        
        Person c2 = new Person("Ali",18);
        c2.printPerson();
        System.out.println(c2.printPerson());
        
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String Name=input.next();
        System.out.print("Enter Your Age: ");
        int Age=input.nextInt();
        Person c3=new Person(Name,Age);
        System.out.println(c3.printPerson());
    }
    
}
