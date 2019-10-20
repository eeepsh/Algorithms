package lesson2.prog7;
/**
 *  As a hint to Prog9, try running this code and
 *  then examine how it works.
 */
public class Prog7Hint {
	public static void main(String[] args){
		String output = "";
		int x=RandomNumbers.getRandomInt();
		output = String.format("%16d %12d %n %n", RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99));
		output += String.format("%13s %2d %9s %2d %n","+", RandomNumbers.getRandomInt(1, 99), "+", RandomNumbers.getRandomInt(1, 99));
		output += String.format("%16s %12s","____", "____");
		System.out.println(output);
	}
}