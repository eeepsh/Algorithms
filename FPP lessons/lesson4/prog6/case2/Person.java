package lesson4.prog6.case2;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Person {

	private String name;
	private GregorianCalendar dateOfBirth;
	Person(String name, GregorianCalendar dob){
		this.name=name;
		this.dateOfBirth=dob;
	}
	public String getName() {
		return name;
	}
	
	public GregorianCalendar getDateOfBirth() {
		return (GregorianCalendar)dateOfBirth.clone();
	}
	
	public boolean equals(Object otherPerson){
		if(otherPerson==null)return false;
		
		if(!(otherPerson instanceof Person)) return false;
		
		Person p=(Person) otherPerson;
		return (this.name.equals(p.name)&& this.dateOfBirth.equals(p.dateOfBirth));
	}
	
	public static void main(String[] arg){
		
		Person p1=new Person("Deepa", new  GregorianCalendar(1992, Calendar.NOVEMBER,25));
		Person p2=new Person("Deepa", new  GregorianCalendar(1992, Calendar.NOVEMBER,25));	
		
		System.out.println("Person1==person2"+p1.equals(p2));
		System.out.println("Person2==person1"+p2.equals(p1));
		
		PersonWithJob p3 = new PersonWithJob("Diwas", new GregorianCalendar(1989, Calendar.JULY,25), 2353.0);	
		System.out.println("Person2==person3" +p2.equals(p3));
		System.out.println("Person3==person2"+p3.equals(p2));
	}

	
}
