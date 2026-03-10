package Generics.Vjezbe;

import java.util.ArrayList;
import java.util.List;


public class PrijeiPoslijeGenerics {
    static void main() {
        // ❌ Bez Generics (stari način):
        List list = new ArrayList();
        list.add("Tekst");
        list.add(123); // Kompajler dopušta

        String str = (String) list.get(0);
        //String num = (String) list.get(1); // ClassCastException

        //✅ Sa Generics (moderni način):
        List<String> list2 = new ArrayList<>();
        list2.add("Tekst");
        //list2.add(123); // Kompajlerska greška - tzv. TypeSafety

        // Greške se hvataju u vrijeme kompilacije, a ne izvođenja!

    }
}
