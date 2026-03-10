package Generics.Course.example4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        Integer five = 5;
        Integer[] others = {0,5,10,-50,50};

        for (Integer i:others){
            int val = five.compareTo(i);
            System.out.printf("%d %s %d: compareTo=%d%n",five,
                    (val==0?"==":(val<0)?"<":">"),i,val);
        }


        String banana = "banana";
        String[] fruit = {"apple","banana","pear","BANANA"};



        for (String i:fruit){
            int val = banana.compareTo(i);
            System.out.printf("%s %s %s: compareTo=%d%n",banana,
                    (val==0?"==":(val<0)?"<":">"),i,val);
        }

        Student bruno = new Student("Bruno");
        Student leda = new Student("Leda");

        List<Student> student = new ArrayList<>(
               List.of( new Student("Bruno"),
                       new Student("Leda"))
        );

        System.out.println("result = " + bruno.compareTo(new Student("BRUNO")));

    }
}
