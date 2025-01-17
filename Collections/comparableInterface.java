package Collections;

import java.util.ArrayList;
import java.util.*;
/*
    Java Comparable interface

 *  Java Comparable interface is used to order the objects of the user-defined class.
 *  This interface is found in java.lang package and contains only one method named compareTo(Object).
 *  It provides a single sorting sequence only, i.e., you can sort the elements on the basis of single data member only.
 *  For example, it may be rollno, name, age or anything else.
 *
 *  public int compareTo(Object obj): It is used to compare the current object with the specified object. It returns

    positive integer, if the current object is greater than the specified object.
    negative integer, if the current object is less than the specified object.
    zero, if the current object is equal to the specified object.
 *
 * We can sort the elements of:

    String objects
    Wrapper class objects
    User-defined class objects
 *
 *  public void sort(List list): It is used to sort the elements of List. List elements must be of the Comparable type.
 *
 *  Note: String class and Wrapper classes implement the Comparable interface by default.
 *  So if you store the objects of string or wrapper classes in a list, set or map, it will be Comparable by default.
 *
 *
 *
 *
 *
 *
 *
 *
 */
class Student1 implements Comparable<Student1>{
    int rollno;
    String name;
    int age;
    Student1(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

    public int compareTo(Student1 st){
        if(age==st.age)
            return 0;
        else if(age>st.age)
            return 1;
        else
            return -1;
    }
}

public class comparableInterface {
    public static void main(String[] args) {
        ArrayList<Student1> al=new ArrayList<Student1>();
        al.add(new Student1(101,"Vijay",23));
        al.add(new Student1(106,"Ajay",27));
        al.add(new Student1(105,"Jai",21));

        Collections.sort(al);
        for(Student1 st:al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
//        Output:
//        105 Jai 21
//        101 Vijay 23
//        106 Ajay 27
        System.out.println("Student Age in reverse Order: (Elder)");
        Collections.sort(al, Collections.reverseOrder());
        for(Student1 st:al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
