package fpp.exam;

public class AlwaysGreater {
	public boolean alwaysGreaterThan(int[][] arr1, int[][] arr2) {
		if(arr1.length!=arr2.length || arr1[0].length!=arr2[0].length) {
			return false;
		}else if(arr1==null || arr2 == null) {
			return false;
		}else {
			for(int row=0; row<arr1.length;row++) {
				for(int col=0; col<arr1[0].length;col++) {
					if(arr1[row][col]<=arr2[row][col]) {
						return false;
					}
				}
			}
			return true;
		}
	}

}
