package Zbirke.ComparableComparator.example1;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    static void main() {
        Set<Cat> set1 = new TreeSet<>();
        set1.add(new Cat(4)); // tu će pući ako Cat nema Comparable<Cat> - ClassCastException
        set1.add(new Cat(1));
        set1.add(new Cat(6));
        set1.add(new Cat(2));

        set1.forEach(System.out::println);
    }
}
