import java.util.*;
public class stackex {
	
	public static void main(String args[]) {
		
		Stack s = new Stack();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		System.out.println(s);
		
		for(int i=0;i<s.size();)
		s.pop();
		
        System.out.println(s);
     	System.out.println(s.peek());
		
	}
}
