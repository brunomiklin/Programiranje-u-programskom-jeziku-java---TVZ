package LambdaIzrazi.Streams.Collectors.Part3;

import java.util.List;
import java.util.Optional;

public class example2 {
    static void main() {
        // min() i max()


        List<Integer> list = List.of(3,1,5,7,2,5,7);


        Optional<Integer> o1 =
        list.stream()
                .min((x,y)->x-y);

        o1.ifPresent(System.out::println);
    }
}
