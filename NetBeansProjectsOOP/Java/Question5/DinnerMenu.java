/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;
import java.util.*;
/**
 *
 * @author User
 */
public class DinnerMenu {

   String name;
   double price;
   
   public DinnerMenu(){
       
   }
   
   public DinnerMenu(String name, double price){
       this.name=name;
       this.price=price;
   }
   
   public void setName(String name){
       this.name=name;
   }
   
   public void setPrice(double price){
       this.price=price;
   }
   
   public String getName(){
       return name;
   }
   
   public double getPrice(){
       return price;
   }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StarterCourse a = new StarterCourse();
        System.out.println("Starter Course" );
        System.out.println(a.getName1()+"\n"+ a.getPrice1());
         System.out.println (a.getName2()+"\n"+a.getPrice2() );
         System.out.println(a.getName3() +"\n"+a.getPrice3() ); 
        
        MainCourse b = new MainCourse();
        System.out.println("Main Course" );
        System.out.println(b.getName1()+"\n"+ b.getPrice1());
         System.out.println (b.getName2()+"\n"+b.getPrice2() );
         System.out.println(b.getName3() +"\n"+ b.getPrice3() ); 
         
        DessertCourse c = new DessertCourse();
        System.out.println("Main Course" );
       System.out.println(c.getName1()+"\n"+c.getPrice1());
         System.out.println (c.getName2()+"\n"+c.getPrice2() );
         System.out.println(c.getName3() +"\n"+ c.getPrice3() ); 
        
    }
    
}
