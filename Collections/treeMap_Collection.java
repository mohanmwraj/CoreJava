package Collections;

/*
 * TreeHashMap
 *
 * TreeMap in Java is a sorted map implementation that stores key-value pairing in a Red-Black tree structure.
 * It guarantees that the elements are arranged in relation to their keys, either naturally or by a user-defined comparator.
 * This data structure offers operations of O(log n) time-efficiency for insertion, deletion, and retrieval.
 * TreeMap implements the NavigableMap interface, providing navigation and range-based operation methods.
 * Several usage examples include keeping the dictionaries in sorted order, implementing range search, and running the data in a sorted manner.
 *
 *
 * Java TreeMap class is a red-black tree-based implementation.
 * It provides an efficient means of storing key-value pairs in sorted order.
 * The java.util package contains the Java TreeMap class, which is a component of the Java Collections Framework.
 * It extends the AbstractMap class and implements the NavigableMap interface.
 * TreeMap is an effective red-black tree-based solution that sorts key-value pairs.
 * TreeMap works well in situations where ordered key-value pairs are necessary since it preserves ascending order.
 * It also only includes distinct components, guaranteeing that every key corresponds to a single value.
 * TreeMap can have more than one null value, even if it cannot have a null key.
 * The important points about Java TreeMap class are:

    Java TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
    Java TreeMap contains only unique elements.
    Java TreeMap cannot have a null key but can have multiple null values.
    Java TreeMap is non synchronized.
    Java TreeMap maintains ascending order.
 *
 *     public class TreeMap<k ,v> extends AbstractMap<k ,v> implements NavigableMap<k ,v>, Cloneable, Serializable
    </k></k></k>
 *
 *
 *
 *
 */


import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class treeMap_Collection {
    public static void main(String[] args) {
        // Creating a TreeMap to store student IDs and their corresponding names
        TreeMap<Integer, String> studentMap = new TreeMap<>();

        // Adding some student records to the TreeMap
        studentMap.put(1003, "Michael Johnson");
        studentMap.put(1001, "John Smith");
        studentMap.put(1002, "Emily Brown");

        // Iterating over the entries of the TreeMap and printing each key-value pair
        System.out.println("Student Records:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        NavigableMap<Integer ,String> map = new TreeMap<Integer ,String>();
        map.put(100,"Amit");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");

        //Maintains descending order
        System.out.println("descendingMap: "+map.descendingMap()); // descendingMap: {103=Rahul, 102=Ravi, 101=Vijay, 100=Amit}

        //Returns key-value pairs whose keys are less than or equal to the specified key.
        System.out.println("headMap: "+map.headMap(102,true)); // headMap: {100=Amit, 101=Vijay, 102=Ravi}

        //Returns key-value pairs whose keys are greater than or equal to the specified key.
        System.out.println("tailMap: "+map.tailMap(102,true)); // tailMap: {102=Ravi, 103=Rahul}

        //Returns key-value pairs exists in between the specified key.
        System.out.println("subMap: "+map.subMap(100, false, 102, true)); // subMap: {101=Vijay, 102=Ravi}

        //Returns key-value pairs whose keys are less than the specified key.
        System.out.println("headMap: "+map.headMap(102)); //headMap: {100=Amit, 101=Vijay}

        //Returns key-value pairs whose keys are greater than or equal to the specified key.
        System.out.println("tailMap: "+map.tailMap(102)); //tailMap: {102=Ravi, 103=Rahul}

        //Returns key-value pairs exists in between the specified key.
        System.out.println("subMap: "+map.subMap(100, 102)); // subMap: {100=Amit, 101=Vijay}
    }
}
