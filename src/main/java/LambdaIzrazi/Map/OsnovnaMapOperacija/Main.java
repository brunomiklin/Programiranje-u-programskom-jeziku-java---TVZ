package LambdaIzrazi.Map.OsnovnaMapOperacija;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static void main() {
        List<String> collected = Stream.of("a", "b", "hello")
                .map(String::toUpperCase).collect(Collectors.toList());

        // Rezultat: ["A", "B", "HELLO"]

    }
}
