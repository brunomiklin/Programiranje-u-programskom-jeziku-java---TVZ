package LambdaIzrazi.Streams.Collectors.Part2;

import java.util.Optional;

public class example7 {
    static void main() {
        // Optional JAVA 8

        Optional<Integer> o1 = Optional.empty(); // empty box
        Optional<Integer> o2 = Optional.of(10); // 10 is inside the box

        if(o2.isPresent()){
            Integer x = o2.get(); // make sure the Optional is not empty inaće baca EXCEPTION
        }

    }

}
