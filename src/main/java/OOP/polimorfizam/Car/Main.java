package OOP.polimorfizam.Car;

public class Main {
    static void main() {
        Car car = new Car("2022 Blue ferrari");
        runRace(car);

        Car ferrari = new GasPowerdCar("2026 Blue Ferarri",15.4,6);
        runRace(ferrari);
    }
    public static void runRace(Car c){
        c.startEngine();
        c.drive();
    }
}
