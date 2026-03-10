package LambdaIzrazi.Streams.Collectors.Part3;

import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public class example1 {
    static void main() {
        // findFirst(); // terminal
        // findAny();
            // they return Optional


       Stream<Integer> s1 = Stream.empty();
       Stream<Integer> s2 = Stream.of(10,20,50,30);

       Optional<Integer> o = s2.findFirst();

       o.ifPresentOrElse(x-> System.out.println(x),()-> System.out.println("Prazan ko ćorak!"));


       o.ifPresent(x-> System.out.println(x));
        System.out.println(o.isPresent());
       // ima razlika imeđu ___ ifPresent() ___ isPresent()
    }
}
