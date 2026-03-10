package OOP.apstrakcija.animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        //Animal animal = new Animal("animal","big",100); -> nebreš instancirati klasu Animal
        Dog dog = new Dog("Wolf","Big",100);
        //  doAnimalStuff(dog);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Dog("GermanShepi","small",100));
        animalList.add(new Fish("GoldFish","extra small",2));
        animalList.add(dog);

        for (Animal animal:animalList){
            System.out.println(animal.getClass().getSimpleName());
           doAnimalStuff(animal);
            System.out.println();

        }


    }
    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("slow");
    }
}
