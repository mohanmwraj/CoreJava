package Collections;

/*
 * HashMap in Java is a key-value data structure offering efficient data access via keys using hashing.
 * Hashing converts large strings or other objects into smaller, consistent values for quick indexing and searching.
 * HashMap implements the Map interface and is used for managing large datasets efficiently.
 * Additionally, HashSet uses HashMap internally to store elements uniquely,
 * demonstrating the utility of hashing in Java's collections framework for fast data retrieval and management.
 *
 *
 *
    Java HashMap contains values based on the key.
    Java HashMap contains only unique keys.
    Java HashMap may have one null key and multiple null values.
    Java HashMap is non synchronized.
    Java HashMap maintains no order.
    The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.

*     public class HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable
*
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

        /*
         *    put()
         *    putIfAbsent()
         *    putAll()
         */
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        System.out.println("Initial list of elements: "+hm);
        hm.put(100,"Amit");
        hm.put(101,"Vijay");
        hm.put(102,"Rahul");

        System.out.println("After invoking put() method ");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        hm.putIfAbsent(103, "Gaurav");
        System.out.println("After invoking putIfAbsent() method ");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        HashMap<Integer,String> map1=new HashMap<Integer,String>();
        map1.put(104,"Ravi");
        map1.putAll(hm);

        System.out.println("After invoking putAll() method ");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        /*
        //////////////// REMOVE OPERATIONS/////////////
         *   remove
         *    - Key Based Removals
         *    - Key and Value Based Removals
         */

        HashMap<Integer,String> map3=new HashMap<Integer,String>();
        map3.put(100,"Amit");
        map3.put(101,"Vijay");
        map3.put(102,"Rahul");
        map3.put(103, "Gaurav");
        System.out.println("Initial list of elements: "+map3);
        //key-based removal
        map3.remove(100);
        System.out.println("Updated list of elements: "+map3);
//        //value-based removal
//        map3.rem
//        System.out.println("Updated list of elements: "+map3);
        //key-value pair based removal
        map3.remove(102, "Rahul");
        System.out.println("Updated list of elements: "+map3);

        /*
         * Replace Elements
         *  - replace()
         *  - replaceAll()
         */
        HashMap<Integer,String> map4 = new HashMap<Integer,String>();
        map4.put(100,"Amit");
        map4.put(101,"Vijay");
        map4.put(102,"Rahul");

        System.out.println("Initial list of elements:");
        for(Map.Entry m:map4.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println("Updated list of elements:");
        map4.replace(102, "Gaurav");
        for(Map.Entry m:map4.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println("Updated list of elements:");
        map4.replace(101, "Vijay", "Ravi");
        for(Map.Entry m:map4.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("Updated list of elements:");
        map4.replaceAll((k,v) -> "Ajay");
        for(Map.Entry m:map4.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
