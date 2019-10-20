package lesson4.prog5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.print.attribute.standard.MediaSize.Other;


public class Employee implements Comparable<Employee>{
	private String name;
	private int salary;
	private LocalDate hireDate;

	public Employee(String name, int salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		this.hireDate = LocalDate.of(year, month, day);
		
	}

	public int getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
		
	}

	@Override
	public int compareTo(Employee other) {
		// TODO Auto-generated method stub
		int comparedName= this.name.compareTo(other.name);
		if(comparedName!=0) return comparedName;
		
		int comparedSalary=Integer.compare(this.salary, other.salary);
		if(comparedSalary!=0)return comparedSalary;
		
		return this.hireDate.compareTo(other.hireDate);
		
	}
	
	public String toString(){
		String formatedDate=hireDate.format(DateTimeFormatter.ofPattern("MM,dd,YY"));
		return "<name :" + name + "Salary : "+ salary+"hire date : "+ formatedDate + ">";
		
	}		
	

}
