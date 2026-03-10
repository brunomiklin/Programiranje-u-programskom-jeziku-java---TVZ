package Zbirke.Maps;

import java.util.*;

public class example1 {
    static void main() {
        // collections of pairs
        // (key, value)

        Map<Integer,String> m1 = new HashMap<>(); // (k,v)  doesn't guarantee an order
        Map<Integer,String> m2 = new LinkedHashMap<>(); // (k,v) keeps the elements in the order in wich you've added them
        Map<Integer,String> m3 = new TreeMap<>(); // (k,v) are sorted by their keys

        Set<Integer> s1 = new HashSet<>(); // doesn't guarantee an order
        Set<Integer> s2 = new LinkedHashSet<>(); // keeps the elements in the order in wich you've added them
        Set<Integer> s3 = new TreeSet<>(); // sorts the elements by a given rule (Comparator / Comparable)
    }
}
