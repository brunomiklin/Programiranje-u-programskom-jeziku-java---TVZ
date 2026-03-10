package LambdaIzrazi.ModerneLambdaUJava1725;

import java.util.List;

public class PatternMatchingULambdaIzrazima {
    static void main() {
        // Kombinacija pattern matching i lambda izraza
        List<Object> objects = List.of("Java", 42, 3.14, "Lambda");

        // Trazenje Stringa i filtriranje onog koji je veci od 4
        objects.stream().filter(obj->obj instanceof String s && s.length()>4).forEach(System.out::println);

        // Tradicionalni pristup bi zahtijevao cast:
        objects.stream()
                .filter(obj -> obj instanceof String)
                .map(obj -> (String) obj)  // Ovaj cast više nije potreban!
                .filter(s -> s.length() > 4)
                .forEach(System.out::println);
    }
}
