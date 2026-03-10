package LambdaIzrazi.SortiranjeElemenataZbirkePomocuTokova;

import java.util.Comparator;
import java.util.List;

record Osoba(String ime, int dob) {}

public class NapredneTehnikeSortiranja {
    static void main() {

        List<Osoba> osobe = List.of(
                new Osoba("Ana", 25),
                new Osoba("Marko", 30),
                new Osoba("Ivan", 20)
        );

        // Sortiranje po dobi (ascending)
        List<Osoba> sortedByAge = osobe.stream().sorted(Comparator.comparing(Osoba::dob)).toList();

        // Sortiranje po dobi (descending)
        List<Osoba> sortedByAgeDesc = osobe.stream().sorted(Comparator.comparing(Osoba::dob).reversed()).toList();

        // Višekriterijsko sortiranje (prvo po dobi, pa po imenu)
        List<Osoba> multiSort = osobe.stream().sorted(Comparator.comparing(Osoba::dob).thenComparing(Osoba::ime)).toList();

        // Sortiranje stringova po duljini
        List<String> words = List.of("Java", "Python", "C", "JavaScript")
                .stream().sorted(Comparator.comparing(String::length)).toList();
    }
}
