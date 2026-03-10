package LambdaIzrazi.Streams.Collectors.Part2;

import java.util.List;
import java.util.stream.Collectors;

public class example2 {
    static void main() {
        List<String> list = List.of("AAA","BB","C","DDDDDD","E");



        Integer sum1 = list.stream()
                .collect(Collectors.summingInt(s->s.length()));


        Integer sum2 = list.stream()
                .collect(Collectors.mapping(s->s.length(),Collectors.summingInt(n -> n)));


    }
}
