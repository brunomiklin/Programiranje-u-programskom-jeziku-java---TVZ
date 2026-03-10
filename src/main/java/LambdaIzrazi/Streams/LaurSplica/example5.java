package LambdaIzrazi.Streams.LaurSplica;

import java.util.List;

public class example5 {
    static void main() {
        List<String> list = List.of("abcd","qwerty","asdfg");

        // java.util.function -> Function
        int sum = list.stream()
                .mapToInt(String::length).sum();

        int sum2 = list.stream().map(String::length).reduce(0,Integer::sum); // s ovom nulom u reduce maknemo optional
        int sum3 = list.stream().map(String::length).reduce(0,(a,b)->a+b); // s ovom nulom u reduce maknemo optional

    }
}
