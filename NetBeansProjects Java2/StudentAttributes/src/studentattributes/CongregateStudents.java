/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentattributes;

/**
 *
 * @author William
 */
import java.util.*;
public class CongregateStudents {
    public static void main(String[] args) {
        // TODO code application logic here
        Name c1;
        c1 = new Name();
        c1.setName("william");
        c1.setAge(19);
        c1.setStudentId("D190067A");
        System.out.println("My Name is "+c1.getName());
        System.out.println("My Age is "+c1.getAge());
        System.out.println("My ID is "+c1.getID());
        
        Name c2;
        c2= new Name("Ali",18,"D190068A");
        System.out.println("My Name is "+c2.getName());
        System.out.println("My Age is "+c2.getAge());
        System.out.println("My ID is "+c2.getID());
        
        Name c3;
        c3 = new Name("Abu",15,"D190063A");
        System.out.println(c3.display());
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String setName=input.next();
        System.out.print("Enter Your Age: ");
        int setAge=input.nextInt();
        System.out.print("Enter Your StudentID: ");
        String setID=input.next();
        
        Name c4;
        c4=new Name(setName,setAge,setID);
        System.out.println("My Name is "+c4.getName());
        System.out.println("My Age is "+c4.getAge());
        System.out.println("My ID is "+c4.getID());
   }
    
}
