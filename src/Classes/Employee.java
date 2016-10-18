package Classes;


public abstract class Employee extends Person
{

	//
	// attributes:
	// * salary
	// * manager (empty if at top of hierarchy)
	
	

	private double salary; //bigDecimal
	private Manager mang;
	
	public Employee(String firstName, String surname, int year, int month, int day, double salary, Manager mag)
	{
		super(firstName, surname, year, month, day);
		this.salary = salary;
		this.mang = mag;
		
	}
	
	
	
	public double getSalary()
	{
		return salary;
	}



	public void setSalary(double salary)
	{
		this.salary = salary;
	}



	public Manager getMang()
	{
		return mang;
	}



	public void setMang(Manager mang)
	{
		this.mang = mang;
	}



	@Override
	public String toString()
	{
		return super.toString() + "Employee [salary=" + salary + ", mang=" + mang + "]";
	}

	
}