
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William
 */
public class Car extends Vehicle{
    String Model;
    double Price;
    int Capacity;
    int yearOfManufacturing;
    
    public Car(){}
    
    public void setCapacity(int newCapacity){
        Capacity = newCapacity;
    }
    
    public void setYear(int newYear){
        yearOfManufacturing = newYear;
    }
    
    public int getCapacity(){
        return Capacity;
    }
    
    public double getYear(){
        return yearOfManufacturing;
    }
    
    public String ageOfCar(){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int intYear = currentYear - yearOfManufacturing;
        String Year = String.valueOf(intYear);
        return Year;
    }
    
    public boolean isLucuriousCar(){
        if(Capacity > 3000){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        Vehicle A = new Vehicle();
        A.setModel(Model);
        A.setPrice(Price);
        String MSG = A.getModel() + "\n" + A.getPrice() + "\n" + getCapacity() + "\n" + ageOfCar();
        return MSG;
    }
}
