package LambdaIzrazi.Filter;

import java.util.List;
import java.util.stream.Stream;

public class VišestrukiFiltri {
    static void main() {
        List<String> result = Stream.of("Java", "Python", "C++", "JavaScript")
                .filter(lang->lang.length()>=4)
                .filter(lang->lang.contains("a"))
                .toList();

        // Rezultat: ["Java", "JavaScript"]


        // Filtriranje s pattern matching (Java 21+)
        List<Object> mixed = List.of("tekst", 42, "Java", 3.14);
        List<String> onlyStrings = mixed.stream()
                .filter(obj->obj instanceof String)
                .map(obj->(String)obj)
                    .toList();



    }
}
