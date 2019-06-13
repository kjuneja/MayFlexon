package collections;

import java.util.HashSet;
import java.util.Iterator;



public class HashSetExample {
	
	public static void main(String[] args) {
		HashSet<Character> hs = new HashSet<Character>();
		hs.add('a');
		hs.add('c');
		hs.add('t');
		hs.add('q');
		
		//System.out.println(hs);
		
		Iterator<Character> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}

}
