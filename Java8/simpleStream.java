package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class simpleStream {
    public static void main(String[] args) {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");

        Stream<String> depStream = departmentList.stream();
        depStream.forEach(System.out::println);

        Stream<String> inStream = Stream.of("Eazy", "Bytes", "Java");
        inStream.forEach(System.out::println);

        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(System.out::println);

        emptyStream = departmentList.parallelStream();
        emptyStream.forEach(System.out::println);

        Stream<String> depStream1 = departmentList.stream();
        depStream1.map(word -> word.toUpperCase()).forEach(System.out::println);

        depStream1 = departmentList.stream();
        depStream1.map(String::toLowerCase).forEach(System.out::println);

        System.out.println(
                            Stream
                            .iterate(1, n -> n + 1)
                            .limit(20)
                            .reduce(0, Integer::sum)
                                    //.reduce(0, (a, b) -> a + b)
        );
    }
}
