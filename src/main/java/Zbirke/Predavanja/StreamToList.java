package Zbirke.Predavanja;

import java.util.List;
import java.util.stream.Collectors;

public class StreamToList {
    static void main() {
        List<String> imena = List.of("Ana", "Marko", "Ivana");

        // Prije Java 17 - verbose
        List<String> velikaSlova1 = imena.stream().map(String::toUpperCase).collect(Collectors.toList());
        velikaSlova1.add("BRUNO");

        // Java 17 - jednostavnije! 🎯
        List<String> velikaSlova2 = imena.stream().map(String::toUpperCase).toList();
        //velikaSlova2.add("BRUNO"); -> UnsupportedOperationException

    }
}
