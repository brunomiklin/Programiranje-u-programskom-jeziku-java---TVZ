package OOP.apstrakcija.animal;

public abstract class Mamal extends Animal {

    public Mamal(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

    }

    @Override
    public void makeNoise() {

    }
}
