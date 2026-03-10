package LambdaIzrazi.Streams.Collectors.Part3;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class example4 {
    static void main() {


        // OptionalDouble, OptionalLong, OptionalInt

        // average(), min(), max(), reduce()

        OptionalDouble optional = IntStream
                .of(3,4,5,6,7,8,9)
                .average(); // njega ne uzimas sa .get(), nego sa .getAsDouble()

    }
}
