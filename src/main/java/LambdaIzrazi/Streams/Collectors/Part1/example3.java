package LambdaIzrazi.Streams.Collectors.Part1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class example3 {
    static void main() {
        List<String> list = List.of("AAA","B","CCCCC","DDD","FFFFFF","AAA");


        Map<String,Integer> map = list.stream().collect(Collectors.toMap(
                s->s,
                s->s.length(),
                (a,b)->a+b // za DUPLIKATE ZBROJI NJIOVE DUZINE
                )
        );



    }
}
