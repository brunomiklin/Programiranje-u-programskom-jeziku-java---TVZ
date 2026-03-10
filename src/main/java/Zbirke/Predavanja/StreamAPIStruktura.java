package Zbirke.Predavanja;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Student{
    String ime;
    int ocejan;

    public Student(String ime, int ocejan) {
        this.ime = ime;
        this.ocejan = ocejan;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getOcejan() {
        return ocejan;
    }

    public void setOcejan(int ocejan) {
        this.ocejan = ocejan;
    }
}
public class StreamAPIStruktura {
    static void main() {

        List<Student> studenti = Arrays.asList(
                new Student("Ana", 5),
                new Student("Marko", 3),
                new Student("Ivana", 4)
        );

        // Pronađi imena studenata s ocjenom 5
        List<String> imenaOdlikasa = studenti.stream().filter(x->x.getOcejan()==5).map(Student::getIme).collect(Collectors.toList());
        System.out.println(imenaOdlikasa);


    }
}
