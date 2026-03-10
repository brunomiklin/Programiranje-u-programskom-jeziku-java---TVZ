package LambdaIzrazi.Streams.Collectors.Part2;

import java.util.List;
import java.util.stream.Collectors;

public class example1 {
    static void main() {
        List<String> list = List.of("AAA","BB","C","DDDDDD","E");

        Integer sum1 = list.stream()
                .mapToInt(s->s.length())
                .sum();

        Integer sum2 = list.stream()
                .collect(Collectors.summingInt(s->s.length()));

        Long sum3 = list.stream()
                .collect(Collectors.summingLong(s->s.length()));


    }
}
