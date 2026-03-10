package Zbirke.Vježbe.ComparatorSucelje;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VišestrukoSortiranje {
    static void main() {
        // Kreiranje studenata
        Student prvi = new Student("Perić", "Pero", "0240293832", 4.11);
        Student drugi = new Student("Ivić", "Ivo", "0240212322", 4.11);
        Student treci = new Student("Markić", "Marko", "0240297890", 4.11);
        Student cetvrti = new Student("Horvat", "Ivan", "0240294345", 4.11);

        List<Student> listaStudenata = new ArrayList<>();
        listaStudenata.add(prvi);
        listaStudenata.add(drugi);
        listaStudenata.add(treci);
        listaStudenata.add(cetvrti);

        // Svi imaju isti prosjek - trebamo sortirat i po prezimenu!
        Comparator<Student> cmpPoProsjekuIPoPrezimenu = Comparator.comparing(Student::getProsjek).thenComparing(Student::getPrezime);
        listaStudenata.stream().sorted(cmpPoProsjekuIPoPrezimenu).forEach(System.out::println);
    }
}
