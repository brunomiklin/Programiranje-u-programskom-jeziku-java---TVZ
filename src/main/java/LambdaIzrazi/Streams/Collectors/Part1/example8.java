package LambdaIzrazi.Streams.Collectors.Part1;

import java.util.List;
import java.util.stream.Collectors;

public class example8 {
    static void main() {
        List<String> list = List.of("AAA","B","CCCCC","DDD","FFFFFF","AAA");


        List<Integer> res = list.stream()
                .collect(Collectors.mapping(s->s.length(),
                        Collectors.filtering(n->n%2==0,Collectors.toList())));
        System.out.println(res);



    }
}
