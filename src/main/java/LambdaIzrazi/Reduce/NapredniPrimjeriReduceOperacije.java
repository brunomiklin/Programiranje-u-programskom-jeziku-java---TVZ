package LambdaIzrazi.Reduce;

import java.util.Optional;
import java.util.stream.Stream;

public class NapredniPrimjeriReduceOperacije {
    static void main() {
        // Računanje sume
        int sum = Stream.of(1, 2, 3, 4, 5).reduce(0,Integer::sum); // Pomoću method reference Integer::sum

        // Računanje produkta
        int product =  Stream.of(1, 2, 3, 4).reduce(1,(a,b)->a*b);

        // Pronalaženje maksimuma
        Optional<Integer> max = Stream.of(1, 5, 3, 9, 2).reduce(Integer::max);

        // Konkatenacija stringova
        String concatenated = Stream.of("Java", "je", "super")
                .reduce("",(a,b)->a+ " " +b).trim();

    }
}
