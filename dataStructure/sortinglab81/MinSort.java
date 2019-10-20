package dataStructure.sortinglab81;

import java.util.Arrays;

public class MinSort {
	String[] arr;

	MinSort(String[] arr) {
		this.arr = arr;
	}

	public String[] sort() {
		if (arr == null || arr.length <= 1)
			return arr;
		
		for (int i = 0; i < arr.length; ++i) {
			int nextMinPos = minpos(i, arr.length - 1);
			swap(i, nextMinPos);
		}
		return arr;

	}

	void swap(int i, int j) {
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	// find minimum of arr between the indices bottom and top
	public int minpos(int bottom, int top) {
		String m = arr[bottom];
		int index = bottom;
		for (int i = bottom + 1; i <= top; ++i) {
			if (arr[i].compareTo(m) < 0) {
				m = arr[i];
				index = i;
			}
		}
		// return location of min, not the min itself
		return index;
	}

	public static void main(String[] args) {
		String[] test1 = {"big", "small", "tall","short","round","square", "enormous","tiny",
				"gargantuan","liiputian","numberless","none","vast", "miniscule"};
		MinSort ss = new MinSort(test1);
		ss.sort();
		System.out.println(Arrays.toString(ss.arr));

	}
}