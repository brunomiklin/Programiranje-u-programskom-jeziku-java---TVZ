package LambdaIzrazi.Streams.LaurSplica;

import java.util.List;

public class example6 {
    static void main() {
        List<String> list = List.of("abcd","qwerty","asdfg");

        list.stream().map(s->new StringBuilder(s).reverse()).forEach(System.out::println);
    }
}
