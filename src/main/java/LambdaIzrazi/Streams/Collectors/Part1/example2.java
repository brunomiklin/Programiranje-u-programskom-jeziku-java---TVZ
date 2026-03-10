package LambdaIzrazi.Streams.Collectors.Part1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class example2 {
    static void main() {
        List<String> list = List.of("AAA","B","CCCCC","DDD","FFFFFF");


        Map<String,Integer> map = list.stream().collect(Collectors.toMap(
                s->s,
                s->s.length()));




    }
}
