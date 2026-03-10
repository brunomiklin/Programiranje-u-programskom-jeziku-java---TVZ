package Zbirke.collectionFrameworkdAndList;

import java.util.*;

public class example1 {
    static void main() {
        // java.util
        // Collection<E> --> interface <----- Map<K,V>

        // List<E>, Set<E>


        // List<E> ----> ArrayList<E>, LinkedList<E>
        // Set<E> ---> HashSet<E>, LinkedHashSet<E>, TreeSet<E>
        // Map<K,V> ---> HashMap<K,V>, LinkedHashMap<K,V>, TreeMap<K,V>

        List<String> list1 = Arrays.asList("ABC","QWE","AAA");
        List<String> list2 = List.of("ABC","QWE","AAA"); // OCP 11

        List<String> list3 = new ArrayList<>();
        List<String> list4 = new LinkedList<>();

        Collection<String> c1 = Arrays.asList("ABC","QWE","AAA");

        System.out.println(list1);

        String[] a1 = {"ABC","QWE","AAA"};
        System.out.println(a1); // Moraš koristi Arrays.toString()
    }
}
