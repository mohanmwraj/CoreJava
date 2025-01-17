package Collections;

import java.util.Hashtable;

/*
 * Hashtable in Java is a data structure in which each key is unique and is used to store key-value pairs.
 * It belongs to Java.util package, which implements Map interface in order to work with the elements it includes.
 * An important characteristic of a Hashtable is its capability of providing rapid lookup and insertion operations.
 * Points to Remember
    A Hashtable is an array of a list. Each list is known as a bucket. The position of the bucket is identified by calling the hashcode() method.
    A Hashtable contains values based on the key.
    Java Hashtable class contains unique elements.
    Java Hashtable class doesn't allow null key or value.
    Java Hashtable class is synchronized.
    The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
 *
 *     public class Hashtable<k ,v> extends Dictionary<k ,v> implements Map<k ,v>, Cloneable, Serializable
    </k></k></k>
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
public class hashTable_Collection {
    public static void main(String[] args) {
        // Creating an empty hashtable with specified initial capacity and load factor
        int initialCapacity = 20;
        float loadFactor = 0.5f; // Custom load factor
        Hashtable<String , Integer> hashtable = new Hashtable<>(initialCapacity, loadFactor);
        // Print the hashtable
        System.out.println("Hashtable: " + hashtable);

        Hashtable<Integer ,String> map=new Hashtable<Integer ,String>();
        map.put(100,"Amit");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");
        //Here, we specify the if and else statement as arguments of the method
        System.out.println(map.getOrDefault(101, "Not Found"));
        System.out.println(map.getOrDefault(105, "Not Found"));

        System.out.println("Initial Map: "+map); //Initial Map: {103=Rahul, 102=Ravi, 101=Vijay, 100=Amit}
        //Inserts, as the specified pair is unique
        map.putIfAbsent(104,"Gaurav");
        System.out.println("Updated Map: "+map); // Updated Map: {104=Gaurav, 103=Rahul, 102=Ravi, 101=Vijay, 100=Amit}
        //Returns the current value, as the specified pair already exist
        map.putIfAbsent(101,"Vijay");
        System.out.println("Updated Map: "+map); // Updated Map: {104=Gaurav, 103=Rahul, 102=Ravi, 101=Vijay, 100=Amit}
    }
}
