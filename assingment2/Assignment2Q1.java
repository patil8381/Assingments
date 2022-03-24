package assingment2;
/*
 * Implement following UML diagram, Write a program to test Employee class
 */
class Employee{
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}


	public String getFirstName() {
		return firstName;
	}

	//calculate full name and return 
	public String getName() {
		//------------------------IMPLEMENT LOGIC------------------------
		return null;
	}
	
	public String getLastName() {
		return lastName;
	}

	public int getSalary() {
		return salary;
	}
	
	//calculate annual salary and return 
	public int getAnnualSalary() {
		//------------------------IMPLEMENT LOGIC------------------------
		return 0;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//increase the salary by the percentage and return the new salary
	public void raiseSalary(int percentage) {
		//------------------------IMPLEMENT LOGIC------------------------
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}

	public char[] getPayment() {
		return null;
	}
	
	
	
	}
public class Assignment2Q1 {

	public static void main(String[] args) {
		Employee emp=new Employee(1, "raj", "gupta", 50000);
		
		emp.raiseSalary(10);
		System.out.println(emp);
	}
}


