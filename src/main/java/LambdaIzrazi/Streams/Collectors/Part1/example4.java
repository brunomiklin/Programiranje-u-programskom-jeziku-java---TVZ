package LambdaIzrazi.Streams.Collectors.Part1;

import java.util.List;
import java.util.stream.Collectors;

public class example4 {
    static void main() {
        List<String> list = List.of("AAA","B","CCCCC","DDD","FFFFFF","AAA");


        String res = list.stream().collect(Collectors.joining(",","[","]"));

        System.out.println(res);


    }
}
