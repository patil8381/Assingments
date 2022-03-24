package assingment2;

public class SalariedEmployee extends Employee1{

	private double fixedWeeklySalary;
	public SalariedEmployee(int id, String name, double fixedWeeklySalary) {
		super(id, name);
		this.fixedWeeklySalary=fixedWeeklySalary;
	}
	@Override
	public double getPayment() {
		return fixedWeeklySalary;
	}

	
}
