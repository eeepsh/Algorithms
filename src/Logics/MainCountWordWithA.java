package fpp.exam;

import java.util.ArrayList;

public class MainCountWordWithA {
	public static void main(String[] args) {
		ArrayList<String> strList= new ArrayList<>();
		strList.add("Hey");
		strList.add("Array");
		strList.add("qey");
		strList.add("yrray");
		strList.add("appleey");
		strList.add("Hurray");
		System.out.println(new BeginWithA_or_a().howManyBeginWithA_or_a(strList));
	}

}
