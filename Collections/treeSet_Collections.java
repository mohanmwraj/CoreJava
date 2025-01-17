package Collections;

/*
 * Java TreeSet class implements the Set interface that uses a tree for storage.
 * Like HashSet, TreeSet also contains unique elements.
 * However, the access and retrieval time of TreeSet is quite fast.
 * The elements in TreeSet stored in ascending order.
 *
 *
 * Java TreeSet class implements the Set interface that uses a tree for storage.
 *
 * It inherits AbstractSet class and implements the NavigableSet interface.
 * The objects of the TreeSet class are stored in ascending order.
 *
 * The important points about the Java TreeSet class are:

    Java TreeSet class contains unique elements only like HashSet.
    Java TreeSet class access and retrieval times are quiet fast.
    Java TreeSet class doesn't allow null element.
    Java TreeSet class is non synchronized.
    Java TreeSet class maintains ascending order.

    Java TreeSet class contains unique elements only like HashSet.
    Java TreeSet class access and retrieval times are quite fast.
    Java TreeSet class doesn't allow null elements.
    Java TreeSet class is non-synchronized.
    Java TreeSet class maintains ascending order.
    The TreeSet can only allow those generic types that are comparable.
    For example, the Comparable interface is being implemented by the StringBuffer class.

* TreeSet is being implemented using a binary search tree, which is self-balancing just like a Red-Black Tree.
* Therefore, operations such as a search, remove, and add consume O(log(N)) time.
 */


/*

Synchronization of The TreeSet Class

the TreeSet class is not synchronized.
It means if more than one thread concurrently accesses a tree set,
and one of the accessing threads modify it, then the synchronization must be done manually.
It is usually done by doing some object synchronization that encapsulates the set.
However, in the case where no such object is found, then the set must be wrapped with the help of the Collections.synchronizedSet() method.
It is advised to use the method during creation time in order to avoid the unsynchronized access of the set.
The following code snippet shows the same.

    TreeSet treeSet = new TreeSet();
    Set syncrSet = Collections.synchronziedSet(treeSet);

    public class TreeSet<e> extends AbstractSet<e> implements NavigableSet<e>, Cloneable, Serializable
    </e></e></e>

 */
import java.util.*;

public class treeSet_Collections {
    public static void main(String[] args) {
        TreeSet<String> set=new TreeSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");

        //traversing elements
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        TreeSet<Integer> set1=new TreeSet<Integer>();
        set1.add(24);
        set1.add(66);
        set1.add(12);
        set1.add(15);
        System.out.println("Lowest Value: "+set1.pollFirst()); // 12
        System.out.println("Highest Value: "+set1.pollLast()); //66


        TreeSet<String> set2 = new TreeSet<String>();
        set2.add("A");
        set2.add("B");
        set2.add("C");
        set2.add("D");
        set2.add("E");
        System.out.println("Initial Set: "+set2); //Initial Set: [A, B, C, D, E]
        System.out.println("Reverse Set: "+set2.descendingSet()); //Reverse Set: [E, D, C, B, A]
        System.out.println("Head Set: "+set2.headSet("C", true));// Head Set: [A, B, C]
        System.out.println("SubSet: "+set2.subSet("A", false, "E", true)); //SubSet: [B, C, D, E]
        System.out.println("TailSet: "+set2.tailSet("C", false)); //TailSet: [D, E]

        System.out.println("Intial Set: "+set2); // Intial Set: [A, B, C, D, E]
        System.out.println("Head Set: "+set2.headSet("C")); // Head Set: [A, B]
        System.out.println("SubSet: "+set2.subSet("A", "E")); // SubSet: [A, B, C, D]
        System.out.println("TailSet: "+set2.tailSet("C")); // TailSet: [C, D, E]
    }
}
