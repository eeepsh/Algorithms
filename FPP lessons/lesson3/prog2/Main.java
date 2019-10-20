package lesson3.prog2;

import java.util.Scanner;

public class Main {
	Employee[] emp = null;

	public static void main(String[] arg) {
		new Main();

	}

	Main(){
		emp=new Employee[3];
		emp[0]=new Employee("Deepa", 2017, 9,4);
		emp[1]=new Employee("Ram", 2001, 2, 3);
		emp[2] = new Employee("Susan Randolph", 1997, 2,13);
		emp[0].createCheckingAccount(10500);
		emp[0].createSavingAccount(1000);
		emp[0].createRetirementAccount(9300);
		emp[1].createCheckingAccount(34000);
		emp[1].createSavingAccount(27000);
		emp[2].createCheckingAccount(10038);
		emp[2].createSavingAccount(12600);
		emp[2].createRetirementAccount(9000);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("See a report of all account balances ?(y/n)");
		String answer=sc.next();
		if(answer.equalsIgnoreCase("y")){
			String info= getFormattedAccountInfo();
			System.out.println(info);
			
		}

	}

	String getFormattedAccountInfo() {
		String value="";
		for(Employee e: emp){
			value=value+e.getFormattedAccountInfo();
			
		}
		return value;
	}

}
