package lesson11.prog1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.omg.CORBA.portable.ValueBase;

public class Employee {
	private String firstName;
	private String lastName;
	private HashMap<String, Double> salaryRecord;

	public Employee() {
		this.salaryRecord = new HashMap<String, Double>();
	}

	public void addEntry(String date, double salary) {

		salaryRecord.put(date, salary); // keys ra value put gareko in
										// salaryrecord

		// implement
	}

	public void printPaymentAmount(String date) {

		for (Map.Entry entry : salaryRecord.entrySet()) {
			if (date.equals(entry.getKey())) {
				System.out.println(this.firstName + " " + this.lastName + "" + " was paid " + entry.getValue() + " on "
						+ entry.getKey());
			}  else
				System.out.println(this.firstName + " didnot receive a" + " paycheck on " + entry.getKey());

		}

		System.out.println(date);
		
		// for going thow each key set   map.keyset()
		
		for(String s:salaryRecord.keySet()){
			
		}
		
		//for going throw each values in has map map.values()
		
		for(Double s: salaryRecord.values()){
			
		}

		// implement

	}

	public void printAveragePaycheck() {
		double average;
		double totalAmount = 0;
		for (Map.Entry entry : salaryRecord.entrySet()) {
			totalAmount += (double) entry.getValue();

		}
		average = totalAmount / salaryRecord.size();
		// Average paycheck for Jim Jones was 3097.5
		System.out.println("Average paycheck for " + firstName + " " + lastName + " was " + average);

		// implement
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setFirstName("Jim");
		e.setLastName("Jones");
		for (int i = 1; i <= 12; ++i) {
			e.addEntry(i + "/15/2011", 3070 + 5 * i);
		}
		e.printPaymentAmount("3/15/2011");
		e.printPaymentAmount("5/15/2010");
		e.printAveragePaycheck();

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
