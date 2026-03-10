package Zbirke.Vježbe.CollectorsGroupingBy;



import Zbirke.Vježbe.ComparatorSucelje.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {
    static void main() {
        Student prvi = new Student("Perić", "Pero", "0240293832", 4.11);
        Student drugi = new Student("Ivić", "Ivo", "0240212322", 3.82);
        Student treci = new Student("Markić", "Marko", "0240297890", 4.78);
        Student cetvrti = new Student("Horvat", "Ivan", "0240294345", 3.05);

        List<Student> listaStudenata = new ArrayList<>();
        listaStudenata.add(prvi);
        listaStudenata.add(drugi);
        listaStudenata.add(treci);
        listaStudenata.add(cetvrti);

        // Grupiraj studente po prosjeku (cijeli broj)
        Map<Integer,List<Student>> studentiPoProsjeku =
                listaStudenata.stream().collect(Collectors.groupingBy(s->(int)s.getProsjek()));

        // Ispiši grupe
        studentiPoProsjeku.forEach((k,v)->{
            System.out.println("Prosjek " + k + " -> " + v);
        });

        // Broj studenata po prosjeku
        Map<Integer,Long> brojPoProsjeku = listaStudenata.stream()
                .collect(Collectors.groupingBy(x->(int)x.getProsjek(),Collectors.counting()));
        System.out.println(brojPoProsjeku);
    }
}
