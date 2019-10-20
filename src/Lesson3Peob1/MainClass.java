package Lesson3Peob1;

public class MainClass {
	public static void main(String[] arg){
		Employee e=new Employee("Deepa","eeps",23276,2015,12,10);
		Account acc1=new Account(e, "CHECKING",300);
		Account acc2= new Account(e,"Saving",300);
		Account acc3=new Account(e,"retirement",300);
		System.out.println(acc1.toString()+"\n"+ acc2.toString() + "\n "+ acc3.toString());
	}

}
