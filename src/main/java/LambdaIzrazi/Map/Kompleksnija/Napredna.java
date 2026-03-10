package LambdaIzrazi.Map.Kompleksnija;

import java.util.List;
import java.util.stream.Stream;

public class Napredna {
    static void main() {
        // Mapiranje objekata u njihove duljine
        List<Integer> lengths = Stream.of("Java", "Lambda", "Stream")
                .map(String::length).toList();

        // Rezultat: [4, 6, 6]


        // Mapiranje s records (Java 17+)
        record Person(String name, int age) {}

        List<String> names = Stream.of(
                new Person("Ana", 20),
                new Person("Ivan", 22)
        ).map(Person::name)
                .toList();
    }


}
