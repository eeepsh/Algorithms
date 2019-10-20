package lesson4.prog1;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] arg){
		
		DeptEmployee[] deptEmployee = new DeptEmployee[5];
		deptEmployee[0]=new Professor("Deepa", 20000.00,2016,11,26,10);
		deptEmployee[1]=new Professor("Karuna",45666.0,2015,1,1, 10);
		deptEmployee[2]=new Professor("Diwas",37737,2014,1,1,10);
		
		deptEmployee[3]=new Secretary("Hari",6522662,2015,1,2,200);
		deptEmployee[4]=new Secretary("Dilip",27278,2017,1,1,200);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you want to see sum of all salaries in the department ?(y/n)");
		String answer=sc.next();
		
		sc.close();
		
		if(answer.equals("y")){
			int sumOfSalaries=0;
			for(DeptEmployee emp:deptEmployee){
				sumOfSalaries+=emp.computeSalary();
				
			}
			System.out.println("Total sum of salaries is : "+ sumOfSalaries);
		}
		
		
	}

}
