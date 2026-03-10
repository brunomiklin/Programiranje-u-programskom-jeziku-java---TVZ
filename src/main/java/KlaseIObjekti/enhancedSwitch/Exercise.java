package KlaseIObjekti.enhancedSwitch;

public class Exercise {


    static void main() {
        System.out.println(ispisiDanUTjednu(0));


    }
    public static String ispisiDanUTjednu(Integer number){
        return switch (number){
            case 0 -> "Ponedjeljak";
            case 1 -> "Utorak";
            case 2 -> "Srijeda";
            case 3 -> "Četvrtak";
            case 4 -> "Petak";
            case 5 -> "Subota";
            case 6 -> "Nedelja";
            default -> "Ivalid unos";
        };
    }

}
