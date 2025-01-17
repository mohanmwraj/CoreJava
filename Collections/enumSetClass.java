package Collections;

/*
 * Java EnumSet class is the specialized Set implementation for use with enum types.
 * It inherits AbstractSet class and implements the Set interface.
 *
 *     public abstract class EnumSet<E extends Enum<E>> extends AbstractSet<E> implements Cloneable, Serializable
 */

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum weekdays{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
};

public class enumSetClass {
    public static void main(String[] args) {
        Set<weekdays> set = EnumSet.of(weekdays.TUESDAY, weekdays.WEDNESDAY);
        // Traversing elements
        Iterator<weekdays> iter = set.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());

        /*
        allOf() and noneOf()
         */

        Set<weekdays> set1 = EnumSet.allOf(weekdays.class);
        System.out.println("Week Days:"+set1); // Week Days:[SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY]

       Set<weekdays> set2 = EnumSet.noneOf(weekdays.class);
       System.out.println("Week Days:"+set2); //Week Days:[]
    }
}
