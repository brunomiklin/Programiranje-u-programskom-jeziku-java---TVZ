package LambdaIzrazi.Streams.Collectors.Part2;

import java.util.Optional;

public class example8 {
    static void main() {
        // Optional JAVA 8

        Optional<Integer> o1 = Optional.empty(); // empty box
        Optional<Integer> o2 = Optional.of(10); // 10 is inside the box

        Integer i1 = o2.orElse(-1); // 10
        Integer i2 = o1.orElse(-1); // -1
        Integer i3 = o1.orElseGet(()->-1); // -1 ---> orElseGet() prima Supplier<T> za razliku od orElse() koji prima vrijednost


        Integer i4 = o1.orElseThrow(()->new RuntimeException()); // orElseThrow() također prima Supplier<T>

        Integer i5 = o1.or(()->o2).orElse(-1); // omogućuje nizanje Optionala -> također prima Supplier<T>

        o1.ifPresentOrElse(x-> System.out.println(x) // Uspijeli smo dohvatiti vrijednost untuar optionala
                ,
                ()->{
            System.out.println("Ni smo uspjeli dohvatiti vrijednost unutar OPTIONAL-a");
        });

    }

}
