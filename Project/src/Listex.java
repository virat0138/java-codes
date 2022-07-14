import java.util.*;


public class Listex {
	public static void main(String args[]) {
		LinkedList l1 = new LinkedList();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		System.out.println(l1);
		l1.add(50);
		System.out.println(l1);
		
		ListIterator i1 = l1.listIterator();
		
		while(i1.hasNext()) {
			System.out.println(i1.next());
			System.out.println(i1.hasPrevious());
			System.out.println(i1.hasNext());
			System.out.println(i1.previousIndex());
			System.out.println(i1.nextIndex());
		}
		
	}
}
