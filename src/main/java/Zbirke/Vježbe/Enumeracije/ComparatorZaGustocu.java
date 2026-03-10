package Zbirke.Vježbe.Enumeracije;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorZaGustocu {
    static void main() {
        // Lambda + metoda za gustoću
        Comparator<Zupanija> comparatorZaGusotcu = Comparator.comparingDouble((z->z.getBrojStanovnika()/z.getPovrsina()));

        // Ili s helper metodom
        Comparator<Zupanija> comparatorZaGustocu2 = Comparator.comparingDouble(Zupanija::gustocaNaseljenosti).reversed();

        // Top 5 županija po gustoći naseljenosti
        List<Zupanija> top5 = Arrays.stream(Zupanija.values())
                .sorted(Comparator.comparing(Zupanija::gustocaNaseljenosti).reversed())
                .limit(5)
                .toList();
        System.out.println(top5);


        // Prosječna gustoća svih županija
        double prosjekGustoca = Arrays.stream(Zupanija.values()).mapToDouble(Zupanija::gustocaNaseljenosti).average().orElse(0.0); // average() vraća Optional<Double>
        System.out.println("Prosječna gustoća: " + prosjekGustoca);
    }
}
