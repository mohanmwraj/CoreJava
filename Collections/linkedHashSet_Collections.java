package Collections;

/*
 * LinkedHashSet class represents the LinkedList implementation of Set Interface.
 * It extends the HashSet class and implements Set interface.
 * Like HashSet, It also contains unique elements.
 * It maintains the insertion order and permits null elements.
 *
 *
 *
 *
 * Java LinkedHashSet class is a Hashtable and Linked list implementation of the Set interface.
 * It inherits the HashSet class and implements the Set interface.
 *
 * The important points about the Java LinkedHashSet class are:
 *
    1. Java LinkedHashSet class contains unique elements only like HashSet.
    2. Java LinkedHashSet class provides all optional set operations and permits null elements.
    3. Java LinkedHashSet class is non-synchronized.
    4. Java LinkedHashSet class maintains insertion order.

* Note: Keeping the insertion order in the LinkedHashset has some additional costs, both in terms of extra memory and extra CPU cycles.
*
 */

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedHashSet_Collections {
    public static void main(String[] args) {
        LinkedHashSet<String> set=new LinkedHashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");

        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        // Adding elements to the above Set
        // by invoking the add() method
        lhs.add("Java");
        lhs.add("T");
        lhs.add("Point");
        lhs.add("Good");
        lhs.add("Website");

        // displaying all the elements on the console
        System.out.println("The hash set is: " + lhs);

        // Removing an element from the above linked Set

        // since the element "Good" is present, therefore, the method remove()
        // returns true
        System.out.println(lhs.remove("Good"));

        // After removing the element
        System.out.println("After removing the element, the hash set is: " + lhs);

        // since the element "For" is not present, therefore, the method remove()
        // returns false
        System.out.println(lhs.remove("For"));
    }
}
