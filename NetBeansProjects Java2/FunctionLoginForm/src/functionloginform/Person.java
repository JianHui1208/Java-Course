/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionloginform;
/**
 *
 * @author William
 */
//import java.util.Date;
public class Person {
    //char chaeacter;//''
    //boolean koko;//false
    //Date date;//null
    String Name;
    private int age;
    private int ageindays=365;
        public Person(){
        }
        public Person(String newName,int newAge){
            setName(newName);
            setAge(newAge);
        }
        public String getName(){
            return Name;
        }
        public int getAge(){
            return age;
        }
        public void setName(String newName){
            Name=newName;
        }
        public void setAge(int newAge){
            age=newAge;
        }
        public int computeAge(){
            ageindays=age*365;
            return ageindays;
        }
        public int getAgeinday(){
            return ageindays;
        }
        public String printPerson(){
            String MSG="Name: "+getName()+"\nAge: "+
                        getAge()+"\nAge in Days: "+
                         computeAge();
            return MSG;
        }
        
        //override toString() => return String 
        //display output
        //Name:
        //Age:
        //Age In Day:
        @Override
        public String toString(){
            String msg = "Name: " + getName()
                    +"\nAge In Day: " + computeAge();
            return msg;
        }
}

