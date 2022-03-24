package assingment2;
abstract class Employee1 implements Payable{
	private int id;
	private String name;

	public Employee1(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	abstract public double getPayment() ;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}
