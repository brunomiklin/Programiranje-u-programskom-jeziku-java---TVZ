package Tesitranja;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

record Student(String ime, double prosjek, double score) {

    public double getProsjek() {
        return prosjek;
    }

    public double getScore() {
        return score;
    }
}
public class example7 {
    static void main() {
        List<Student> studenti = new ArrayList<>();

        studenti.add(new Student("Ana", 8.7, 85.5));
        studenti.add(new Student("Marko", 9.3, 91.2));
        studenti.add(new Student("Ivana", 7.9, 74.8));
        studenti.add(new Student("Petar", 8.7, 88.0));
        studenti.add(new Student("Luka", 6.5, 60.3));
        studenti.add(new Student("Maja", 9.8, 97.4));

        //Comparator<Student> c = ((s1,s2)->s1.getProsjek()-s2.getProsjek())
        // komaprator na kraju traći Integer

    }
}
