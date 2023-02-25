import java.util.*;

public class Generics {
    public static void main(String[] args) {
        Integer[] intArray = {8, 11, 4, 9};
        Character[] charArray = {'o', 'u', 'p', 'n'};
        Double[] doubleArray = {1.5, 3.4, 1.1, 8.9};

        printArrayInteger(intArray);
        printArrayCharachter(charArray);
        printArrayDouble(doubleArray);

        System.out.println("\nAici acelasi lucru dar cu generics:");
        printArray(intArray);
        printArray(charArray);
        printArray(doubleArray);
    }
    static void printArrayInteger(Integer[] intArr){
        for(Integer e: intArr){
            System.out.print(e + "  ");
        }
        System.out.println();
    }

    static void printArrayCharachter(Character[] charArr){
        for(Character elemente:charArr){
            System.out.print(elemente + "  ");
        }
        System.out.println();
    }

    static void printArrayDouble(Double[] doubleArr){
        for(Double elem:doubleArr){
            System.out.print(elem + "  ");
        }
        System.out.println();
    }

    static <E> void printArray(E[] array){
        for(E element:array){
            System.out.print(element + "  ");
        }
        System.out.println();
    }
}
