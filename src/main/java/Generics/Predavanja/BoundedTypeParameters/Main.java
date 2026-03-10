package Generics.Predavanja.BoundedTypeParameters;

public class Main {
    static void main() {
        Calculator<Integer> intCalc = new Calculator<>();
        double result1 = intCalc.add(5, 10);  // 15.0

        Calculator<Double> doubleCalc = new Calculator<>();
        double result2 = doubleCalc.multiply(2.5, 4.0);  // 10.0

        //Calculator<String> stringCalc = new Calculator<>(); -> Ne radi je string nije podklasa Number-a
    }
}
