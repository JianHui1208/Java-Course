/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;
 
/**
 *
 * @author William
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNum;
    
    public Employee(){
    }
    
    public Employee(String newFristName,String newLastName,String newNum){
        setFirstName(newFristName);
        setLastName(newLastName);
        setSocialSecurityNum(newNum);
    }
    
    public void setFirstName(String newFristName){
        firstName = newFristName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setLastName(String newLastName){
        lastName = newLastName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setSocialSecurityNum(String newNum){
        socialSecurityNum = newNum;
    }
    
    public String getSocialSecurityNum(){
        return socialSecurityNum;
    }
    
    @Override
    public String toString(){
        String MSG = "Frist Name: " + getFirstName() + 
                "\nLast Name: " + getLastName() +
                "\nSocial Security Number: " + getSocialSecurityNum();
        return MSG;
    }
    
}
