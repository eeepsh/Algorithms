package dataStructure.comparator;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		double salary1 = o1.getSalary();
		double salary2 = o2.getSalary();

		if (salary1 < salary2)
			return -1;
		if (salary1 == salary2)
			return 0;

		// TODO Auto-generated method stub
		return 1;
	}

}
