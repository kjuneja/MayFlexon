package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(3, "Manpreet");
		map.put(1, "Kunal");
		map.put(2, "Neel");
		map.put(4, "Tanay");
		
		//System.out.println(map.entrySet());
		//System.out.println(map);
		
		for(Map.Entry m: map.entrySet()) {
			System.out.println(m.getKey() + " "+ m.getValue());
		}
		
		for(int i =1; i<=map.size(); i++) {
			
			System.out.println(i+" " +map.get(i));
		}
		
	}

}
