/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getpersonaldetail;

import java.util.Date;

/**
 *
 * @author User
 */
public class Person {
    private String name;
    int age;
    private Date dob;
    public Person(){
        
    }
    public Person(String Name,int Age,Date dob){
        setName(Name);
        setAge(Age);
        setDOB(dob);
    }
    public void setName(String Name){
        this.name = Name;
    }
    public void setAge(int Age){
        this.age = Age;
    }
    public void setDOB(Date a){
        dob=a;
    }
    
    public Date getDOB(){
        return dob;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    public int computeAge(){
        return age * 365;
    }
    public void printPerson(){
        String message = "Name: " + name + " " + "\nAge: " + age + "\nAge in days: " + computeAge();
        System.out.print(message + "\n");
    }
    
    @Override
    public String toString(){
        String msg = "Name: " + getName() + "\nAge in Days: " + computeAge();
        return msg;
    }
    
}
