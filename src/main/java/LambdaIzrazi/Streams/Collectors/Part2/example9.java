package LambdaIzrazi.Streams.Collectors.Part2;

import java.util.Optional;

public class example9 {
    static void main() {

        Optional<Integer> o1 = Optional.empty(); // empty box
        Optional<Integer> o2 = Optional.of(10); // 10 is inside the box

        // map()            x -> y
        // flatMap()        x-> Optional(y)

        Integer x1 = o2.map(x->2*x).orElse(-1);
        System.out.println(x1); // 20

        Optional<Integer> x2 = o2.flatMap(x->Optional.of(2*x));

    }
}
