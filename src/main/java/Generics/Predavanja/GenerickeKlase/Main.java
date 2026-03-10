package Generics.Predavanja.GenerickeKlase;

record User(String ime){}
public class Main {
    static void main() {
        Box<String> stringBox = new Box<>("Hello Generics!");
        String text = stringBox.getContent();  // Bez castinga!

        Box<Integer> numberBox = new Box<>(42);
        Integer num = numberBox.getContent();  // Type-safe!

        Box<User> userBox = new Box<>(new User("Ana"));
        User user = userBox.getContent();  // Odlično!
    }
}
