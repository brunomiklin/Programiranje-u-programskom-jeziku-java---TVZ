package Zbirke.Predavanja;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsUtilityKlasa {
    static void main() {
        List<Integer> brojevi = Arrays.asList(5,2,8,1,9);

        Collections.sort(brojevi); // [1, 2, 5, 8, 9]
        Collections.reverse(brojevi); // [9, 1, 8, 2, 5]

        Integer max = Collections.max(brojevi); // 9

    }
}
