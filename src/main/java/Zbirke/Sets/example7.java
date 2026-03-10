package Zbirke.Sets;

import java.util.Set;
import java.util.TreeSet;

public class example7 {
    static void main() {
        Set<Integer> set = getSomeSet();
        // here you cannot consider that they are sorted
    }

    public static Set<Integer> getSomeSet(){
        return new TreeSet<>(); // sortiran
    }
}
