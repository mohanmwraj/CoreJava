package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;
/*
 * The ArrayList class implements the List interface.
 * It uses a dynamic array to store the duplicate element of different data types.
 * The ArrayList class maintains the insertion order and is non-synchronized.
 * The elements stored in the ArrayList class can be randomly accessed.
 *
 */

/*
    ArrayList extends Abstractlist implements List extends Collections extends iterable.
    The Important points of ArrayList Class are:
    - Maintains Insertion Order
    - Non-Synchronized
    - Supports Random Access
    - Slower Manipulation compared to LinkedList
    - Requires Wrapper Classes for Primitive Types
    - Dynamic Resizing


   public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable

    - implements RandomAccess: Indicates that the RandomAccess marker interface is implemented by the ArrayList class.
      This interface is a flag for classes that provide fast (constant time) random access to their elements.

    - implements Cloneable: States that the ArrayList class implements the Cloneable marker interface.
      This interface signifies that ArrayList instances can be cloned using the clone() method.

    - implements Serializable: This shows that the ArrayList class implements the Serializable marker interface.
      This interface makes instances of the ArrayList class serializable (converted into a byte stream) for storage or transmission.

 */

/*
    Array List Constructors

    - ArrayList()
    - ArrayList(Collection<? extends E> c)
    - ArrayList(int capacity)
 */

public class arrayList_Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("name 1");
        list.add("name 2");
        list.add("name 3");
        list.add("name 4");

        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        /*
        Iterating ArrayList using For-each loop
         */
        for(String fruit:list)
            System.out.println(fruit);

        /*
        Get() and Set() - ArrayList
         */
        System.out.println("Returning element: "+list.get(1));//it will return the 2nd element, because index starts from 0
        list.set(1,"Dates");
        for(String fruit:list)
            System.out.println(fruit);

        /*
        Sort the ArrayList
         */
        Collections.sort(list);

        /*
        Ways to iterate the elements of the collection in Java

        There are various ways to traverse the collection elements:
           1. By Iterator interface.
           2. By for-each loop.
           3. By ListIterator interface.
           4. By for loop.
           5. By forEach() method.
           6. By forEachRemaining() method.
         */

        /**************************************************************************/
        System.out.println("Traversing list through List Iterator:");
        //Here, element iterates in reverse order
        ListIterator<String> list1=list.listIterator(list.size());
        while(list1.hasPrevious())
        {
            String str=list1.previous();
            System.out.println(str);
        }

        /**************************************************************************/
        System.out.println("Traversing list through for loop:");
        for(int i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        /**************************************************************************/
        System.out.println("Traversing list through forEach() method:");
        //The forEach() method is a new feature, introduced in Java 8.
        list.forEach(a->{ //Here, we are using lambda expression
            System.out.println(a);
        });

        /**************************************************************************/
        System.out.println("Traversing list through forEachRemaining() method:");
        Iterator<String> itr=list.iterator();
        itr.forEachRemaining(a-> //Here, we are using lambda expression
        {
            System.out.println(a);
        });

        /**************************************************************************/
        /*
        Java ArrayList example of retainAll() method

        retainAll() method in Java ArrayList is used to retain only the elements in the ArrayList that are also present in another collection,
        typically another ArrayList.
        In other words, it removes all elements from the current ArrayList that are not contained in the specified collection.
         */
        ArrayList<String> al = new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        // Create the second ArrayList (al2) and add elements to it
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Ravi");
        al2.add("Hanumat");
        // Retain only the elements that are present in both al and al2
        al.retainAll(al2);
        // Print the elements of al after retaining the elements of al2
        System.out.println("Iterating the elements after retaining the elements of al2:");
        for (String s : al) {
            System.out.println(s);
        }

    }
}
