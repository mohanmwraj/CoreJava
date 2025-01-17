package Collections;

/*
 * Java LinkedHashMap class is Hashtable and Linked list implementation of the Map interface,
 * with predictable iteration order.
 * It inherits HashMap class and implements the Map interface.
 *
    Java LinkedHashMap contains values based on the key.
    Java LinkedHashMap contains unique elements.
    Java LinkedHashMap may have one null key and multiple null values.
    Java LinkedHashMap is non synchronized.
    Java LinkedHashMap maintains insertion order.
    The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
 *
 *     public class LinkedHashMap<K,V> extends HashMap<K,V> implements Map<K,V>
 *
 */


import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();

        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");

        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        //Fetching key
        System.out.println("Keys: "+map.keySet()); //Keys: [100, 101, 102]
        //Fetching value
        System.out.println("Values: "+map.values()); //Values: [Amit, Vijay, Rahul]
        //Fetching key-value pair
        System.out.println("Key-Value pairs: "+map.entrySet()); // Key-Value pairs: [100=Amit, 101=Vijay, 102=Rahul]
    }
}
