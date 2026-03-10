package LambdaIzrazi.Map.Kompleksnija;

import java.util.List;
import java.util.stream.Collectors;

public class TikTokPrimjer {
    static void main() {
        // Od liste imena do liste @usernames
        List<String> names = List.of("Ana", "Marko", "Ivana");


        List<String> usernames = names.stream().map(s->"@" + s.toLowerCase()).collect(Collectors.toList());

        // Rezultat: ["@ana", "@marko", "@ivana"]
    }
}
