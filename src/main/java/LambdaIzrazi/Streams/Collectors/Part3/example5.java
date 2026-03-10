package LambdaIzrazi.Streams.Collectors.Part3;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class example5 {
    static void main() {
        List<Integer> list = List.of();

        Optional<Integer> res1 = list.stream()
                .collect(Collectors.minBy(Integer::min));

        Optional<Integer> res2 = list.stream()
                .collect(Collectors.maxBy(Integer::max));

        Optional<Integer> res3 = list.stream()
                .collect(Collectors.reducing(Integer::sum));
    }
}
