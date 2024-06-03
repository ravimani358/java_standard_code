package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Basic Operations
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 20);
        hashMap.put("Orange", 30);

        System.out.println("HashMap: " + hashMap); //--> {Apple=10, Orange=30, Banana=20}
        System.out.println("Value for key 'Banana': " + hashMap.get("Banana")); //-> 20
        System.out.println("Contains key 'Apple': " + hashMap.containsKey("Apple")); //-> true
        System.out.println("Contains value 20: " + hashMap.containsValue(20)); // true
        System.out.println("Size of HashMap: " + hashMap.size()); // 3

        // Iteration
        System.out.println("Keys: " + hashMap.keySet()); // Keys: [Apple, Orange, Banana]
        System.out.println("Values: " + hashMap.values()); //Values: [10, 30, 20]
        System.out.println("Entries: " + hashMap.entrySet()); // Entries: [Apple=10, Orange=30, Banana=20]

        // Remove an element
        hashMap.remove("Orange");
        System.out.println("After removing 'Orange': " + hashMap); // After removing 'Orange': {Apple=10, Banana=20}

        // Advanced Operations
        hashMap.putIfAbsent("Apple", 50); // Won't change "Apple" value as it already exists
        hashMap.putIfAbsent("Grapes", 40); // Will add "Grapes" as it does not exist

          }
}
