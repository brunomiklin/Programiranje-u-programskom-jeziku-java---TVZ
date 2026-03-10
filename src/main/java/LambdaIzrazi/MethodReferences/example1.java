package LambdaIzrazi.MethodReferences;

import java.util.ArrayList;
import java.util.List;

public class example1{
    static void main() {

        List<String> list = new ArrayList<>(List.of(
                "Anna","Bob","Chuck","Dave"));

        list.forEach(System.out::println    );
    }
}
