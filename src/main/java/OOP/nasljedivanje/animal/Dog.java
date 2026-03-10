package OOP.nasljedivanje.animal;

public class Dog extends Animal {
    private String earShape;
    private String tailShape;


    public Dog(){}
    public Dog(String type,double weight){
        this(type,weight,"Perky","Curled");
    }
    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type,
                (weight<15? "small": (weight<35)?"medium":"large"),
                weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }


    @Override
    public void move(String speed) {
        super.move(speed); // zapravo radi isto što i move u nadklasi
        System.out.println("Dogs walk,run and wawe their tail");
    }


}
