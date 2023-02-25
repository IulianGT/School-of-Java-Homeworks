import java.util.List;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FunctionalProgrammingOperatiiFinale {
    public static void main(String[] args) {


//  Stream<Integer> numbers = Stream.of(10,53,7,12,92);
        List<Integer> numbers = List.of(10, 53, 7, 12, 92);

//        System.out.println(    numbers.stream()
//                .count()
//    );

        int minNumber = numbers.stream()
                .filter(n -> n % 2 == 0)
                .min((a, b) -> a - b)
                .orElse(0);

        System.out.println(minNumber + "\n\n");

        int maxNumber = numbers.stream()
                .filter(n -> n % 2 == 0)
                .max((a, b) -> a - b).orElse(0);

        System.out.println(maxNumber);


        System.out.println("\n\n" + numbers.stream()
                .filter(n -> n == 50)
                .findFirst().orElse(-1)
        );
        //FIND FIRST

        System.out.println(
                "\n\n" +
                numbers.stream()
                .filter(n -> n == 50)
                .findAny().orElse(-1)
        );

        System.out.println("\n\n");
        boolean flag =
        numbers.stream()
                .anyMatch(n -> n>=10);

        System.out.println(flag);

        System.out.println("\n\n");
        boolean flagForAll =
                numbers.stream()
                        .allMatch(n -> n>=10);

        System.out.println(flagForAll);

        System.out.println("\n\n");
        boolean flagForNone =
                numbers.stream()
                        .noneMatch(n -> n>=1000);

        System.out.println(flagForNone);


        System.out.println("\n\nREDUCE :");

        System.out.println( IntStream.range(1,10).sum());

        System.out.println("\n\n");
        int value = Stream.of(10, 5, 3)
                .reduce(15, (a,b) -> a + b, (a, b) -> {
                    System.out.println("Fac suma");
                    return a+b;
                });

        System.out.println(value);



    }

}
