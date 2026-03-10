package OOP.nasljedivanje.animal;

public class Main {
    static void main() {

        //Animal animal = new Animal("Generic Animal","Huge",400);
        //doAnimallStuff(animal,"slow");


        //Dog dog = new Dog();
        //doAnimallStuff(dog,"fast"); // možemo predati Dog kao animal jer smo sigurni da pas ima sve kao Animal jer je nasljedio sve

        Dog yorkie = new Dog("yorkei",15);
        doAnimallStuff(yorkie,"fast");
        Dog retrivier = new Dog("Labrador retrivier",65,"Floppy","Swimmer");
        doAnimallStuff(retrivier,"slow");
    }
    public static void doAnimallStuff(Animal animal, String speed){
            animal.makeNoise();
            animal.move(speed);
             System.out.println(animal);
        System.out.println("____________");
    }
}
