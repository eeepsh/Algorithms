package lesson11.prog3;
import java.util.*;
public class Admin {
	
	
	 
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		
		HashMap<Key, Student> map = new HashMap<Key, Student>();
		for(Student s:students){
			Key key =new Key(s.getFirstName(),s.getLastName());
			map.put( key , s);
			
			
		}
		
		
		return map ;
		
			
}
}