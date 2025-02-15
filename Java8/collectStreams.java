package Java8;
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
    }
}
