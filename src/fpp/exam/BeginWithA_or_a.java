package fpp.exam;


import java.util.ArrayList;

public class BeginWithA_or_a {
	public int howManyBeginWithA_or_a(ArrayList<String> arr) {
		int countA=0;
		for(String str:arr) {
			if(str.charAt(0)=='A' || str.charAt(0)=='a') {
				++countA;
			}
		}
		return countA;
	}

}
