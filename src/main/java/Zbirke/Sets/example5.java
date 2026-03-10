package Zbirke.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class example5 {
    static void main() {
        Set<Integer> set1 = new TreeSet<>(); // sorted -> u odnosu na Comparator, ili natural sorting(Comparable)
        set1.add(10);
        set1.add(1000);
        set1.add(23);
        set1.add(1000);
        set1.add(300);
        set1.add(256);

        set1.forEach(x-> System.out.println(x));
    }
}
