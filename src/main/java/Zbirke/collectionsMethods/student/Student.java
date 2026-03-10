package Zbirke.collectionsMethods.student;

import java.util.Objects;

public class Student  {
    private String ime;
    private double prosjek;

    public Student(String ime, double prosjek) {
        this.ime = ime;
        this.prosjek = prosjek;
    }

    public String getIme() {
        return ime;
    }

    public double getProsjek() {
        return prosjek;
    }

//    // Prirodni poredak: po prosjeku
//    @Override
//    public int compareTo(Student other) {
//        return Double.compare(this.prosjek, other.prosjek);
//    }
//
    @Override
    public String toString() {
        return ime + " (" + prosjek + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Double.compare(student.prosjek, prosjek) == 0 &&
                Objects.equals(ime, student.ime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ime, prosjek);
    }
}

