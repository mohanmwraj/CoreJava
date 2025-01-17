package Collections;

import java.util.EnumMap;
import java.util.Map;

/*
 * Java EnumMap class is the specialized Map implementation for enum keys. It inherits Enum and AbstractMap classes.
 *
 *
 *     public class EnumMap<K extends Enum<K>,V> extends AbstractMap<K,V> implements Serializable, Cloneable
 */
enum Days {
    Monday, Tuesday, Wednesday, Thursday
}
public class enumMapClass {
    public static void main(String[] args) {
        //create and populate enum map
        EnumMap<Days, String> map = new EnumMap<Days, String>(Days.class);
        map.put(Days.Monday, "1");
        map.put(Days.Tuesday, "2");
        map.put(Days.Wednesday, "3");
        map.put(Days.Thursday, "4");

        // print the map
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}

