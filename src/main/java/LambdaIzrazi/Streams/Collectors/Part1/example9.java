package LambdaIzrazi.Streams.Collectors.Part1;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class example9 {
    static void main() {
        List<String> list = List.of("AAA","B","CCCCC","DDD","FFFFFF","AAA");


        Map<Boolean,List<String>> map1 = list.stream().collect(Collectors.partitioningBy(s->s.length()%2==0));

        Map<Boolean, Set<String>> map2 = list.stream().collect(Collectors.partitioningBy(s->s.length()%2==0,Collectors.toSet()));

        Map<Boolean,String> map3 = list.stream().collect(Collectors.partitioningBy(s->s.length()%2==0,Collectors.joining(",")));


        System.out.println(map3);

    }
}
