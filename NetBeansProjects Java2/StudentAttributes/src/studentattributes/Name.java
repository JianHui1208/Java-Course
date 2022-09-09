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
public class Name {
    String Name;
    int age;
    String StudentId;
    public Name(){
    }
    public Name(String newName,int newAge,String newStudentId){
        setName(newName);
        setAge(newAge);
        setStudentId(newStudentId);
    }
    public String getName(){
        return Name;
    }
    public int getAge(){
        return age;
    }
    public String getID(){
        return StudentId;
    }
    public void setName(String newName){
        Name=newName;
    }
    public void setAge(int newAge){
        age=newAge;
    }
    public void setStudentId(String newStudentsId){
        StudentId=newStudentsId;
    }
    public String display(){
        String msg=getName()+"\n"+
                    getAge()+"\n"+
                     getID();
        return msg;
    }
}
