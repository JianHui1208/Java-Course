/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.pkg2;

/**
 *
 * @author user
 */
public class testOO {
    String name;
    int age;
public testOO(){
    name="unknow";
    age=0;
}
public testOO(String name,int age){
    this.name=name;
    this.age=age;
}
public int calculateAge(){
    return age*365;
}
public void DisplayInfo(){
    System.out.println("Your name is:"+ name);
    System.out.println("your age"+age+"in days is "+calculateAge());
}
    public static void main(String []args){
        testOO andy=new testOO("Andy",21);
        andy.DisplayInfo();
    }
    
}
