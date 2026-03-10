package Zbirke.Vježbe.StatickeAnalize;

import Zbirke.Vježbe.Enumeracije.Zupanija;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;

public class StatistickeAnalize {
    static void main() {
        // DoubleSummaryStatistics - sveobuhvatna statistika
        DoubleSummaryStatistics stats = Arrays.asList(Zupanija.values()).stream()
                .mapToDouble(Zupanija::gustocaNaseljenosti)
                .summaryStatistics(); // summaryStatistics

        System.out.println("Broj županija: " + stats.getCount());
        System.out.println("Minimalna gustoća: " + stats.getMin());
        System.out.println("Maksimalna gustoća: " + stats.getMax());
        System.out.println("Prosječna gustoća: " + stats.getAverage());
        System.out.println("Suma: " + stats.getSum());

        // Županije iznad prosjeka
        Arrays.stream(Zupanija.values()).filter(x->x.gustocaNaseljenosti()>stats.getAverage())
                .forEach(System.out::println);
    }
}
