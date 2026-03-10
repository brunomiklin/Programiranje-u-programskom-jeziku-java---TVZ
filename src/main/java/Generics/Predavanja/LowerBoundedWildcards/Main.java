package Generics.Predavanja.LowerBoundedWildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Integer> integers = new ArrayList<>();
        addNumbers(integers);  // ✅ OK - Integer

        List<Number> numbers = new ArrayList<>();
        addNumbers(numbers);  // ✅ OK - Number je super od Integer

        List<Object> objects = new ArrayList<>();
        addNumbers(objects);  // ✅ OK - Object je super od Integer
    }
    public static void addNumbers(List<? super Integer> list){
        list.add(1);
        list.add(2);
        list.add(3);

    }
}
