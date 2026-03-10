package Zbirke.pregledCollectionInterfacea;

import com.sun.source.util.Trees;

import java.util.*;

public class Main {
    static void main() {
        Collection<String> list = new HashSet<>();
        String[] names = {"Anna","Bob","Carol","David","Edna"};
        list.addAll(Arrays.asList(names));
        System.out.println(list);

        list.add("Fred");
        list.addAll(Arrays.asList("George","Gary","Grace"));
        System.out.println(list);

        list.removeIf(s->s.charAt(0)=='G');
        System.out.println("Gary in the list? " + list.contains("Gary"));


    }
}
