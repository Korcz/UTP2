package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class Manager extends Person
{

	// attributes
	// * subordinates (a list of immediate subordinates)
	// * all subordinates (a list of subordinates in all hierarchy)
	private List<Employee> subordinates;
	private List<Employee> allSubordinates;

	static final AtomicLong NEXT_ID = new AtomicLong(0);
	final long id = NEXT_ID.getAndIncrement();

	public long getId()
	{
		return id;
	}

	public Manager(String firstName, String surname, int year, int month, int day)
	{
		super(firstName, surname, year, month, day);
		subordinates = new ArrayList<>();
		allSubordinates = new ArrayList<>();
	}

	public List<Employee> getSubordinates()
	{
		return subordinates;
	}

	public void setSubordinates(List<Employee> subordinates)
	{
		this.subordinates = subordinates;
	}

	public List<Employee> getAllSubordinates()
	{
		return allSubordinates;
	}

	public void setAllSubordinates(List<Employee> allSubordinates)
	{
		this.allSubordinates = allSubordinates;
	}

	@Override
	public String toString()
	{
		return super.toString() +  "Manager [subordinates=" + subordinates + ", allSubordinates=" + allSubordinates + ", id=" + id + "]";
	}
	
	

}