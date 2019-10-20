package fpp.exam;


import java.util.ArrayList;

public class ShortestString {
	public String returnStringWithShortestLength(ArrayList<String> arr) {
		int reqPos=0;
		int shortLength=arr.get(0).length();
		for(int i=0; i<arr.size();++i) {
			if(shortLength>arr.get(i).length()) {
				shortLength=arr.get(i).length();
				reqPos=i;
			}
		}
		return arr.get(reqPos);
	}

}
