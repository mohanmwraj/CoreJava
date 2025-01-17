package Collections;

/*
 * ArrayDeque class implements the Deque interface.
 * It facilitates us to use the Deque.
 * Unlike queue, we can add or delete the elements from both the ends.
 *
 * ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.
 * The important points about ArrayDeque class are:

    Unlike Queue, we can add or remove elements from both sides.
    Null elements are not allowed in the ArrayDeque.
    ArrayDeque is not thread safe, in the absence of external synchronization.
    ArrayDeque has no capacity restrictions.
    ArrayDeque is faster than LinkedList and Stack.
 *
 *
 *     public class ArrayDeque<E> extends AbstractCollection<E> implements Deque<E>, Cloneable, Serializable
 *
 */
import java.util.*;

public class arrayDeque_Collection {
    public static void main(String[] args) {
        //Creating Deque and adding elements
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Gautam");
        deque.add("Karan");
        deque.add("Ajay");
        //Traversing elements
        for (String str : deque) {
            System.out.println(str);
        }

        Deque<String> deque1 =new ArrayDeque<String>();
        deque1.offer("arvind");
        deque1.offer("vimal");
        deque1.add("mukul");
        deque1.offerFirst("jai");
        System.out.println("After offerFirst Traversal...");
        for(String s:deque1){
            System.out.println(s);
        }
        //deque.poll();
        //deque.pollFirst();//it is same as poll()
        deque1.pollLast();
        System.out.println("After pollLast() Traversal...");
        for(String s:deque1){
            System.out.println(s);
        }
    }
}
