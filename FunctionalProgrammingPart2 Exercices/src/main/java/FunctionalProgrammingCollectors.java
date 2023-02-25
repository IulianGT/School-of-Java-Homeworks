import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product{
    public Product(String name, int price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }

    private String name;
    private int price;
    private String category;
}

public class FunctionalProgrammingCollectors {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,5,3,7,2);

        numbers = Stream.of(10,5,3,12,4,5)
                .collect(Collectors.toList());

        System.out.println(numbers);

        Set<Integer> numbersSet = Stream.of(10,5,3,12,4,5).collect(Collectors.toSet());
        System.out.println(numbersSet);

        System.out.println(Stream.of(10,5,6,4,5).collect(Collectors.toCollection(() -> new LinkedList<>())));

        System.out.println((Long) Stream.of(10, 4, 6, 3, 2).count());
        //        System.out.println(Stream.of(10,4,6,3,2).collect(Collectors.counting()));

        System.out.println(numbers.stream().map(n -> n + "").collect(Collectors.joining(", ")));


        List<Product> products = new ArrayList<>();
        products.add(new Product("Telefon", 1000, "Device"));
        products.add(new Product("Frigider", 5000, "Electrocasnic"));
        products.add(new Product("Apa", 1, "Consumabil"));
        products.add(new Product("Pizza", 10, "Consumabil"));

//        Map<String, String> myMap = products.stream()
//                .collect(Collectors.toMap(Product::getCategory, Product::getName));


//        Map<String, String> myMap = products.stream()
//                .collect(Collectors.toMap(Product::getCategory, Product::getName, (existing, copy) -> existing));

//        Map<String, Product> myMap = products.stream()
//                .collect(Collectors.toMap(Product::getCategory, Function.identity(),(existing, copy) -> existing));

        Map<String, Product> myMap = products.stream()
                .collect(Collectors.toMap(Product::getCategory, Function.identity(),(existing, copy) -> existing));

        System.out.println(myMap);

        System.out.println("\n\n\n");
        Map<Integer, Set<Product>> MyDiffMap = products.stream()
                .collect(Collectors.groupingBy(product -> product.getName().length(), Collectors.toSet()));

        System.out.println(MyDiffMap);


        Map<Boolean,List<Product>> productsMap = products.stream()
                .collect(Collectors.partitioningBy(product -> product.getPrice() > 50));

        System.out.println("\n\n\n" + productsMap);
    }



}
