/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author User
 */
public class MainCourse extends DinnerMenu implements Menu{
 
    String name;
    double price;
    
    public MainCourse(){
        
    }
    
    public MainCourse(String name, double price){
        this.name=name;
        this.price=price;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public void setPrice(double price){
        this.price=price;
    }
    
    public String getName1(){
        return "Chicken";
    }
    
    public double getPrice1(){
     return 18.99;
    }
    
    public String getName2(){
        return "Steak";
    }
    
    public double getPrice2(){
     return 18.99;
    }
    public String getName3(){
        return "Fish";
    }
    
    public double getPrice3(){
     return 20.99;
    }
}
