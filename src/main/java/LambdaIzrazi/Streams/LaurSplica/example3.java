package LambdaIzrazi.Streams.LaurSplica;

import java.util.List;

public class example3 {
    static void main() {
        List<Integer> list = List.of(1,5,6,3,8,9);

        boolean b1 = list.stream().anyMatch(x->x%2==0); // vraća true ako barem jedan matcha predicate
        boolean b2 = list.stream().allMatch(x->x%2==0); // vraća true ako svi matcha-ju predicate
        boolean b3 = list.stream().noneMatch(x->x%2==0); // vraća true ako niti jedan ne matcha predicate


        System.out.println(b1 + " " + b2 + " " + b3);
        // -> sve su termianl operacije i vraćaju boolean
    }
}
