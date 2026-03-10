package Generics.Vjezbe;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcards {
    static void main() {
        // Lista Integer brojeva
        Integer[] integers = {1, 2, 3, 4, 5};
        List<Integer> integerList = Arrays.asList(integers);
        System.out.printf("integerList: %s%n", integerList);
        System.out.printf("Total: %.0f%n%n", sum(integerList));

        // Lista Double brojeva
        Double[] doubles = {1.1, 3.3, 5.5};
        List<Double> doubleList = Arrays.asList(doubles);
        System.out.printf("doubleList: %s%n", doubleList);
        System.out.printf("Total: %.1f%n%n", sum(doubleList));

        // Mješovita lista Number objekata
        Number[] numbers = {1, 2.4, 3, 4.1};
        List<Number> numberList = Arrays.asList(numbers);
        System.out.printf("numberList: %s%n", numberList);
        System.out.printf("Total: %.1f%n", sum(numberList));
    }

    public static double sum(List<? extends Number> list){
        return list.stream().mapToDouble(Number::doubleValue).sum();
    }
}
