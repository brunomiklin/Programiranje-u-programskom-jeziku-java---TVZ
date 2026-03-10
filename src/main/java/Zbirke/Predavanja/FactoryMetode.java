package Zbirke.Predavanja;

import java.util.*;

public class FactoryMetode {
    static void main() {
        // Prije Java 9 - komplicirano 😓
        List<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista = Collections.unmodifiableList(lista);

        // Java 9 - jednostavno! 🎉
        List<String> lista2 = List.of("A", "B", "C");
        Set<Integer> set = Set.of(1, 2, 3);
        Map<String, Integer> mapa = Map.of(
                "Ana", 25,
                "Marko", 30
        );

    }
}
