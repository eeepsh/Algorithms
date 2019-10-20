package fpp.exam;


import java.util.ArrayList;

public class MainShortestLength {
	public static void main(String[] args) {
		ArrayList<String> strList=new ArrayList<>();
		strList.add("Heyo");
		strList.add("Hiear");
		strList.add("Human");
		strList.add("Man");
		System.out.println(new ShortestString().returnStringWithShortestLength(strList));
	}

}
