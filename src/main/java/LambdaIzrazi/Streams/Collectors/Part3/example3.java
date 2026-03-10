package LambdaIzrazi.Streams.Collectors.Part3;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class example3 {
    static void main() {
        List<Integer> list1 = List.of(3,4,5,6,7);
        Stream<Integer> s1 = Stream.of(3,4,5,6,7,8);

        Integer sum = list1.stream()
                .reduce(0,(a,b)->a+b);

        Optional<Integer> sum2 = list1.stream()
                .reduce((a,b)->a+b);
    }


}
