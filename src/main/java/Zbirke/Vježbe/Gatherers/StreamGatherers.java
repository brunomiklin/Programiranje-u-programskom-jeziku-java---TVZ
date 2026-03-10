package Zbirke.Vježbe.Gatherers;

import Zbirke.Vježbe.Enumeracije.Zupanija;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Gatherers;

public class StreamGatherers {
    static void main() {
        // Grupiranje županija u grupe od po 5 (regije)
        List<List<Zupanija>> grupiranePo5 = Arrays.asList(Zupanija.values()).stream().gather(Gatherers.windowFixed(5)).toList();

        // Ispis zivotinja
        int regionIndex = 1;
        for (List<Zupanija> zupanijaList:grupiranePo5){
            System.out.println(regionIndex++ + " " + zupanijaList);
        }
    }
}
