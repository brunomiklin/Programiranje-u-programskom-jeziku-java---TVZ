package OOP.apstrakcija.animal;

public class Fish extends Animal{

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println(getExplicitType() + " pliva brzinom " + speed);
    }

    @Override
    public void makeNoise() {
        System.out.println("Glup glup");
    }
}
