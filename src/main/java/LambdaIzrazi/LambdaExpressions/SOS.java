package LambdaIzrazi.LambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class SOS {
    static void main() {
        List<String> list = List.of("alpha","bravo","charlie","delta");
        List<String> modificiranaLista = new ArrayList<>(List.of("alpha","bravo","charlie","delta"));

        for (String s:list){
            System.out.println(s);
        }

        System.out.println("------------------");
        list.forEach( myString-> System.out.println(myString));

        System.out.println("------------------");
        String prefix = "nato"; // mogu ju korisiti untar lambde tako dugo dok ne napravim nekakvu promjenu na varijabli
                                // znači ona mora biti final ili effectivley final

        list.forEach((var myString)->{
            char first = myString.charAt(0);
            System.out.println(prefix + " " + myString + " znači " + first);
        });
        // prefix = "lolac";  -> ne smiješ mijenjati varijablu koju si prethodno koristio unutar Lambde
        // System.out.println(myString); --> ne radi jer je moja varijabla dozvoljena samo unutar Lambda scope-a



        modificiranaLista.removeIf(s->s.equals("bravo")); // prima Predicat<T>
        System.out.println(modificiranaLista);

        List<String> listica = new ArrayList<>(List.of("echo","easy","earnest"));
        listica.removeIf(s->s.startsWith("ea"));
        System.out.println(listica);
    }
}
