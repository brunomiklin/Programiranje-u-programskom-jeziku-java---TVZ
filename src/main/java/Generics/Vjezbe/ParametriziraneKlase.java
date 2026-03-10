package Generics.Vjezbe;

public class ParametriziraneKlase {
    static void main() {
        Kutija<String> kutijaZaTekst = new Kutija<>();
        kutijaZaTekst.postavi("Java Generics");

        Kutija<Integer> kutijaZaBroj = new Kutija<>();
        kutijaZaBroj.postavi(42);
    }
}
