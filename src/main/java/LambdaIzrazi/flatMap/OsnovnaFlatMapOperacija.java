package LambdaIzrazi.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class OsnovnaFlatMapOperacija {
    static void main() {
        List<Integer> together = Stream.of(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4)
        ).flatMap(numbers -> numbers.stream()).toList();

        // Rezultat: [1, 2, 3, 4]

    }
}
