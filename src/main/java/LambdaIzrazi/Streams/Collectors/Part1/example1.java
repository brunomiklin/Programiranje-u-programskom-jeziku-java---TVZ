package LambdaIzrazi.Streams.Collectors.Part1;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class example1 {
    static void main() {
        List<String> list = List.of("AAA","B","CCCCC","DDD","FFFFFF");


        List<String> res =
        list.stream()
                //intermdiary ops
                .collect(Collectors.toList()); // Collectors sa slovo s nakraju!!


        Set<String> res1 = list.stream().collect(Collectors.toSet());

        TreeSet<String> res2 = list.stream().collect(Collectors.toCollection(TreeSet::new));
    }
}
