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
public class CommissionEmployee extends Employee{
    
    double commissionRate;
    double grossSale;
    String msg = "Number Cannot bigger than 1000";
    
    public CommissionEmployee(){
    }
    
    void setCommissionRate(double NewCommissionRate){
        commissionRate = NewCommissionRate;
    }
    
    public double getcommissionRate(){
        return commissionRate;
    }
    
    public void setGrossSale(double NewGrossSale){
        if(NewGrossSale < 100 || NewGrossSale > 1000){
            System.out.print(msg);
            throw new IllegalArgumentException();
        }
        grossSale = NewGrossSale;
    }
    
    public double getgrossSale(){
        return grossSale;
    }
    
    public double getMonthlySalart(){
        double Salary = commissionRate * grossSale;
        return Salary;
    }
    
    @Override
    public String toString(){
        String MSG = "\n" + super.toString() +
                "\nCommission Rate: " + getcommissionRate() + "%" + 
                "\nGross Sale: RM" + getgrossSale();
        return MSG;
    }
}
