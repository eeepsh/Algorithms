package lesson4.prog1;

import java.time.LocalDate;

public class DeptEmployee {
	protected String name;
	protected double salary;
	protected int yearOfHire;
	protected int monthOfHire;
	protected int dayOfHire;
	protected LocalDate hireDate;

	public DeptEmployee(String name, double salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		this.yearOfHire = year;
		this.monthOfHire = month;
		this.dayOfHire = day;
		this.hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);	

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearOfHire() {
		return yearOfHire;
	}

	public void setYearOfHire(int yearOfHire) {
		this.yearOfHire = yearOfHire;
	}

	public int getMonthOfHire() {
		return monthOfHire;
	}

	public void setMonthOfHire(int monthOfHire) {
		this.monthOfHire = monthOfHire;
	}

	public int getDayOfHire() {
		return dayOfHire;
	}

	public void setDayOfHire(int dayOfHire) {
		this.dayOfHire = dayOfHire;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
//	public double getSalary(){
//		return salary;
//	}

	public double computeSalary() {
		return salary;
	}

}
