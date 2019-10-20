package fpp.exam;


public class MainAlwaysGreater {
	public static void main(String[] args) {
		int[][] arr1 = {
				{1,11,12,23},
				{10,15,46,76}
		};
		int[][] arr2= {
				{1,2,3,4},
				{2,3,5,4}
		};
		System.out.println(new AlwaysGreater().alwaysGreaterThan(arr1, arr2));
	}
}
