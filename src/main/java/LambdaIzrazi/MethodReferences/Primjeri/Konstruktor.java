package LambdaIzrazi.MethodReferences.Primjeri;

import java.util.List;

public class Konstruktor {
    static void main() {

        List<String> list = List.of("Bruno","Leda");

        // Lambda izraz
        list.stream().map(s->new StringBuilder(s));

        // Method reference
        list.stream().map(StringBuilder::new);
    }
}
