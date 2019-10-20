package fpp.exam;


public class PrintPattern {
	public static void main(String[] args) {
		for(int row=1;row<=7;++row) {
			for(int col=0; col<row;++col) {
				System.out.print((row*10)+2*col+" ");
			}
			System.out.println();
		}
	}

}
