package LambdaIzrazi.Filter;

import java.util.List;
import java.util.stream.Stream;

public class OsnovnoFiltriranje {
    static void main() {
        List<String> beginningWithNumbers = Stream.of("a", "1abc", "abc1")
                .filter(s->Character.isDigit(s.charAt(0))).toList();

        // Rezultat: ["1abc"]

        List<String> beginningWithNumbers2 = Stream.of("a", "1abc", "2abc1")
                .filter(s->{
                    Character a = s.charAt(0);
                    String b = a.toString();
                    return "123456789".contains(b);
                }).toList();


    }
}
