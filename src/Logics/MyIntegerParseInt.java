package fpp.exam;


public class MyIntegerParseInt {
	public int myIntegerParseInt(String str) {
		char ch;
		int tempNum=0;
		int result=0;
		for(int i=0; i<str.length();++i) {
			ch=str.charAt(i);
			tempNum=(int)ch-48;
			result=(result*10)+tempNum;
		}
		return result;
	}
}
