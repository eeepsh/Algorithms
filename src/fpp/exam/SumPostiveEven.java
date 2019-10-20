package fpp.exam;


public class SumPostiveEven {
	public int sumPositiveEven(int N) {
		if(N==1) {
			return 2;
		}else {
			return 2*N+sumPositiveEven(N-1);
		}
	}

}
