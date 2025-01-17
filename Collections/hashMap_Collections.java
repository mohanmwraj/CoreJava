package Collections;

/*
 * HashMap in Java is a key-value data structure offering efficient data access via keys using hashing.
 * Hashing converts large strings or other objects into smaller, consistent values for quick indexing and searching.
 * HashMap implements the Map interface and is used for managing large datasets efficiently.
 * Additionally, HashSet uses HashMap internally to store elements uniquely,
 * demonstrating the utility of hashing in Java's collections framework for fast data retrieval and management.
 */

import java.util.HashMap;
import java.util.Map;

public class hashMap_Collections {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        // Adding key-value pairs to the HashMap
        map.put("Alice", 10);
        map.put("Bob", 20);
        map.put("Charlie", 30);

        // Retrieving a value
        System.out.println("Value for 'Alice': " + map.get("Alice"));

        // Iterating over key-value pairs
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        // Removing a key-value pair
        map.remove("Charlie");

        // Checking the presence of a key
        if (map.containsKey("Bob")) {
            System.out.println("Map contains key 'Bob'.");
        }
    }
}
