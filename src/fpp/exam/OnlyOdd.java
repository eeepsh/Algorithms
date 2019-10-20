package fpp.exam;


public class OnlyOdd {
	public int[] onlyOdd(int[] numbers) {
		int[] oddNums= new int[numbers.length];
		int pos=0;
		for(int num:numbers) {
			if(num%2!=0) {
				oddNums[pos]=num;
				++pos;
			}
		}
		int[] finalResult= new int[pos];
		for(int i=0;i<pos;++i) {
			finalResult[i]=oddNums[i];
		}
		return finalResult;
	}

}
