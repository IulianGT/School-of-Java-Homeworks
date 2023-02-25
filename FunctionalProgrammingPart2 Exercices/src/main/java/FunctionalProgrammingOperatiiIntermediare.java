import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FunctionalProgrammingOperatiiIntermediare {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(23, 14, 15 ,45, 2);

        Stream<Integer> streamData = numbers.stream();

        Stream.empty();
        // Poate trebuie lucrat cu o colectie si sa nu returnezi NULL pentru a evita NullPointerException.

        int[] arr = new int[3];
        Stream.of(10, 7, 4, 5);
        Stream.of(arr);
        Stream.of(arr, 10, 6, 4);
        Arrays.stream(arr);

        // Stream urile sunt o maniera de a parcurge elemente intr-o maniera functionala
        // Stream urile nu pot fi reutilizate.

        List<Integer> data2 = streamData.peek(System.out::println).toList();
        // peek parcurge stream ul fara sa aduca modificari.

        //streamData.forEach();
        //forEach e o operatie terminala. dupa forEach nu mai pot face alte prelucrari pe date. atunci ca sa fac modificari la inceput o sa folosec peek.

        //Filter face ce zice si numele si o sa filtreze datele in functie de cerinta noastra si returneaza un stream cu datele filtrate.

        //List<Integer> evenNumbers = numbers.stream()
        //                .filter(n -> n % 2 == 0)

        System.out.println("\nDate filtrate:");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        System.out.println("\nDate mapate:");
        numbers.stream()
                .map(n -> n + "String")
                .forEach(System.out::println);

        System.out.println("\nDate mapate si filtrate:");
        numbers.stream()
                .filter(n->n%2 == 0)
                .map(n -> n + "String")
                .forEach(System.out::println);

        // Limit limiteaza lungimea stream ului care e prelucrat.

        System.out.println("\nDate limitate");
        numbers.stream()
                .limit(3)
                .forEach(System.out::println);

        // Skip sare peste primele n elemente dat de minie

        System.out.println("\nDate skip uite");
        numbers.stream()
                .skip(3)
                .forEach(System.out::println);

        // Sorted are 2 implementari. sorted fara param e folosit daca clasa are implementata metoda compareTo. altfel putem alege noi modalitatea de comparare.

        System.out.println("\nDate sortate:");
        numbers.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nDate sortate cu o metoda custom");
        numbers.stream()
                .sorted((a,b) -> a - b) // echivalent la crescator iar (a + b) sau (b - a) e descrescator.
                .forEach(System.out::println);
    }
}

