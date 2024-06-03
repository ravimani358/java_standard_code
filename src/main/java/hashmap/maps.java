package hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class maps {

	public static void main(String[] args) {
		Map<Integer, String> list_map = new HashMap<>();
		
		Map<String, Integer> list_map1 = new LinkedHashMap<>();
		
		NavigableMap<String, String> list_map2 = new TreeMap<>();
		
		list_map2.put("A", "1");
		list_map2.put("B", "2");
		list_map2.put("C", "3");
		list_map2.put("D", "4");
		list_map2.put("E", "5");
		list_map2.put("F", "6");
		
		System.out.println(list_map2.lowerKey("D"));
		

		
		
		
		
		

	}

}
