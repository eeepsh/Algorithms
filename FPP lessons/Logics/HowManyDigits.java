package fpp.exam;


public class HowManyDigits {
	public int howManyDigits(String string) {
		char ch;
		int count=0;
		for(int i=0; i<string.length();++i) {
			ch=string.charAt(i);
			if(ch>='0' && ch <='9') {
				++count;
			}
		}
		return count;
	}

}
