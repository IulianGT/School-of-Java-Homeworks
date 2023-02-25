package Collections;

import java.sql.SQLOutput;
import java.util.*;

public class Exercitii {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Cotut");
        stringList.add("Andrei");
        stringList.add("Ionut");
        stringList.add("Bogdan");
        Iterator<String> it = stringList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        stringList.remove("Coutut");

        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(15);
        intList.add(23);
        intList.add(65);
        intList.add(13);

        Iterator<Integer> intIt = intList.iterator();
        while (intIt.hasNext()) {
            Integer number = intIt.next();
            if (number > 20) {
                intIt.remove();
            }
        }

        for (Integer integer : intList) {
            System.out.println(integer);
        }
        System.out.println("\n\nFara iterator");

        for (int i = 0; i < intList.size(); i++)
            System.out.println(intList.get(i));

        Set<String> setString = new HashSet<>();
        setString.add("Cotut");
        setString.add("Cotut");
        setString.add("Ioan");
        setString.add("Raluca");
        setString.add("Bogdan");

        Iterator<String> hashSetIterator = setString.iterator();


        while (hashSetIterator.hasNext()) {
            System.out.println(hashSetIterator.next());
        }
        System.out.println("\n For each:");
        setString.forEach(System.out::println);

        System.out.println("\n\n alta metoda");
        for(String s : setString){
            System.out.println(s);
        }

        Map<String,String> map = new HashMap<>();
        map.put("Ionut","Scrie");
        map.put("Cotut","Priveste");
        map.put("a","Caine");

        for (Map.Entry<String, String> string : map.entrySet()) {
            System.out.println(string.getKey() + " " + string.getValue());
        }

        System.out.println();
        //KeySET
        for (String s : map.keySet()) {
            System.out.println(s);
        }

        System.out.println();
        //ValueSets
        for (String value : map.values()) {
            System.out.println(value);
        }


    }

}
