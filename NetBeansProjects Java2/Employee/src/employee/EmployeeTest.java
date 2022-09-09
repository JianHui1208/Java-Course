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
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Salary Statement for April:");
    	System.out.println("----------------------------");
        CommissionEmployee emp1 = new CommissionEmployee();
    	emp1.setFirstName("Simon");
    	emp1.setLastName("Tan");
    	emp1.setSocialSecurityNum("1002");
    	emp1.setCommissionRate(0.08);
    	emp1.setGrossSale(100000);
    	System.out.println(emp1.toString());
    	System.out.println("Salary: RM" + emp1.getMonthlySalart());
    	
//    	BasePlusCommissionEmployee emp2 = new BasePlusCommissionEmployee(1000);
//    	emp2.setFirstName("Jason");
//    	emp2.setLastName("Lim");
//    	emp2.setSocialSecurityNum("1003");
//    	emp2.setCommissionRate(0.03);
//    	emp2.setGrossSale(100000);
//    	System.out.println(emp2.toString());
//    	System.out.println("Salary: RM" + emp2.getMonthlySalart());
    }
    
}
