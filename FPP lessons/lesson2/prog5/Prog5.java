package lesson2.prog5;

import java.util.Scanner;

public class Prog5 {
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String text=sc.nextLine();
		for(int i=0;i<text.length();++i){
			System.out.print( text.charAt(text.length()-1-i));
		}
		
	}

}
