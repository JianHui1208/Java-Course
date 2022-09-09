public class Faculty extends Employee {

	public static void main(String[] arg) {
		new Faculty();
	}

	public Faculty() {
		System.out.println("(2) Faculty's no-arg constructor is invoked");
	}

}

class Employee {
	public Employee() {
		System.out.println("(1) Employee's no-arg constructor is invoked");
	}
}