package lesson2.prog2;

public class Prog2 {
	public static void main(String[] arg){
		int x = RandomNumbers.getRandomInt(1,9);
		double result1=Math.pow(Math.PI, x);
		
		int y= RandomNumbers.getRandomInt(3,14);
		double result2=Math.pow(y, Math.PI);
		System.out.println(result1 +","+result2);
	}

}
