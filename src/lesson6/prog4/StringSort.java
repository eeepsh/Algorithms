package lesson6.prog4;

import java.util.Arrays;
import java.util.Comparator;

public class StringSort {
	private Comparator<String> myComparator;

	StringSort(Comparator<String> myComparator) {
		this.myComparator = myComparator;
	}

	public String[] stringSort(String[] arr) {
		Arrays.sort(arr, myComparator);
		return arr;
	}

	static class LengthCompare implements Comparator<String> {

		@Override
		public int compare(String s1, String s2) {
			if (s1.length() < s2.length())
				return -1;
			if (s1.length() > s2.length())
				return 1;

			return 0;
		}

	}

}
