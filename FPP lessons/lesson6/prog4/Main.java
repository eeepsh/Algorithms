package lesson6.prog4;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String[] str={"Deepa","Sapkota","Ram","Hari"};
		StringSort.LengthCompare comp = new StringSort.LengthCompare();
		StringSort str1 =new StringSort(comp);
		String[] res = str1.stringSort(str);
		System.out.println(Arrays.toString(res));
	}

}
