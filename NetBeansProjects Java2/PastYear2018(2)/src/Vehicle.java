/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William
 */
public class Vehicle {
    String Model;
    double Price;
    
    public Vehicle(){}
    
    public void setModel(String newModel){
        Model = newModel;
    }
    
    public void setPrice(double newPrice){
        Price = newPrice;
    }
    
    public String getModel(){
        return Model;
    }
    
    public double getPrice(){
        return Price;
    }

    @Override
    public String toString(){
        String MSG = Model + "\n" + Price;
        return MSG;
    }
}
