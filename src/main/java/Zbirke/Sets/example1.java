package Zbirke.Sets;

import java.util.*;
import java.util.stream.Collectors;

public class example1 {
    static void main() {
        Set<Integer> set1 = Set.of(1,2,3,4,5,6);
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new LinkedHashSet<>();
        Set<Integer> set4 = new TreeSet<>();
        Set<Integer> set5 = Arrays.asList(1,2,3,4,5).stream().collect(Collectors.toSet());

        // list                vs              set (Set -> interface  <- SortedSet / NavigableSet )
        // - orderd                     not always orderd
        // - indexed                    not indexed
        // - allow duplicates           doesn't allow duplicates

        //set1.get() --> ne postoji .get() metoda unutar Set(interface)-a jer nije indexiran

    }
}
