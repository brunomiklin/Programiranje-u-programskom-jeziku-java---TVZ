package OOP.polimorfizam.Car;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Staring a car engine.");
    }
    public void drive(){
        System.out.println("Putting a car in drive.");
    }
    protected void runEngine(){
        System.out.println("Cars engine is running");
    }
}
class GasPowerdCar extends Car{

    public GasPowerdCar(String description, double avgKmPerLitter, int cylinders) {
        super(description);
        this.avgKmPerLitter = avgKmPerLitter;
        this.cylinders = cylinders;
    }

    private double avgKmPerLitter;
    private int cylinders;

    @Override
    public void drive(){
        System.out.println(this.getClass().getSimpleName() + " car drives and consume " + avgKmPerLitter);
    }

    @Override
    public void startEngine(){
        System.out.println("Staring all of the " + cylinders + " cylinders.");
    }

}
class ElectricCar extends Car{
    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    private double avgKmPerCharge;
    private int batterySize;

    @Override
    public void drive(){
        System.out.println( this.getClass().getSimpleName() + " car drives and consume " + avgKmPerCharge);
    }
    @Override
    public void startEngine(){
        System.out.println("Staring all of the " + batterySize + " bateries.");
    }


}
class HybrideCar extends Car{
    private double avgKmPerLitter;
    private int batterySize;
    private int cylinders;

    public HybrideCar(String description, double avgKmPerLitter, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitter = avgKmPerLitter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void drive(){
        System.out.println(this.getClass().getSimpleName() + " car drives and consume " + avgKmPerLitter);
    }

    @Override
    public void startEngine(){
        System.out.println("Staring all of the " + cylinders + " cylinders.");
    }


}

