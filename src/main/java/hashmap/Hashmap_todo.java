package hashmap;

	import java.util.LinkedHashMap;
	import java.util.Map;

	public class Hashmap_todo {
	    public static void main(String[] args) {
	        // Creating a LinkedHashMap with access order
	        Map<String, String> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
	        linkedHashMap.put("one", "1");
	        linkedHashMap.put("two", "2");
	        linkedHashMap.put("three", "3");
	        
	        System.out.println(linkedHashMap.entrySet());

	        // Accessing some elements
	        linkedHashMap.get("one");
	        linkedHashMap.get("three");
	        
	        System.out.println(linkedHashMap.entrySet());
	        
	    }
	}