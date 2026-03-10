package LambdaIzrazi.Streams.LaurSplica;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class example2 {
    static void main() {
        Stream<Integer> s1 = Stream.empty();

        Stream<Integer> s2 = Stream.of(1,2,3,4,5,6);
        s2.forEach(System.out::println);

        Supplier<Integer> sup = ()->new Random().nextInt();
        Stream<Integer> s3 = Stream.generate(sup); // infinite

        s3.limit(10).forEach(System.out::println);
    }

    public List<Integer> m1(){
        // this meth does smth
        return Collections.emptyList();
    }
    public Stream<Integer> m2(){
        // this meth does smth
        return Stream.empty();
    }
}
