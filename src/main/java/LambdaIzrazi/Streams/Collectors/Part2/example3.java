package LambdaIzrazi.Streams.Collectors.Part2;

import java.util.List;
import java.util.stream.Collectors;

public class example3 {
    static void main() {
        List<String> list = List.of("AAA","BB","C","DDDDDD","E");

        double avg1 = list.stream().collect(Collectors.averagingInt(s->s.length()));
                                        // averagingInt() iako piše int rezultat je ipak double


        // averagingInt() averagingLong() averagingDouble()
    }
}
