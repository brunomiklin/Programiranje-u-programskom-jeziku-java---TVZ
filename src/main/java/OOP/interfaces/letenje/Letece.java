package OOP.interfaces.letenje;

public interface Letece {
    void leti();
    default void metoda(){
        System.out.println("ide leteci defaultic!");
    }
}
