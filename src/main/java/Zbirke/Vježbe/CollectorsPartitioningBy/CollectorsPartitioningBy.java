package Zbirke.Vježbe.CollectorsPartitioningBy;

import Zbirke.Vježbe.ComparatorSucelje.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsPartitioningBy {
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

        // Particioniraj studente - odlikaši vs ostali
        Map<Boolean,List<Student>> particionirano = listaStudenata.stream().collect(Collectors.groupingBy(x->x.getProsjek()>=4.50));

        for(Boolean paricija:particionirano.keySet()){

            if(paricija){
                System.out.println("Odlikaši: " + particionirano.get(paricija));
            }
            else {
                System.out.println("Ostali: " + particionirano.get(paricija));
            }
        }
    }
}
