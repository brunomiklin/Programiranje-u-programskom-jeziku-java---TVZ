package Zbirke.arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayAndArrayLists {
    static void main() {
        String[] orginalArray = new String[]{"First","Second","Third"};
        List<String> orginaList = Arrays.asList(orginalArray); // Arrays.asList() također kao List.of() vraća tip tipa List<>
                                                            // svaka promjena na orginalList promjenit ce i orginalArray
                                                            // ali to je samo kod ovak direktno inicjaliziranje ne vrijedi za .addAll()

        orginaList.set(0,"one");
        System.out.println("LIST: " + orginaList);
        System.out.println("ARRAY: " + Arrays.toString(orginalArray));

        orginaList.sort(Comparator.naturalOrder());
        System.out.println("LIST: " + orginaList);
        System.out.println("ARRAY: " + Arrays.toString(orginalArray));

        //orginaList.remove(0); UnsupportedOperationException jer je vezana za Array, a kod Array-a ovo nije dozvoljeno!!
        //orginaList.add("Fourth"); UnsupportedOpertationExceptio jer je vezana za Array, a kod Array-a ne možeš mjenjati fiksnu veličinu

        // -> zato Arrays.asList() stvara ImmutableCollection!!!!
    }
}
