package LambdaIzrazi.SortiranjeElemenataZbirkePomocuTokova;

import java.util.*;

public class OsnovnoSortiranje {
    static void main() {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(4, 3, 2, 1));

        List<Integer> sameOrder = numbers.stream().sorted().toList(); // Comparator.naturalOrder()

        // Rezultat: [1, 2, 3, 4]
    }
}
