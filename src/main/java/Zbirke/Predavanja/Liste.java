package Zbirke.Predavanja;

import java.util.ArrayList;
import java.util.List;

public class Liste {
    static void main() {
        // Diamond operator (<>) - od Java 7
        List<String> godisnjaDoba = new ArrayList<>();

        // Dodavanje elemenata
        godisnjaDoba.add("Proljeće");
        godisnjaDoba.add("Ljeto");
        godisnjaDoba.add("Jesen");
        godisnjaDoba.add("Zima");

        // For-each petlja (od Java 5)
        for(String doba:godisnjaDoba){
            System.out.println(doba);
        }

        // Dohvaćanje elementa po indeksu
        String prvo = godisnjaDoba.get(0); // 'Proljeće'
    }
}
