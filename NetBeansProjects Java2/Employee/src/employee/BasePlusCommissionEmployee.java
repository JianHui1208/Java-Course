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
public class BasePlusCommissionEmployee extends CommissionEmployee{
    
    private double baseSalary;
    
    public BasePlusCommissionEmployee(){
    }
    
    public BasePlusCommissionEmployee(double NewBaseSalary){
        setBaseSalary(NewBaseSalary);
    }
    
    public void setBaseSalary(double NewbaseSalary){
        baseSalary = NewbaseSalary;
    }
    
    public double getBaseSalary(){
        return baseSalary;
    }
    
    @Override
    public double getMonthlySalart(){
        double Salary = baseSalary + super.getMonthlySalart();
        return Salary;
    }
    
    @Override
    public String toString(){
        String MSG = "\n" + super.toString() +
                "\nBase Salary: RM" + getBaseSalary();
        return MSG;
    }
}
