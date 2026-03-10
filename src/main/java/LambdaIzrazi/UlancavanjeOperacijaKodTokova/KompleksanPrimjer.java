package LambdaIzrazi.UlancavanjeOperacijaKodTokova;

import java.util.Comparator;
import java.util.List;

record Proizvod(String naziv, double cijena, String kategorija) {}

public class KompleksanPrimjer {
    static void main() {
        List<Proizvod> proizvodi = List.of(
                new Proizvod("Laptop", 5000.0, "Elektronika"),
                new Proizvod("Miš", 150.0, "Elektronika"),
                new Proizvod("Stol", 800.0, "Namještaj"),
                new Proizvod("Stolica", 600.0, "Namještaj"));

        // Pronađi sve proizvode iz kategorije "Elektronika"
        // čija je cijena veća od 1000 kn, sortiraj ih po cijeni
        // i vrati njihove nazive

        List<String> skupiElektronickiProizvodi = proizvodi.stream()
                .filter(p->p.kategorija().equals("Elektronika"))
                .filter(p->p.cijena()>1000)
                .sorted(Comparator.comparingDouble(Proizvod::cijena).reversed())
                .map(Proizvod::naziv)
                .toList();

        // Rezultat: ["Laptop"]
    }
}
