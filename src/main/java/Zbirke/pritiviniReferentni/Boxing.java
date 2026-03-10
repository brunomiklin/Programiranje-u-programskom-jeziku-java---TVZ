package Zbirke.pritiviniReferentni;

public class Boxing {
    static void main() {
        Integer x1 = Integer.valueOf(15);
        Integer x2 = new Integer(15);
        Integer x3 = 15; // autoboxing
        int y1 = x3.intValue();
        int y2 = x3;
    }
}
