package LambdaIzrazi.Streams.LaurSplica;

import java.util.List;

public class example13 {
    static void main() {
        // skip()
        // peek()
        // takeWhile()
        // dropWhile()

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        list.stream()
                .filter(n->n%2==0)
                .skip(4)
                .forEach(System.out::println);
    }
}
