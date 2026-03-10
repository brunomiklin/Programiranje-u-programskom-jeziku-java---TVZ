package Zbirke.collectionsMethods.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    static void main() {

        List<Student> studenti = new ArrayList<>(List.of(
                new Student("Ana", 4.5),
                new Student("Marko", 3.8),
                new Student("Ivana", 4.9),
                new Student("Petar", 3.8),
                new Student("Luka", 4.2)
        ));

        System.out.println("Početna lista:");
        System.out.println(studenti + "\n");


        // 1. SORT
        System.out.println("Nakon Collections.sort():");
        Collections.sort(studenti,Comparator.comparingDouble(Student::getProsjek)); // Collections.sort(studenti,null)
        System.out.println(studenti + "\n");

        // 2. SHUFFLE
        System.out.println("Nakon Collections.shuffle():");
        Collections.shuffle(studenti);
        System.out.println(studenti + "\n");

        // 3. REVERSE
        System.out.println("Nakon Collections.reverse():");
        Collections.reverse(studenti);
        System.out.println(studenti + "\n");


        // 4. Collections.min() i Collections.max()
        System.out.print("Min: " + Collections.min(studenti,Comparator.comparingDouble(Student::getProsjek)) + "\n");
        System.out.print("Max: " + Collections.max(studenti,Comparator.comparingDouble(Student::getProsjek)) +"\n");

        // 5. Collections.frequency()
        System.out.println("Collections.frequency() -> moraš imati equals() overridan");
        Student trazeni = new Student("Ivana", 4.9);
        System.out.println("\nFreqeuncy " + Collections.frequency(studenti,trazeni)); // Collections.frequency() koristi equals iz klase!! Bez njega rezultat bude uvijek null-a


        // 6. Collections.copy()
        List<Student> kopija = new ArrayList<>(Collections.nCopies(studenti.size(), new Student("Bruno",5.0)));
        //Collections.nCopies(studenti.size(), null) uzet ce velicinu definiranog polje i sve ce popunit s nulama
        System.out.println("\nNakon Collections.copy()");
        Collections.copy(studenti,kopija); // Collections.copy(dst,src);
        System.out.println(studenti);

        // 8️⃣ fill()
        Collections.fill(kopija, new Student("N/A", 0.0));
        System.out.println("\nNakon fill():");
        System.out.println(kopija);


    }
}
