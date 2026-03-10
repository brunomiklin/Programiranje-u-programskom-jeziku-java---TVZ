package Generics.Predavanja.PECS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static void main() {
        List<Integer> source = List.of(1, 2, 3);
        List<Number> destination = new ArrayList<>();
        copy(source,destination);

        Collections.copy(destination, source);
// ✅ Radi jer:
        // - destination je List<? super Integer> (Number je super od Integer)
        // - source je List<? extends Integer> (Integer extends Integer)
    }
    public static void copy(List<? extends Number> source, List<? super Number> destenation){
        for(Number n:source){
            destenation.add(n);
        }

    }
}
