package lesson6.prog1;

public class MyTable {
	Entry[] entries = new Entry[26];
	
	public void add(char c, String s){
		//inserts the entry (c, s) into the table
		//by computing proper array index for c
		int i = (int) c - (int) 'a';
		entries[i] = new Entry(c,s);
	}
	public String get(char c){
		//returns the string in Entry table whose index
		//corresponds to the char c
		int i = (int)c - (int)'a';
		return entries[i].get();
	}
	
	public String toString() {
		String s = "";
		for(int i=0; i<entries.length; i++){
			if(entries[i]!=null) {
				s += entries[i].toString()+"\n";
			}
		}
		return s;
	}
	

	public static void main(String[] args){
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('w',"Willie");
		
		System.out.println(t.get('w'));
		System.out.println(t);
		
	}
	class Entry {
		
		char c;
		String s;
		
		Entry(char c,String  s) {
			// implementation
			this.c = c;
			this.s = s;
		}
		
		public String get(){
			return s;
		}

		public String toString() {
			// implementation
			return c + "->" + s;
		}
		
	}

}
