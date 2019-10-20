package dataStructure.comparator;

import java.math.BigInteger;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

	private String name;
	private Date hireDate;
	private double salary;
	
	public Employee(String name, double salary, int year, int month, int day){
		this.name = name;
		this.salary = salary;
		GregorianCalendar cal = 
			new GregorianCalendar(year,month,day);
		hireDate= cal.getTime();
	}

	public Date getHireDate() {
		return (Date)hireDate.clone();
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hireDate == null) ? 0 : hireDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (hireDate == null) {
			if (other.hireDate != null)
				return false;
		} else if (!hireDate.equals(other.hireDate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	

	private int combineHashes(int hash1, int hash2, int hash3) {
		// TODO Auto-generated method stub
		BigInteger intMax=bigint(Integer.MAX_VALUE);
		BigInteger power2=bigint(2).modPow(bigint(hash1), intMax);
		BigInteger power3=bigint(3).modPow(bigint(hash2), intMax);
		BigInteger power5=bigint(5).modPow(bigint(hash3), intMax);
		
		BigInteger product=power2.multiply(power3).multiply(power5).mod(intMax);
		return product.intValue();
		
		//return 0;
	}

	private BigInteger bigint(int maxValue) {
		// TODO Auto-generated method stub
		return BigInteger.valueOf(maxValue);
	}

	public String toString() {
		String newline = System.getProperty("line.separator");
		return newline+"EMPLOYEE "+name+newline+
				"Date of Hire: "+hireDate+newline+
				"Salary: "+salary+newline;
	}

	

}
