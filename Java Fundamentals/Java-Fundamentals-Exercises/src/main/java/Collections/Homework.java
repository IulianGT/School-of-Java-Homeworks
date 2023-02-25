package Collections;
import java.util.*;

public class Homework {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        Integer[] array = {7,4,5,2,1,2,4,1};
        intList = Arrays.asList(array);

        System.out.println("\nLista de numere intregi:");
        Iterator<Integer> intListIterator = intList.iterator();
        while(intListIterator.hasNext()) {
            System.out.print(intListIterator.next() + "  ");
        }

        intListIterator = intList.iterator();
        List<Integer> duplicateList = new ArrayList<>();
        for (int i=0;i<intList.size();i++){
            if(duplicateList.contains(intList.get(i)) == false) {
                duplicateList.add(intList.get(i));
            }
        }


        intList = duplicateList;
        intListIterator = intList.iterator();
        System.out.println("\nLista fara elemente duplicate:");
        while(intListIterator.hasNext()) {
            System.out.print(intListIterator.next() + "  ");
        }

        intList.sort(Integer::compareTo);
        intListIterator = intList.iterator();
        System.out.println("\nLista SORTATA fara elemente duplicate:");
        while(intListIterator.hasNext()) {
            System.out.print(intListIterator.next() + "  ");
        }

        Set<Integer> intSetList = new HashSet<>(intList);
        System.out.println("\n\nSet-ul format din lista(Am scapat de duplicate si am ordonat crescator):");
        Iterator<Integer> iterator = intSetList.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + "  ");
        }

        System.out.println("\n\nMap:");
        Map<Integer,Integer> intMap = new HashMap<>();
        iterator = intSetList.iterator();
        intListIterator = intList.iterator();
        while(iterator.hasNext() && intListIterator.hasNext()){
            intMap.put(iterator.next(),intListIterator.next());
        }

        Iterator<Integer> mapIterator = intMap.keySet().iterator();
        while(mapIterator.hasNext()){
            Integer key = mapIterator.next();
            System.out.println("key: " + key + " value:" + intMap.get(key));
        }


    }
}
