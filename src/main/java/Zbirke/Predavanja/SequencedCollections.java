package Zbirke.Predavanja;

import java.util.ArrayList;
import java.util.List;

public class SequencedCollections {
    static void main() {
        // Lista sada ima konzistentan API
        List<String> lista = new ArrayList<>();
        lista.addFirst("Prvi");    // Dodaj na početak
        lista.addFirst("Drugi");   // Dodaj na kraj

        String prvi = lista.getFirst();
        String zadnji = lista.getLast();

        // Obrnuti redoslijed - nova mogućnost!
        List<String> obrnuto = lista.reversed();


    }
}
