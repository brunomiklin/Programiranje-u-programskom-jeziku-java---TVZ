package LambdaIzrazi.MethodReferences.PrimjeriPredavanja;

import java.util.List;

public class ReferencaNaStatickuMetodu {
    static void main() {
        // Parsiranje brojeva iz stringa
        List<String> numbers = List.of("1", "2", "3");

        // Lambda:
        numbers.stream().map(s->Integer.parseInt(s));

        // Method reference:
        numbers.stream().map(Integer::parseInt);
    }
}
