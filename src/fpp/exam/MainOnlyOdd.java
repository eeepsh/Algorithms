package fpp.exam;


public class MainOnlyOdd {
	public static void main(String[] args) {
		int[] nums = {0,1,4,5,6,7,8,3};
		int[] res = new OnlyOdd().onlyOdd(nums);
		for(int i=0; i<res.length;++i) {
			System.out.print(res[i] + " ");
		}
	}

}
