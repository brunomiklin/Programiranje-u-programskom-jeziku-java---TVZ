package LambdaIzrazi.Streams.Collectors.Part2;

import java.util.Optional;

public class example6 {
    static void main() {
        // Optional JAVA 8

        Optional<Integer> o1 = Optional.empty(); // empty box
        Optional<Integer> o2 = Optional.of(10); // 10 is inside the box


//      Optional<Integer> o3 = Optional.of(null); --> ovo će rezultirati NullPointerExceptionom
        Optional<Integer> o4 = Optional.ofNullable(null); // ovo neće rezultirati NullPointerExceptionom

        Boolean b1 = o1.isPresent(); // false
        Boolean b2 = o2.isPresent(); // true
    }

}
