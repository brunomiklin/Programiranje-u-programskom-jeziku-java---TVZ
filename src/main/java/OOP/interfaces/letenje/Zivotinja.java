package OOP.interfaces.letenje;

public class Zivotinja implements Letece,Plivajuce{

    @Override
    public void leti() {
        System.out.println("Letenje!");
    }

    @Override
    public void pliva() {
        System.out.println("Plivanje!");

    }
}
