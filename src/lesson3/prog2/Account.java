package lesson3.prog2;

public class Account {
	private final static double DEFAULT_BALANCE = 0.0;
	public double balance;
	public AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + this.acctType + ", currentBalance = " + this.balance;
	}

	public void makeDeposit(double deposit) {
		// implement
		this.balance=balance+deposit;
	}

	public boolean makeWithdrawal(double amount) {
		// implement
		if(amount<this.balance){
			this.balance-=amount;
			return true;
		}
		return false;
	}
	
	public double computeInterest(){
		return 0;
	}
}
