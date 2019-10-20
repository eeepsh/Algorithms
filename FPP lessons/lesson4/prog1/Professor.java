package lesson4.prog1;

import java.time.LocalDate;

public class Professor extends DeptEmployee {
	private int numberOfPublications = 10;

	public Professor(String name, double salary, int year, int month, int day, int nPublications) {
		super(name, salary, year, month, day);
		this.numberOfPublications = nPublications;

	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
	

}
