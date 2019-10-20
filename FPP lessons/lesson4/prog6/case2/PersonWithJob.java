package lesson4.prog6.case2;

import java.util.GregorianCalendar;

import lesson4.prog6.case2.Person;

public class PersonWithJob extends Person{
	private double salary;
	PersonWithJob(String name, GregorianCalendar dob,double salary){
		super(name,dob);
		this.salary=salary;
	}

	public double getSalary(){
		return salary;
	}
	@Override
	public boolean equals(Object otherPersonWithJob){
		if(otherPersonWithJob==null)return false;
		
		if(!(otherPersonWithJob instanceof PersonWithJob)) return false;
		
		
		if(otherPersonWithJob.getClass() != this.getClass())
		return false;
		PersonWithJob p = (PersonWithJob)otherPersonWithJob;
		boolean isEqual = this.getName().equals(p.getName());
		return isEqual;
	}
}
