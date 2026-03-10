package Zbirke.Vježbe.ComparatorSucelje;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetComparator {
    static void main() {
        // Kreiranje studenata
        Student prvi = new Student("Perić", "Pero", "0240293832", 4.11);
        Student drugi = new Student("Ivić", "Ivo", "0240212322", 3.82);
        Student treci = new Student("Markić", "Marko", "0240297890", 4.78);
        Student cetvrti = new Student("Horvat", "Ivan", "0240294345", 3.05);

        SortedSet<Student> setStudenata = new TreeSet<>(Comparator.comparingDouble(Student::getProsjek));

        setStudenata.add(prvi);
        setStudenata.add(drugi);
        setStudenata.add(treci);
        setStudenata.add(cetvrti);

        System.out.println("Najbolji: " + setStudenata.last());
        System.out.println("Najgori: " + setStudenata.first());
    }
}
