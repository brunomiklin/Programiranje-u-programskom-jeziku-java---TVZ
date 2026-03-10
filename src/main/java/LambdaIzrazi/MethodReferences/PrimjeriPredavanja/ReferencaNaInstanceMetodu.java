package LambdaIzrazi.MethodReferences.PrimjeriPredavanja;

import java.util.List;

public class ReferencaNaInstanceMetodu {
    static void main() {
        // Filtriranje praznih stringova
        List<String> hashtags = List.of("#java", "", "#coding");

        // Lambda:
        hashtags.stream().filter(s->!s.isEmpty());

        // Method reference:
        hashtags.stream().filter(String::isEmpty);
    }
}
