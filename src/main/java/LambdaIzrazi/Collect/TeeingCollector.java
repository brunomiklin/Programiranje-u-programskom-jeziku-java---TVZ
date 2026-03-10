package LambdaIzrazi.Collect;

import java.util.stream.Collectors;
import java.util.stream.Stream;

// Kombinira rezultate dva collectora
record Statistics(double avg, long count) {}

public class TeeingCollector {
    static void main() {

        Statistics stats =  Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.teeing(Collectors.averagingInt(x->x),
                                            Collectors.counting(),
                                            Statistics::new));
    }
}
