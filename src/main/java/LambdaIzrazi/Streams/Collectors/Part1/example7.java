package LambdaIzrazi.Streams.Collectors.Part1;

import java.util.List;
import java.util.stream.Collectors;

public class example7 {
    static void main() {
        List<String> list = List.of("AAA","B","CCCCC","DDD","FFFFFF","AAA");


        List<Integer> duljine = list.stream()
                .collect(Collectors.mapping(s->s.length(), // map: string -> int
                        Collectors.toList())); // downstreaming
        System.out.println(duljine);
    }
}
