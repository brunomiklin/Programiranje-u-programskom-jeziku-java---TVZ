package Zbirke.Predavanja;

import java.util.List;
import java.util.stream.Gatherers;

public class StreamGatherers {

    static void main() {

        // .gather() nije završna operacija nakon nje mora ići .toList()

        List<Integer> brojevi = List.of(1, 2, 3, 4, 5, 6, 7);

        // Podjela u grupe od po 3 elementa
        List<List<Integer>> grupeOd3 = brojevi.stream().gather(Gatherers.windowFixed(3)).toList();
        // [[1, 2, 3], [4, 5, 6], [7]]

        // Klizni prozor veličine 2
        List<List<Integer>> klizniPo2 = brojevi.stream().gather(Gatherers.windowSliding(2)).toList();
       // [[1, 2], [2, 3], [3, 4], [4, 5], [5, 6], [6, 7]]

        // Konkurentna transformacija (max 3 paralelna)
        List<String> rezultati = brojevi.stream().gather(Gatherers.mapConcurrent(3,n-> "Obrađeno: " + n)).toList();

    }


}
