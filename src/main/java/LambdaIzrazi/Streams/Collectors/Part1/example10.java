package LambdaIzrazi.Streams.Collectors.Part1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class example10 {
    static void main() {
        List<String> list = List.of("AAA","B","CCCCC","DDD","FFFFFF","AAA");


        Map<Integer,List<String>> map1 = list.stream().collect(Collectors
                .groupingBy(String::length,
                        Collectors.mapping(l->l.toLowerCase(),
                                Collectors.toList())));


        Map<Boolean,List<String>> map2 = list.stream().collect(Collectors.groupingBy(s->s.length()%2==0,Collectors.toList()));

        System.out.println(map1);

    }
}
