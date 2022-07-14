import java.util.*;
public class mapex {
	
	public static void main(String args[]) {
		Map m = new HashMap();
		
		m.put(1, "VIRAT");
		m.put(2, "kaushik");
		m.put(3, "kaushik");
		
		System.out.println(m);
		
		Set s = m.entrySet();
		
		Iterator i = s.iterator();
		
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
		
		
	}

}
