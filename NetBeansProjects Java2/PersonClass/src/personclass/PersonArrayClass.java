/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personclass;

/**
 *
 * @author William
 */
import java.util.Scanner;
public class PersonArrayClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Person [] Person5 = new Person [5];
//        Person c1 = new Person("William",25);
//        Person5[0]=c1;
//        Person c2 = new Person("LPLP",19);
//        Person5[1]=c2;
//        Person c3 = new Person("SDDS",5);
//        Person5[2]=c3;
//        Person c4 = new Person("BNBN",9);
//        Person5[3]=c4;
//        Person c5 = new Person("ZXZX",2);
//        Person5[4]=c5;
//        for(int j=0;j<Person5.length;j++){
//        System.out.println(Person5[j].printPerson());
//        }
//        
//        Person [] Person4 = { new Person("William",36),
//            new Person("Ali",15),
//            new Person("Abu",25),
//            new Person("Alvin",34),
//            new Person("OPOP",18) };
//        for(int i=0;i<Person4.length;i++){
//        System.out.println(Person4[i].printPerson());
//    }
        Scanner input = new Scanner(System.in);
        Person [] Person3 = new Person [5];
        for(int x = 0; x < Person3.length; x++){
            System.out.print("Enter Your Name: ");
            String Name = input.next();
            System.out.print("Enter Your Age: ");
            int Age = input.nextInt();
            Person3[x]=new Person(Name,Age);
            
        }
        for(int i = 0; i < Person3.length; i++){
            System.out.println(Person3[i].printPerson());
        }
    }
    
}
