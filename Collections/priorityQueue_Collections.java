package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

/*
 * The PriorityQueue class implements the Queue interface.
 * It holds the elements or objects which are to be processed by their priorities.
 * PriorityQueue doesn't allow null values to be stored in the queue.
 */
public class priorityQueue_Collections {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Amit Sharma");
        queue.add("Vijay Raj");
        queue.add("JaiShankar");
        queue.add("Raj");

        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");

        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");

        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
