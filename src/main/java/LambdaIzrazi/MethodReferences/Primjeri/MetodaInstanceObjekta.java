package LambdaIzrazi.MethodReferences.Primjeri;

import java.util.List;

public class MetodaInstanceObjekta {
    static void main() {
        List<String> list = List.of("Bruno","Leda");
        // Lambda izraz:
        list.stream().map(s->s.toUpperCase());

        // Method referenca:
        list.stream().map(String::toUpperCase);
    }
}
