package lesson11.prog2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Schur {
	// int b;
	public Schur() {
		// this.b=b;
		// TODO Auto-generated constructor stub
	}

	public boolean checkForSum(List<Integer> list, Integer Z) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int sum = 0;
		// int x=0;
		for (int i = 0; i < list.size(); i++) {

			sum = list.get(i) + list.get(i);
			if (sum == Z) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] arg) {
		Integer[] array = { 3, 2, 9, 4, 7, 6 };
		List<Integer> testList = Arrays.asList(array);
		Schur s = new Schur();
		// s.checkForSum(l, 7);
		System.out.print(s.checkForSum(testList, 7));

	}

}
