package LambdaIzrazi.Challange;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;

public class Challanges {
    static void main() {
        // Challange 1
        Consumer<String> printTheParts = sentence -> {
            String[] parts = sentence.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };
        Consumer<String> printTheParts2 = (String sentence)-> Arrays.stream(sentence.split(" ")).forEach(System.out::println);





    }



}
