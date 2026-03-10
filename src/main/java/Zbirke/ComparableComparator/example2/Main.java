package Zbirke.ComparableComparator.example2;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    static void main() {
        /*
        Comparable -> int compareTo(Object o)
        Comprator -> int compare(T a, T b)
         */

        Comparator<Dog> c1 = (a,b)->a.getAge()-b.getAge();
        Comparator<Dog> c2 = Comparator.comparingInt(Dog::getAge).thenComparing(Dog::getName);
        Comparator<Dog> c3 = (a,b)->Integer.compare(a.getAge(),b.getAge());
        Comparator<Dog> c4 = (a,b)->a.getAge().compareTo(b.getAge());



        List<Dog> set = new ArrayList<>();

        set.add(new Dog("A",6));
        set.add(new Dog("D",2));
        set.add(new Dog("C",1));
        set.add(new Dog("A",6));





        set.stream().sorted((a,b)->a.getAge()-b.getAge());
        set.stream().sorted(Comparator.comparingInt(Dog::getAge));
        set.stream().sorted((a,b)->Integer.compare(a.getAge(),b.getAge()));




    }
}
