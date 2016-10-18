import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Classes.Employee;
import Classes.HumanResourcesStatistics;
import Classes.Manager;
import Classes.PayrollEntry;
import Classes.Trainee;
import Classes.Worker;

public class Main
{

	public static void surnameA(List<Employee> people, Manager m)
	{
		char z = 'A';
		for (int i = 0; i < people.size(); i++)
		{
			if (people.get(i).getMang().equals(m))
			{
				if (people.get(i).getSurname().charAt(0) == z)
				{
					System.out.println(people.get(i).toString());
				}
			}
		}
	}
	public static void main(String[] args)
	{	
		List<Manager> managers = new ArrayList<>();
		managers.add(new Manager("MANAGER1", "SUR MANAGER 1", 1988, 12, 1));
		managers.add(new Manager("MANAGER2", "SUR MANAGER 2", 1988, 10, 21));
		
		List<Employee> people = new ArrayList<>();
		people.add(new Worker("W1", "wS1", 1990, 12, 22, 900.0, managers.get(0), 2000, 5, 10, 500));
		people.add(new Worker("W2", "AwS2", 1990, 12, 22, 2500.0, managers.get(0), 2000, 5, 10, 500));
		people.add(new Worker("W3", "wS3", 1990, 12, 22, 22500.0, managers.get(0), 2000, 5, 10, 500));
		people.add(new Trainee("T1", "sT1", 1991, 1, 5, 4000, managers.get(1), 2010, 4, 16, 6));
		people.add(new Trainee("T2", "sT2", 1981, 7, 25, 6700, managers.get(1), 610, 4, 16, 6));
		
		
		HumanResourcesStatistics.subordinatesPayroll(people, managers.get(0)).forEach(System.out::println);;
		System.out.println("---------");
		
		/*List<Employee> employeeArr = new ArrayList<>();
		HashMap<Employee, Double> salaryMap = new HashMap<>();
		HashMap<Manager, Employee> subprdonatesMap = new HashMap<>();
		*/
		
		boolean koniec = false;
		while (koniec == false)
		{
			System.out.println("Menu");
			System.out.println("1. Preparing payroll for all the employees");
			System.out.println("2. Preparing payroll for subordinates of the given manager");
			System.out.println("3. Search");
			System.out.println("4. Koniec");

			System.out.println("Twoj wybor");
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			sc.nextLine();

			switch (x)
			{
			case 1:
				people
				.forEach(e -> System.out.println(e.getSalary() + " PLN"));
				break;
			case 2:

				Scanner input1 = new Scanner(System.in);
				System.out.println("Enter menager first name");
				String firstNameMenager = input1.nextLine();
				
				Manager manager = null;
				for (Manager m : managers)
				{
					if (m.getFirstName().equals(firstNameMenager))
					{
						manager = m;
						break;
					}
					
				}
				
				
				if (manager == null)
				{
					System.out.println("NIE MA");
				}
				else
				{
					System.out.println("-------------------");
					System.out.println(manager);
					
					/*people
					.stream()
					.filter(e -> {
						return e.getMang().getFirstName().equals(firstNameMenager); //&& e.getMang() != null;
					})
					.forEach(e -> System.out.println(e.getSalary() +" PLN"));*/
				}
				
				
				break;
			case 3:

				System.out.println("Searching for:");
				System.out.println("1. An employee with the longest seniority");
				System.out.println("2. The highest salary without bonus");//number should be returned
				System.out.println("3. The highest salary with bonus");//number should be returned
				System.out.println("4. Employees whose surnames begin with ‘A’ subordinates of the given manager");
				System.out.println("5. Employees who earn more than 1000 PLN.");
				System.out.println("Your choice is:");
				int y = sc.nextInt();
				sc.nextLine();

				switch (y)
				{
				case 1:
					//posortowac po kryterium i zwrocic pierwszego -> strunmienie + sort + comparator
					/*people
					.stream()
					.sorted((e1,e2) -> {
						if ()
						{
							
						}
					})*/
					
					//java.util.Optional<Employee> worker = people
				
					//System.out.println("An employee with the longest seniority is: ");
					break;
				case 2://odwrotnie sortowac
					java.util.Optional<Employee> emp = people
					.stream()
					.sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
					.findFirst();
					
					System.out.println(emp.get());
					//.forEach(e -> System.out.println(e.getSalary()));
					//System.out.println("The highest salary without bonus is: ");
					break;
				case 3:
					java.util.Optional<Employee> emp2 = people
					.stream()
					.sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
					.findFirst();
					
					System.out.println(emp2.get());
					System.out.println(" The highest salary with bonus is: ");
					break;
				case 4:
					Scanner input2 = new Scanner(System.in);
					System.out.println("Enter menager first name");
					String firstNameMenager2 = input2.nextLine();
					
					
					
					Manager manager2 = null;
					for (Manager m : managers)
					{
						if (m.getFirstName().equals(""))
						{
							manager2 = m;
							break;
						}
						
					}
					
					
					if (manager2 == null)
					{
						System.out.println("NIE MA");
					}
					else
					{
						
					}
					
					surnameA(people, managers.get(0));
					
					//System.out.println("Employee/s whose surnames begin with ‘A’ subordinates of menager " + surnameMenager2 + " is/are: ");
					break;
				case 5:
					System.out.println("Employees who earn more than 1000 PLN are: ");
					people
					.stream()
					.filter(e -> {
						return e.getSalary() > 1000;
					})
					.forEach(e -> System.out.println(e));
					
					break;
				case 6:
					koniec = true;
					break;
				default:
					System.out.println("Wrong number");
				}
			case 4:
				koniec = true;
				break;
			default:
				System.out.println("Wrong number");
			}
		}
	}
}
