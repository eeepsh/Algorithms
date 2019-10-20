package Lesson3Peob1;

class Account {
	//public final static String CHECKING = "checking";
	//public final static String SAVINGS = "savings";
	//public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	public double balance;
	public String acctType;
	private Employee employee;

	Account(Employee emp, String acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, String acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {
		// implement
		balance=balance+deposit;
	}

	public boolean makeWithdrawal(double amount) {
		// implement
		if(amount<=balance){
		balance=balance-amount;
		return true;
	}
		return false;
}
}
