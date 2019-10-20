package lesson7.prog3;

public class BinSearch {
	public static void main(String[] arg){
		BinSearch bs=new BinSearch();
		boolean result=bs.Search("abcdefghijklmnop", 'g');
		
	}
	
	public boolean Search(String s, char c){
		int m=s.length()/2;
		char ch=s.charAt(m);
		//return false;
		
		if(ch==c) return true;
		else if(c<=ch) {
			return true;
		}
		else if(c>=ch) {
			return true;
		}
		return false;
			
			
	
		
		
	}

}
