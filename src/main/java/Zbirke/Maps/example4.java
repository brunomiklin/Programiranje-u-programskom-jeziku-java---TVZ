package Zbirke.Maps;

import java.util.TreeMap;

public class example4 {
    static void main() {
        var m1 = new TreeMap<Cat,String>();
        m1.put(new Cat(10),"Tom"); // tu pukne jer klasa Cat nema Comparable
        m1.put(new Cat(15),"Leo");

        System.out.println(m1);
    }
}
