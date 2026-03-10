package LambdaIzrazi.Streams.LaurSplica.Dog;

import LambdaIzrazi.Streams.LaurSplica.Cat.Cat;

import java.util.Comparator;
import java.util.stream.Stream;

public class example12 {
    static void main() {
        Stream<Dog> s = Stream.of(
                new Dog(3),
                new Dog(1),
                new Dog(5),
                new Dog(4),
                new Dog(2)
        );

        Comparator<Dog> c = (d1, d2)->d2.getAge()-d1.getAge();
        Comparator<Dog> c2 = Comparator.comparing(Dog::getAge);

        s.sorted(c).forEach(System.out::println);

    }
}
