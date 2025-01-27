package Collections;

import java.util.*;

/*
    * Comparator and Comparable both provides a way to sort the collection of objects.
    *
    * Primitive Collection sorting: Arrays.sort() - Internally it used a quick sort.
    * Object Collection sorting: Arrays.sort() will throw a error class cast exception , cannot be cast to java.lang.comparable.
    *
 */
class Car implements Comparator<Car>{
    String carName;
    String carType;

    public Car(String carType, String carName) {
        this.carType = carType;
        this.carName = carName;
    }

    public Car() {

    }

    @Override
    public int compare(Car o1, Car o2) {
        return o1.carName.compareTo(o2.carName);
    }
}
class CarComparable implements Comparable<CarComparable>{
    String carName;
    String carType;

    public CarComparable(String carType, String carName) {
        this.carType = carType;
        this.carName = carName;
    }

    @Override
    public int compareTo(CarComparable o1) {
        return this.carName.compareTo(o1.carName);
    }
}

class CarNameComparator implements Comparator<Car>{
    @Override
    public int compare(Car obj1, Car obj2) {
        return obj2.carName.compareTo(obj1.carName);
    }
}
public class comparatorVsComparableInterface {
    public static void main(String[] args) {
        PriorityQueue<Integer> minPQ = new PriorityQueue<>(); //By default it is min queue
        minPQ.add(5);
        minPQ.add(2);
        minPQ.add(8);
        minPQ.add(1);

        minPQ.forEach((Integer val) -> System.out.println(val));
        minPQ.forEach(System.out::println); //Lambda Reference

        while(!minPQ.isEmpty()){
            System.out.println("Remove from top: "+minPQ.poll());
        }

        // Max Priority Queue
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(
                (Integer a, Integer b) -> b - a);
        maxPQ.add(5);
        maxPQ.add(2);
        maxPQ.add(8);
        maxPQ.add(1);

        maxPQ.forEach(System.out::println);

        Car[] car = new Car[3];
        car[0] = new Car("SUV", "Petrol");
        car[1] = new Car("Sedan", "Diesel");
        car[2] = new Car("HatchBack", "CNG");

        // Arrays.sort(car); throws a class cast exception.

        /*
            * How to sort the object array?
            *   - Comparator [Functional Interface, which have abstract method compare]
            *   - Comparable
            *
            * int compare(T obj1, T obj2)
            *   - Sorting algorithms uses this compare method of Comparator, to
            *       compare 2 variables and decide whether to swap the variables or not.
            *   - Method returns:
            *       1: if V1 is bigger than V2  ==> swap
            *       0: If V1 and V2 are equals  ==> do nothing
            *      -1: if V1 is smaller than V2. ==> do nothing
            *   - Mostly in algorithm, if this method return 1, it swap the values.
         */
        Integer[] arr = {17, 3, 54, 6, 66, 43};
        //Both are same
        Arrays.sort(arr, (Integer val1, Integer val2) -> val1-val2);
        Arrays.sort(arr);
        for(int a: arr) System.out.println(a);

        Arrays.sort(arr, (Integer val1, Integer val2) -> val2-val1); //Descending Order
        for(int a: arr) System.out.println(a);

        Arrays.sort(car, (Car obj1, Car obj2) -> obj1.carType.compareTo(obj2.carType));
        for(Car ca: car){
            System.out.println(ca.carName+" "+ca.carType);
        }
        List<Car> cars = new ArrayList<>();
        cars.add(car[0]);
        cars.add(car[1]);
        cars.add(car[2]);

        cars.sort((Car obj1, Car obj2) -> obj2.carName.compareTo(obj1.carName));
        cars.forEach((Car carObj) -> System.out.println(carObj.carName + "..." + carObj.carType));
        Collections.sort(cars, new CarNameComparator());

        Collections.sort(cars, new Car()); // uses the Compare method in the car class.
        /*
            * - Comparable
            *
            * int compareTo(T obj2);
            *
            * Sorting algorithm uses this compareTo method of Comparator to compare 2
            * variables and decide whether to swap the variables or not.
            *
            * Since compareTo method have only one object, we have to implement in the same class,
            * we can't use the new class.
            * this object of the class invokes the compareTo method.
            *
         */
        List<CarComparable> carsList = new ArrayList<>();
        carsList.add(new CarComparable("SUV", "Petrol"));
        carsList.add(new CarComparable("SEDAN", "CNG"));
        Collections.sort(carsList);
    }
}
