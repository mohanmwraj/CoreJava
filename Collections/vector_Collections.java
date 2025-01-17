package Collections;

/*
 * Vector uses a dynamic array to store the data elements.
 * It is similar to ArrayList.
 * However, it is synchronized and contains many methods that are not the part of Collection framework.
 *
 */

import java.util.Iterator;
import java.util.Vector;

public class vector_Collections {
    public static void main(String[] args) {
        Vector<String> v=new Vector<String>();
        v.add("Ayush");
        v.add("Amit");
        v.add("Ashish");
        v.add("Garima");
        Iterator<String> itr=v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
