package Zbirke.Vježbe.ComparatorSucelje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    static void main() {
        // Lambda izraz
        List<Student> studenti = new ArrayList<>();

        studenti.add(new Student("Horvat", "Ivan", "001", 4.25));
        studenti.add(new Student("Kovač", "Ana", "002", 4.80));
        studenti.add(new Student("Babić", "Marko", "003", 3.90));
        studenti.add(new Student("Marić", "Lucija", "004", 4.50));
        studenti.add(new Student("Novak", "Petra", "005", 5.00));
        studenti.add(new Student("Radić", "Luka", "006", 3.65));


        // Lambda izraz
        //Collections.sort(studenti,(a,b)->a.getProsjek().compareTo(b.getProsjek()));
        Collections.sort(studenti,(a,b)->Double.compare(a.getProsjek(),b.getProsjek()));

        // Još bolje - Comparator.comparing()
        Collections.sort(studenti, Comparator.comparingDouble(Student::getProsjek)); // ovo tu je NAJBOLJE!

    }
}
