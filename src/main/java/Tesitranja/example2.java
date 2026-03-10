package Tesitranja;

import java.util.Collections;
import java.util.List;

public class example2 {
    static void main() {
        List<Integer> brojevi = List.of(5, 2, 8, 1, 9);
        // List.of() ne dopušta null vrijednosti!!
        Collections.sort(brojevi); // Ovo je nemoguće sortirati jer je List.of() immutable
        System.out.println(brojevi);
    }
}
