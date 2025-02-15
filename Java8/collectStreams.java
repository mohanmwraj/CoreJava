package Java8;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.*;
import java.util.stream.Collectors;

class Product{
    String productName;
    int price;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
//    public Product get(){
//        return new Product(this.productName, this.price);
//    }
}
public class collectStreams {
    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(
          new Product("Apple", 10000),
          new Product("Samsung", 1000),
          new Product("Blackberry", 1500)
        );

        String maxPriceDiscount = productList.stream()
                .collect(
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Product::getPrice)),
                                (Optional<Product> product) ->
                                        product.isPresent()
                                            ? product.get().getProductName()
                                                : "None"
                    ));

        System.out.println(maxPriceDiscount);

        Map<Integer, List<Product>> gropuByPriceMap = productList.stream()
                                                         .collect(Collectors.groupingBy(Product::getPrice));

        System.out.println(gropuByPriceMap);

        Map<Boolean, List<Product>> costlyProducts = productList.stream()
                .collect(Collectors.partitioningBy(product -> product.getPrice() > 1000));

        System.out.println(costlyProducts);

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate date = LocalDate.of(2024, 6, 16);
        System.out.println(date);

        int year = date.getYear();
        Month month = date.getMonth();
        int day = date.getDayOfMonth();

        System.out.println();
        System.out.println("Year: "+year);
        System.out.println("Month: "+month);
        System.out.println("Day: "+day);

        DayOfWeek dow = date.getDayOfWeek();
        int len = date.lengthOfMonth();
        boolean leap = date.isLeapYear();

        System.out.println();
        System.out.println("Day of Week: "+dow);
        System.out.println("Length of Month:" +len);
        System.out.println("Is Leap Year: "+ year +" " +leap);

        int year1 = date.get(ChronoField.YEAR);
        int month1 = date.get(ChronoField.MONTH_OF_YEAR);
        int day1 = date.get(ChronoField.DAY_OF_MONTH);

        System.out.println();
        System.out.println("Year: "+year1);
        System.out.println("Month: "+month1);
        System.out.println("Day: "+day1);
    }
}
