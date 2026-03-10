package Generics.Vjezbe;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class GenerickeMetode {
    static void main() {
        // Rad s Integer tipom
        System.out.printf("Maximum of %d, %d and %d is %d%n%n",
                3, 4, 5, maximum(3, 4, 5));

        // Rad s Double tipom
        System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f%n%n",
                6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));

        // Rad s String tipom
        System.out.printf("Maximum of %s, %s and %s is %s%n",
                "pear", "apple", "orange",
                maximum("pear", "apple", "orange"));
    }
    public static <T extends Comparable<T>> T maximum(T... lista){
        return Arrays.stream(lista).max(Comparable::compareTo).orElseThrow(()->new RuntimeException("Nema maximuma"));
    }
}
