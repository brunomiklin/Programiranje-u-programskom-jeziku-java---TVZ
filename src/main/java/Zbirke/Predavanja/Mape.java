package Zbirke.Predavanja;
import java.util.HashMap;
import java.util.Map;

public class Mape {
    static void main() {
        Map<String,Integer> brojStudenta = new HashMap<>();
        brojStudenta.put("FER",1500);
        brojStudenta.put("PMF",1200);
        brojStudenta.put("TVZ",800);

        // Dohvaćanje vrijednosti
        Integer tvzStudenti = brojStudenta.get("TVZ"); // 800
        System.out.println(tvzStudenti);

        // Iteracija kroz sve parove
        for(String fakultet:brojStudenta.keySet()){
            System.out.println(fakultet + " " + brojStudenta.get(fakultet));
        }
    }
}
