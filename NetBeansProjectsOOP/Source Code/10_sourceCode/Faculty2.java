/**
 * @(#)Faculty.java
 *
 *
 * @author 
 * @version 1.00 2010/5/3
 */


public class Faculty2 extends Employee2{

	private String name;
	
	public static void main(String[] arg){
		System.out.println("Contructor that invoke by the instance new Faculty2(): ");
		new Faculty2();
		
		System.out.println("Contructor that invoke by the instance new Faculty2(String, String): ");
		new Faculty2("Faculty Information Technology", "Winson");
	}
	
	//constructor
    public Faculty2() {
    	System.out.println("(3) Faculty's no-arg constructor is invoked");
    }
    public Faculty2(String facName, String empName) {
    	super(empName);
    	this.name = facName;
    	System.out.println("(4) Faculty's constructor with one arg is invoked");
    }
}

class Employee2{
	private String name;
	public Employee2(){
		System.out.println("(1) Employee's no-arg constructor is invoked");
	}
	public Employee2(String name){
		this.name = name;
		System.out.println("(2) Employee's constructor with one arg is invoked");
	}
}