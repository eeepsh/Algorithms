package lesson2.prog6;

public class prog6 {

	public static void main(String[] arg) {
		String[] testData = { "horse", "dog", "cat", "horse", "dog" };
		for(String x:removeDups(testData)){
			if(x!=null){
				System.out.println(x);
				
			}
		}
	}

	public static String[] removeDups(String[] a) {
		if (a.length == 0 || a.length == 1 || a == null) {
			return a;
		}
		int size=a.length;
		
		String[] arr = new String[a.length];
		for (int i=0;i<size;i++) {
//			if(arr[i]null){
//				arr[i]=a[i];
//				
//			}
//			arr[i]=a[i];
//			System.out.println("new array is "+ arr[i]);
//			

		}
		
		return arr;
	}

}
