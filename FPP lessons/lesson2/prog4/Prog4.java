package lesson2.prog4;

public class Prog4 {
	public static void main(String[] arg){
		String[] values=Data.records.split(":");
		for(String oneByOneIndex:values){
			System.out.println(oneByOneIndex.split(",")[0]);
		}
	}

}
