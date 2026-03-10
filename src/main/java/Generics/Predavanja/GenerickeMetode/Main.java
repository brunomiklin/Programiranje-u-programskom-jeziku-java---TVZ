package Generics.Predavanja.GenerickeMetode;

public class Main {
    static void main() {
        // Korištenje - radi za sve tipove!
        Integer[] numbers = {1, 2, 3, 4, 5};
        printArray(numbers);  // Output: 1 2 3 4 5

        String[] names = {"Ana", "Marko", "Ivana"};
        printArray(names);  // Output: Ana Marko Ivana

        Double[] prices = {19.99, 29.99, 39.99};
        printArray(prices);  // Output: 19.99 29.99 39.99
    }

    public static <T> void printArray(T[] array){
        for(T x:array){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
