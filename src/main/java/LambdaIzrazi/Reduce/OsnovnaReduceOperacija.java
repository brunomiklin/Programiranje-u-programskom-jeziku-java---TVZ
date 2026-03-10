package LambdaIzrazi.Reduce;

import java.util.stream.Stream;

public class OsnovnaReduceOperacija {
    static void main() {
        int count = Stream.of(1, 2, 3).reduce(0,(acc,element)->acc+element);

        // Rezultat: 6 (0 + 1 + 2 + 3)
    }
}
