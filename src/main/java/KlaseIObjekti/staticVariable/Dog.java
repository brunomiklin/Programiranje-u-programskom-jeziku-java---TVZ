package KlaseIObjekti.staticVariable;

public class Dog {
    private static String name;
    private String ime;
    public Dog(String name){
        Dog.name = name;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Dog.name = name;
    }
}
