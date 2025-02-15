package Java8;

import java.util.HashMap;
import java.util.Map;

public class mapEnhancements {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("India", "Delhi");
        map.put("USA", "Washington");
        map.put("Japn", "Tokyo");
        map.put("China", "Beijing");
        map.put("Germany", "Berlin");

        map.forEach((country, capital) -> System.out.println("The Capital of "+ country + " is "+capital));

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(System.out::println);

        System.out.println(map.getOrDefault("Russia", "No Data Present"));

        map.computeIfAbsent("Spain", name -> "Madrid");
        map.computeIfPresent("USA",(k, v) -> "Washington DC");
        map.compute("India", (k, v) -> "New" + v);
        map.remove("England", "london");
        map.replaceAll((country, capital) -> capital.toUpperCase());
        map.replace("India", "Delhi");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(System.out::println);
    }
}
