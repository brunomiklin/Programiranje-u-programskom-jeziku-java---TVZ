package OOP.interfaces.letenje;

public class Interfaces {
    static void main() {

        Letece letece = new Zivotinja();
        Plivajuce plivajuce = (Plivajuce) letece;
        plivajuce.pliva();


    }
}
