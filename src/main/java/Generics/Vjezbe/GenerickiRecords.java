package Generics.Vjezbe;

// Jednostavna definicija generičkog record-a
record Par<T,U>(T prvi,U drugi){}
    // Automatski generirani konstruktor, getteri, toString, equals, hashCode

public class GenerickiRecords {
    static void main() {
        Par<String, Integer> student = new Par<>("Ana", 20);
        System.out.println(student.prvi());   // Ana
        System.out.println(student.drugi());  // 20

        Par<Double, Double> koordinate = new Par<>(45.8, 15.9);
        System.out.println(koordinate); // Par[prvi=45.8, drugi=15.9]
    }
}
