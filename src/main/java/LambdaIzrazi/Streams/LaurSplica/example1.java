package LambdaIzrazi.Streams.LaurSplica;

import java.util.ArrayList;
import java.util.List;

public class example1 {
    static void main() {
        List<Integer> list = List.of(1,5,6,3,8,9);
        list.stream().filter(x->x%2==0).forEach(System.out::println);
    }
}
