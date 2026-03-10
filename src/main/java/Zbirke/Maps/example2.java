package Zbirke.Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class example2 {
    static void main() {
        Map<Integer,String> m1 = new LinkedHashMap<>();
        // keys are unique

        m1.put(10,"ABC");
        m1.put(20,"QWE");
        m1.put(10,"WWW"); // Ovo će tu overridati postojuću vrijednost
        m1.put(30,"ABC");
        // m1.put(null,null);  i key i value mogu biti NULL

        // m1.forEach((k,v)-> System.out.println(k + " " + v));
        System.out.println(m1); // It does implement toString() method


    }
}
