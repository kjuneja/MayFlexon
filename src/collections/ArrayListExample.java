package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("c");
		a1.add("p");
		a1.add("a");
		//Collections.sort(a1);
		System.out.println("Your element at index 1 is " + a1.get(1));
		System.out.println(a1.isEmpty());
		System.out.println(a1.size());
		System.out.println(a1);
		
		Iterator<String> i = a1.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	}

}
