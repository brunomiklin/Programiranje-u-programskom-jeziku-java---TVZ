package Zbirke.Vježbe.ComparatorSucelje;

import java.util.Comparator;

public class KompleksniPrimjer {
    static void main() {
        // Kompleksni primjer
        Comparator<Student> kompleksni = Comparator.comparing(Student::getProsjek).reversed() // silazno po prosjeku
                .thenComparing(Student::getPrezime) // uzlazno po prezimenu
                .thenComparing(Student::getIme);// uzlazno po imenu
    }
}
