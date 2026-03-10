package LambdaIzrazi.ModerneLambdaUJava1725;

import java.util.Comparator;
import java.util.List;

record Student(String ime,int bodovi){}

public class RecordsLambdaIzrazi {
    static void main() {
        List<Student> studenti = List.of(
                new Student("Ana", 95),
                new Student("Ivan", 87),
                new Student("Marko", 92)
        );

        // Sortiranje pomoću lambde
        studenti.stream().sorted(Comparator.comparingInt(Student::bodovi)).forEach(s -> System.out.println(
                s.ime() + ": " + s.bodovi()));
                //studenti.stream().sorted((a,b)->a.bodovi()-b.bodovi());
                //studenti.stream().sorted((a,b)->Integer.compare(a.bodovi(), b.bodovi()));

    }
}
