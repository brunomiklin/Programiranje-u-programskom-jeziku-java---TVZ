package LambdaIzrazi.MethodReferences.Primjeri;

import java.util.List;

public class MetodaKonkretneInstance {
    static void main() {
        List<String> list = List.of("Bruno","Leda");


        String prefix = "Hello ";

        // Lambda izraz
        list.stream().map(s->prefix.concat(s));

        // Method reference
        list.stream().map(prefix::concat);


    }
}
