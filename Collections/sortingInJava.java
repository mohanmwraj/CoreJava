package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

class Student implements Comparable<Student> {
    public String name;
    public Student(String name) {
        this.name = name;
    }
    public int compareTo(Student person) {
        return name.compareTo(person.name);

    }
}

public class sortingInJava {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Viru");
        al.add("Saurav");
        al.add("Mukesh");
        al.add("Tahir");

        Collections.sort(al);
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //Sort String Object in reverse Order.
        Collections.sort(al,Collections.reverseOrder());
        Iterator i = al.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        /*
        sort user-defined class objects
         */
        ArrayList<Student> list=new ArrayList<Student>();
        list.add(new Student("Viru"));
        list.add(new Student("Saurav"));
        list.add(new Student("Mukesh"));
        list.add(new Student("Tahir"));

        Collections.sort(list);
        for (Student s : list) {
            System.out.println(s.name);
        }
    }
}
