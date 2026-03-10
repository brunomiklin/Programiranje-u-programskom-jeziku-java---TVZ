package KlaseIObjekti.enhancedSwitch;

public class Example2 {
    static void main() {
        System.out.println(vratiKvaratlGodine("SRPANJ"));
    }
    public static String vratiKvaratlGodine(String mjesec){
            return switch (mjesec){
            case "SIJEČAN","VELJAČA","OŽUJAK" -> "Prvi";
            case "TRAVANJ","SVIBANJ","LIPANJ" -> "Drugi";
            case "SRPANJ","KOLOVOZ","RUJAN"-> "Treći";
            case "LISTOPAD","STUDENI","PROSINAC"->"Četvrti";
            default -> {
                String losOdgvor = mjesec + " je krivo unesen";
                yield  losOdgvor;
            }
        };
    }
}
