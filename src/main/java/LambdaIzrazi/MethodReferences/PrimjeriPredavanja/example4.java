package LambdaIzrazi.MethodReferences.PrimjeriPredavanja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

record Person(String firstName,String lastName){}
public class example4 {
    static void main() {
        List<Person> list = new ArrayList<>(Arrays.asList(
                new Person("Petar","Pan"),
                new Person("Petar","PumpkinEater"),
                new Person("Minnie","Mouse"),
                new Person("Mickey","Mouse")
        ));

        list.sort((o1,o2)->o1.lastName().compareTo(o2.lastName()));
        list.forEach(System.out::println);
        System.out.println();
        System.out.println("---");
        list.sort(Comparator.comparing(Person::lastName));
        list.forEach(System.out::println);

        System.out.println();
        System.out.println("---");
        list.sort(Comparator.comparing(Person::lastName)
                .thenComparing(Person::firstName));
        list.forEach(System.out::println);
    }
}
