package LambdaIzrazi.Streams.Collectors.Part1;

import java.util.List;
import java.util.stream.Collectors;

public class example6 {
    static void main() {
        List<String> list = List.of("AAA","B","CCCCC","DDD","FFFFFF","AAA");


        var res = list.stream()
                .collect(Collectors.teeing(
                Collectors.counting(), // long
                Collectors.joining(), // String
                (a,b)->List.of(a,b)
        ));




    }
}
