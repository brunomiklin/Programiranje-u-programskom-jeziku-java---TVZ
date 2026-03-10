package LambdaIzrazi.Streams.Collectors.Part2;

import java.util.*;
import java.util.stream.Collectors;

public class example4 {
    static void main() {
        List<String> list = List.of("AAA","BB","C","DDDDDD","E");

        Long res1 = list.stream().mapToInt(s->s.length()).count();

        Integer res2 = list.stream().mapToInt(s->s.length()).sum();


        OptionalDouble res3 = list.stream().mapToInt(s->s.length()).average(); // average() je OptionalDouble, a ne Optional<Double>



        IntSummaryStatistics intStats = list.stream().mapToInt(s->s.length()).summaryStatistics();

        IntSummaryStatistics intStats2 = list.stream().collect(Collectors.summarizingInt(s->s.length()));

        System.out.println(intStats2.getAverage());
        System.out.println(intStats2.getAverage());


        // averagingInt() averagingLong() averagingDouble()
    }
}
