package lesson3.prog2;

import java.time.LocalDate;

public class Employee {
	
	private Account savingAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	
	private String name;
	private int yearOfHire;
	private int monthOfHire;
	private int dayOfHire;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name=name;
		this.yearOfHire=yearOfHire;
		this.monthOfHire=monthOfHire;
		this.dayOfHire=dayOfHire;
		this.hireDate=LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}
	
	public void createCheckingAccount(double startAmount){
		//polymorphism here
		checkingAcct=new Account(new Employee(name,yearOfHire, monthOfHire, dayOfHire),AccountType.CHECKING, startAmount);
		
	}
	public void createSavingAccount(double startAmount){
		savingAcct=new Account(new Employee(name, yearOfHire, monthOfHire, dayOfHire), AccountType.SAVING, startAmount);
	}
	public void createRetirementAccount(double startAmount){
		retirementAcct=new Account(new Employee(name, yearOfHire, monthOfHire, dayOfHire), AccountType.RETIREMENT, startAmount);
	}
	public void deposit(AccountType accountType, double amount){
		switch (accountType) {
		case CHECKING:
			checkingAcct.makeDeposit(amount);
			break;
		case SAVING:
			savingAcct.makeDeposit(amount);
			break;
		case RETIREMENT:
			retirementAcct.makeDeposit(amount);
			break;

		}
		
	}
	public boolean withdraw(AccountType accountType, double withdranAmount){
		boolean flag = false;
		switch (accountType) {
		case CHECKING:
			flag=checkingAcct.makeWithdrawal(withdranAmount);
			break;
		case SAVING:
			flag=savingAcct.makeWithdrawal(withdranAmount);
			break;
		case RETIREMENT:
			flag=retirementAcct.makeWithdrawal(withdranAmount);
			break;
		}
		return flag;
	}
	public String getFormattedAccountInfo(){
		if (retirementAcct == null)
			return "\nACCOUNT INFO FOR : " + this.name + "\n\n" + savingAcct.toString() + "\n" + checkingAcct.toString()
					+ "\n";
		else
			return "\nACCOUNT INFO FOR : " + this.name + "\n\n" + savingAcct.toString() + "\n" + checkingAcct.toString()
					+ "\n" + retirementAcct.toString() + "\n";
		
	}

	public String getName() {
		return name;
	}


	public LocalDate getHireDate() {
		return hireDate;
	}

	
	

}
