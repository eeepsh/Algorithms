package lesson4.prog1;


public class Secretary extends DeptEmployee{
	private double overTimeHours=200;
	
	public Secretary(String name, double salary, int year, int month, int day, double oT){
		super(name,salary,year,month,day);
		this.overTimeHours=oT;
	}

	public double getOverTimeHours() {
		return overTimeHours;
	}

	public void setOverTimeHours(double overTimeHours) {
		this.overTimeHours = overTimeHours;
	}
	@Override
	public double computeSalary(){
		return(salary+12*overTimeHours);
	}
	

}
