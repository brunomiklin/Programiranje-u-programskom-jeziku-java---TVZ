package LambdaIzrazi.Streams.LaurSplica;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class example7 {
    static void main() {

        List<List<Integer>> list = List.of(
                List.of(1,2,3,4,5),
                List.of(4,5,6),
                List.of(1,3)
        );

        // Zbrojiti sve vrijednost
         int sum = list.stream().flatMap(Collection::stream).reduce(0,Integer::sum);
//        int sum = list.stream().flatMap(listica->listica.stream()).mapToInt(x->x).sum();
        System.out.println(sum);
    }
}
