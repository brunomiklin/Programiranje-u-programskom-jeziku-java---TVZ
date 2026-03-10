package OOP.builderpattern;

public class Main {
    static void main() {
        // Kreiranje studenta s SVIM podacima
        Student student1 = new Student.StudentBuilder(
                "12345678910", "Horvat", "Ivan"
        )
                .email("ivan.horvat@foi.hr")
                .mobitel("098-123-4567")
                .grad("Zagreb")
                .prosjek(4.5)
                .build();
    }
}
