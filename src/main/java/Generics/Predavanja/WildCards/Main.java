package Generics.Predavanja.WildCards;

import java.util.List;

public class Main {
    static void main() {
        // Sada radi za SVE tipove! 🎉 (Znači tip me konkretno ne zanima
        List<Integer> ints = List.of(1, 2, 3);
        printList(ints);  // ✅ OK

        List<String> strings = List.of("a", "b", "c");
        printList(strings);  // ✅ OK

        List<Double> doubles = List.of(1.5, 2.5);
        printList(doubles);  // ✅ OK

    }
    public static void printList(List<?> list){
        for (Object element:list){
            System.out.println(element);
        }
    }

}
