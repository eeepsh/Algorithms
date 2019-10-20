package lesson6.prog4;

import java.util.Arrays;

public class MainLambda {
	
	public static void main(String[] args) {
		String[] str={"Deepa","Sapkota","Ram","Hari"};
		StringSort myStringSort = new StringSort((String s1, String s2) -> {
			return s1.compareTo(s2);
		});
		
		String result[] = myStringSort.stringSort(str);
		System.out.println(Arrays.toString(result));
	
	}

}
