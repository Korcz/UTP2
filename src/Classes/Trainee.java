package Classes;

import java.time.LocalDate;

public class Trainee extends Employee
{

	// attributes:
	// * practice start date
	// * practice length (in days)
	
	private LocalDate practiceStartDate;
	private int practiceLength;
	
	public Trainee(String firstName, String surname, int year, int month, int day, 
			double salary, Manager mag, int startYear2, int startMonth2, int startDay2, int pracLength)
	{
		super(firstName, surname, year, month, day, salary, mag);
		this.practiceStartDate = LocalDate.of(startYear2, startMonth2, startDay2);
		this.practiceLength = pracLength;
	}

	
	public LocalDate getPracticeStartDate()
	{
		return practiceStartDate;
	}
	public void setPracticeStartDate(LocalDate practiceStartDate)
	{
		this.practiceStartDate = practiceStartDate;
	}
	public int getPracticeLength()
	{
		return practiceLength;
	}
	public void setPracticeLength(int practiceLength)
	{
		this.practiceLength = practiceLength;
	}
	@Override
	public String toString()
	{
		return super.toString() + "Trainee [practiceStartDate=" + practiceStartDate + ", practiceLength=" + practiceLength + "]";
	}
	
	
}