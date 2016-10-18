package Classes;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public final class HumanResourcesStatistics {

	public static List<PayrollEntry> payroll(List<Employee> employees) {
		return null;
	}

	public static List<PayrollEntry> subordinatesPayroll(List<Employee> employees, Manager manager) {
		 return employees
				.stream()
				.filter(e -> e.getMang().equals(manager))
				.map(e -> {
					if (e instanceof Worker)
					{
						return new PayrollEntry(e, new BigDecimal(e.getSalary()), new BigDecimal(((Worker) e).getBonus()));
					}
					return new PayrollEntry(e, new BigDecimal(e.getSalary()), new BigDecimal(0));
				})
				.collect(Collectors.toList());
		
	
				
	}
	
	

	public static BigDecimal bonusTotal(List<Employee> employees) {
		return null;
	}
	
	

	/// ...
	// rest of the methods specified in the assignment description
}