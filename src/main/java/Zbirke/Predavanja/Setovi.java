package Zbirke.Predavanja;

import java.util.HashSet;
import java.util.Set;

public class Setovi {
    static void main() {
        Set<String> jedinstvenaImena = new HashSet<>();

        jedinstvenaImena.add("Ana");
        jedinstvenaImena.add("Marko");
        jedinstvenaImena.add("Ana"); // Neće se dodati

        System.out.println(jedinstvenaImena.size()); // 2

    }
}
