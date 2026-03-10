package Zbirke.Sets;

import java.util.HashSet;
import java.util.Set;

public class example3 {
    static void main() {
        Set<Integer> set1 = new HashSet<>(); // koristi hashCode() / equals()
        set1.add(10);
        set1.add(1000);
        set1.add(23);
        set1.add(1000); // Ovaj nije dodan u kolekciju
        set1.add(300);
        set1.add(256);

        set1.forEach(x-> System.out.println(x));
    }
}
