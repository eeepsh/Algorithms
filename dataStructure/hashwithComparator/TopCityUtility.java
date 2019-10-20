package dataStructure.hashwithComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TopCityUtility {
	/*
	 * this method takes the first argument as Hashtable with Country name as
	 * key and its top cities as values. Second argument is List of Cities as
	 * String. This method need to return the list of top cities which match
	 * with the cities in the Hash Table
	 */

	public static List<TopCity> CityPopulation(Hashtable<String, List<TopCity>> table, List<String> list) {
		// IMPLEMENT
		List<TopCity> finalList= new ArrayList<>();
		List<TopCity> listToAddHashList=new ArrayList<>();
		
		Set<String> keys=table.keySet();
		for(String key: keys){
			listToAddHashList.addAll(table.get(key));
		}
		for(String listObject:list){
			Iterator<TopCity> it= listToAddHashList.iterator();
			while(it.hasNext()){
				TopCity topCity=it.next();
				if(listObject.equals(topCity.getCname())){
					finalList.add(topCity);
				}
			}
		}
		return finalList;

	}

	// This method helps to sort the collection based on user requirements.
	public static void sort(String Country, String sorttype, Hashtable<String, List<TopCity>> table) {

		//List<TopCity> temp = new ArrayList<>();
		Set<String> keys = table.keySet(); // key set purai taneko
		List<TopCity> tc = new ArrayList<>();

		for (String key : keys) { // sab keys ma loop lagao
			if (key.equalsIgnoreCase(Country)) { // country sanga compare gareko
				tc.addAll(table.get(key));// true huda sabai data of hash map
											// jun key le pont garecha list ma
											// add gareko
			}
		}
		Comparator<TopCity> cp = new Comparator<TopCity>() {

			@Override
			public int compare(TopCity o1, TopCity o2) {

				TopCity obj1 = (TopCity) o1;
				TopCity obj2 = (TopCity) o2;
				if (sorttype.equalsIgnoreCase("byname"))
					return obj1.getCname().compareTo(obj2.getCname());
				else
					return (int) (obj1.getPop() - obj2.getPop());
				// TODO Auto-generated method stub

			}
		};
		Collections.sort(tc,cp);
		System.out.println(tc);

	}

	/*
	 * public void sort(List<Employee> emps, SortMethod method) {
	 * Collections.sort(emps, (e1,e2) -> { //local variable method must be
	 * effectively final, //but not necessarily final if(method ==
	 * SortMethod.BYNAME) { //instance vble ignoreCase does not need to be
	 * effectively final if(ignoreCase) return
	 * e1.name.compareToIgnoreCase(e2.name); else return
	 * e1.name.compareTo(e2.name); } else { if(e1.salary == e2.salary) return 0;
	 * else if(e1.salary < e2.salary) return -1; else return 1; } }); }
	 */

}
