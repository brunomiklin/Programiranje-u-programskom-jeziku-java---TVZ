package KlaseIObjekti.staticVariable;

public class Main {
    static void main() {
        Dog dog = new Dog("luna");
        Dog dog2 = new Dog("mirko");

        System.out.println(dog.getName()); // mirko
        System.out.println(dog2.getName()); // mirko
    }
}
