package Generics.Predavanja.UpperBoundedType;

import java.util.List;

public class Main {
    static void main() {
        // Radi za SVE što nasljeđuje Number!
        List<Integer> intDurations = List.of(180, 240, 195);  // sekunde
        double total1 = sumDurations(intDurations);  // ✅ OK

        List<Double> doubleDurations = List.of(3.5, 4.2, 3.8);  // minute
        double total2 = sumDurations(doubleDurations);  // ✅ OK

        List<Long> longDurations = List.of(180000L, 240000L);  // milisekunde
        double total3 = sumDurations(longDurations);  // ✅ OK

        // ❌ NE radi - String nije Number!
        //List<String> strings = List.of("3:00", "4:00");
        //sumDurations(strings); // COMPILE ERROR!
    }
    public static double sumDurations(List<? extends Number> duracije){
        return duracije.stream().mapToDouble(Number::doubleValue).sum();
    }
}
