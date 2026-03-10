package LambdaIzrazi.MethodReferences.Primjeri;

import java.util.List;

public class StatickaMetodaKlase {
    static void main() {
        List<Integer> list = List.of(1,2,3);
        // Lambda izraz:
        list.forEach(x -> System.out.println(x));

        // Method reference:
        list.forEach(System.out::println);

    }
}
