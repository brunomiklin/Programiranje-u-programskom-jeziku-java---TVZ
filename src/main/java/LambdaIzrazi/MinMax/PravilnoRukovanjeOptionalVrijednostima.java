package LambdaIzrazi.MinMax;

import java.util.Comparator;
import java.util.List;

public class PravilnoRukovanjeOptionalVrijednostima {
    static void main() {
        List<Track> tracks = List.of(
                new Track("Track A", 3.45),
                new Track("Track B", 5.12),
                new Track("Track C", 2.78),
                new Track("Track D", 4.01)
        );

        // ❌ OPASNO - baca exception ako je stream prazan
        tracks.stream().min(Comparator.comparingDouble(Track::length)).get();

        // ✅ SIGURNO - koristi orElse
        tracks.stream().min(Comparator.comparingDouble(Track::length)).orElse(null);

        // ✅ NAJBOLJE - koristi ifPresent
        tracks.stream().min(Comparator.comparingDouble(Track::length)).ifPresent(track -> System.out.println("Najkrači "  + track));

        // ✅ MODERNO - orElseThrow (Java 10+)
        tracks.stream().min(Comparator.comparingDouble(Track::length)).orElseThrow(()-> new RuntimeException("nema ti toga tu"));

        // .get();
        // .orElse();
        // .ifPresent() -> Consumer<T>
        // .orElseThrow() -> Supplier<T>


    }
}
