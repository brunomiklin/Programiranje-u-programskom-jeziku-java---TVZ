package LambdaIzrazi.Streams.LaurSplica;

import java.util.Comparator;
import java.util.List;

public class example10 {
    static void main() {
        List<Integer> list = List.of(3,5,2,7,9,8,2,1,5,4);
        // distinct()
        // sorted() / sorted (Comparator)

        list.stream().distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);


    }
}
