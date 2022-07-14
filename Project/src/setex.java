import java.util.*;
public class setex {
	
	public static void main(String args[]) {
		// no duplicate value is allowed
		// data is stored in random order
//		Set s = new HashSet();
//		
//		s.add(10);
//		s.add(20);
//		s.add(30);
//		s.add(40);
//		s.add(null);
//		s.add(10);
//		s.add(null);
//		
//		System.out.println(s);
//		
		
	// data is inserted acc. to insertion order
		// duplicate is not allowed
//     Set s = new LinkedHashSet();
//		
//		s.add(10);
//		s.add(20);
//		s.add(30);
//		s.add(40);
//		s.add(null);
//		s.add(10);
//		s.add(null);
//		
//		System.out.println(s);
//		
		
		
// data is stored in ascending order
		// null is not allowed
		//duplicate is not allowed
     Set s = new TreeSet();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(50);
		s.add(40);
		s.add(10);
	
		System.out.println(s);
		
	}

}
