package LambdaIzrazi.flatMap;

import java.util.Arrays;
import java.util.List;

public class PraktičniPrimjeriFlatMapa {
    static void main() {
        // Dobivanje svih riječi iz liste rečenica
        List<String> sentences = List.of(
                "Java je programski jezik",
                "Lambda izrazi su korisni"
        );

        List<String> words = sentences.stream().flatMap(sentence-> Arrays.stream(sentence.split(" "))).toList();

        // Rezultat: ["Java", "je", "programski", "jezik",
        //           "Lambda", "izrazi", "su", "korisni"]


        // Dobivanje svih kolegija svih studenata
        record Student(String name, List<String> courses) {}
        List<Student> students = List.of(
                new Student("Ana", List.of("Java", "Python")),
                new Student("Ivan", List.of("C++", "Java"))
        );


        List<String> allCourses = students.stream().flatMap(s->s.courses.stream())
                .distinct()
                .toList();

        // Rezultat: ["Java", "Python", "C++"]
    }
}
