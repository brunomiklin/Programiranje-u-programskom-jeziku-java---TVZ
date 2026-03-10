package LambdaIzrazi.MinMax;

import java.util.Comparator;
import java.util.List;

public class PronalaženjeMinimalnogElementa {
    static void main() {

        List<Track> tracks = List.of(
                new Track("Track A", 3.45),
                new Track("Track B", 5.12),
                new Track("Track C", 2.78),
                new Track("Track D", 4.01)
        );

        Track shortestTrack = tracks.stream().min(Comparator.comparing(track -> track.length())).get();

        // Ili kraće s method reference:
        Track shortestTrack2 = tracks.stream().min(Comparator.comparing(Track::length)).get();



    }
}
