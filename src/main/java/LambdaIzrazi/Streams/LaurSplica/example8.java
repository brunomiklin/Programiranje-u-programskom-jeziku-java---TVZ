package LambdaIzrazi.Streams.LaurSplica;

import java.util.Arrays;
import java.util.List;

public class example8 {
    static void main() {
        List<String> list = List.of("ab4n3kdk4","2n3n2nnm","mko","012a123");

        String digts = "0123456789";
        Long count = list.stream().flatMap(string -> Arrays.stream(string.split("")))
                .filter(digts::contains).count();

        System.out.println(count);
    }
}
