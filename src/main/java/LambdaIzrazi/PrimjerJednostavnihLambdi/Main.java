package LambdaIzrazi.PrimjerJednostavnihLambdi;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Main {
    static void main() {

        // Lambda bez parametara
        Runnable run = ()-> System.out.println("Hello lambda");

                             // Lambda s jednim parametrom
            List.of(1,2,3,4).stream().map(x->x+10);

                                              // Lambda s više parametara i eksplicitnim tipovima
        BiFunction<Integer,Integer,Integer> function = (Integer x, Integer y)-> x+y;;


    }
}
